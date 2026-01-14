# 🔒 Meccanismi di Sicurezza nel CI/CD

## Panoramica

Questo documento descrive tutti i meccanismi di sicurezza implementati nel processo CI/CD del progetto e-commerce per garantire che il codice sia sicuro, privo di vulnerabilità note e conforme alle best practice di sicurezza.

---

## 📋 Indice

1. [Meccanismi Implementati](#meccanismi-implementati)
2. [Workflow GitHub Actions](#workflow-github-actions)
3. [Plugin Maven](#plugin-maven)
4. [Come Eseguire i Controlli](#come-eseguire-i-controlli)
5. [Interpretazione dei Risultati](#interpretazione-dei-risultati)
6. [Best Practice](#best-practice)

---

## 🛡️ Meccanismi Implementati

### 1. **OWASP Dependency Check** 
**Scopo:** Identificare vulnerabilità note nelle dipendenze del progetto.

- **Tipo:** Dependency Vulnerability Scanning
- **Strumento:** OWASP Dependency-Check Maven Plugin
- **Soglia di fallimento:** CVSS >= 7 (vulnerabilità alte e critiche)
- **Formato output:** HTML, XML, JSON, SARIF
- **Frequenza:** Ad ogni push/PR + ogni lunedì alle 2 AM

**Cosa controlla:**
- Dipendenze dirette e transitive
- CVE (Common Vulnerabilities and Exposures) noti
- Vulnerabilità nel National Vulnerability Database (NVD)

### 2. **SpotBugs + FindSecBugs**
**Scopo:** Static Application Security Testing (SAST) per identificare bug e vulnerabilità nel codice Java.

- **Tipo:** SAST (Static Analysis Security Testing)
- **Strumento:** SpotBugs con plugin FindSecBugs
- **Livello:** Max effort, Low threshold
- **Focus:** Pattern di sicurezza, bug comuni, code smells

**Cosa controlla:**
- SQL Injection vulnerabilities
- Cross-Site Scripting (XSS)
- Insecure cryptographic practices
- Path traversal vulnerabilities
- Command injection
- Hardcoded passwords/secrets
- Insecure random number generation
- XML External Entity (XXE) vulnerabilities

### 3. **Secret Scanning con Gitleaks**
**Scopo:** Rilevare credenziali, token e segreti accidentalmente committati nel repository.

- **Tipo:** Secret Detection
- **Strumento:** Gitleaks
- **Scope:** Intera cronologia Git
- **Pattern:** API keys, passwords, tokens, private keys

**Cosa controlla:**
- API keys (AWS, Azure, Google Cloud, etc.)
- Database credentials
- Private SSH/SSL keys
- JWT tokens
- OAuth tokens
- Slack tokens
- Generic secret patterns

### 4. **CodeQL Analysis**
**Scopo:** Analisi semantica avanzata del codice per vulnerabilità di sicurezza.

- **Tipo:** SAST avanzato
- **Strumento:** GitHub CodeQL
- **Queries:** security-and-quality
- **Linguaggio:** Java

**Cosa controlla:**
- Injection flaws (SQL, Command, etc.)
- Security misconfigurations
- Sensitive data exposure
- Broken access control
- Authentication/authorization issues
- Cryptographic failures
- Code quality issues

### 5. **Docker Image Scanning con Trivy**
**Scopo:** Scansione di vulnerabilità nell'immagine Docker.

- **Tipo:** Container Security Scanning
- **Strumento:** Aqua Trivy
- **Severity:** CRITICAL, HIGH
- **Target:** OS packages, application dependencies

**Cosa controlla:**
- Vulnerabilità nei layer dell'immagine Docker
- Vulnerabilità nelle librerie del sistema operativo
- Misconfigurazioni del container
- Dipendenze vulnerabili nell'immagine

### 6. **Maven Enforcer Plugin**
**Scopo:** Applicare regole di sicurezza sulle dipendenze.

- **Tipo:** Dependency Policy Enforcement
- **Regole:**
  - Versioni minime di Maven e Java
  - Ban di dipendenze vulnerabili note (es. Log4j < 2.17.1)
  - Convergenza delle dipendenze

---

## ⚙️ Workflow GitHub Actions

### Workflow Security (`security.yml`)

**Trigger:**
- Push su branch `main` o `develop`
- Pull Request su branch `main` o `develop`
- Schedulato: ogni lunedì alle 2 AM (UTC)

**Job:**

1. **dependency-check**
   - Esegue OWASP Dependency Check
   - Carica report HTML e SARIF
   - Pubblica risultati nella Security tab di GitHub

2. **spotbugs-analysis**
   - Compila il codice
   - Esegue SpotBugs con FindSecBugs
   - Carica report XML

3. **secret-scanning**
   - Scansiona l'intera cronologia Git
   - Rileva credenziali e segreti
   - Blocca il workflow se trova segreti

4. **codeql-analysis**
   - Inizializza CodeQL per Java
   - Compila il progetto
   - Esegue analisi semantica
   - Pubblica risultati nella Security tab

5. **docker-security**
   - Costruisce l'immagine Docker
   - Scansiona con Trivy
   - Carica report SARIF e HTML

6. **security-summary**
   - Crea un riepilogo di tutti i controlli
   - Posta un commento sulla PR con i risultati

### Workflow CI (`ci.yml`)

**Integrazione Sicurezza:**
- Esegue SpotBugs dopo i test
- Valida le dipendenze con Maven Enforcer
- Carica report di coverage per audit

---

## 🔧 Plugin Maven

### Nel `pom.xml`

```xml
<!-- OWASP Dependency Check -->
<plugin>
    <groupId>org.owasp</groupId>
    <artifactId>dependency-check-maven</artifactId>
    <configuration>
        <failBuildOnCVSS>7</failBuildOnCVSS>
    </configuration>
</plugin>

<!-- SpotBugs con FindSecBugs -->
<plugin>
    <groupId>com.github.spotbugs</groupId>
    <artifactId>spotbugs-maven-plugin</artifactId>
    <configuration>
        <effort>Max</effort>
        <threshold>Low</threshold>
        <plugins>
            <plugin>
                <groupId>com.h3xstream.findsecbugs</groupId>
                <artifactId>findsecbugs-plugin</artifactId>
            </plugin>
        </plugins>
    </configuration>
</plugin>

<!-- Maven Enforcer -->
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-enforcer-plugin</artifactId>
    <configuration>
        <rules>
            <bannedDependencies>
                <excludes>
                    <exclude>org.apache.logging.log4j:log4j-core:(,2.17.1)</exclude>
                </excludes>
            </bannedDependencies>
        </rules>
    </configuration>
</plugin>
```

---

## 🚀 Come Eseguire i Controlli

### Localmente

#### 1. OWASP Dependency Check
```bash
./mvnw dependency-check:check
```
Report: `target/dependency-check-report.html`

#### 2. SpotBugs
```bash
./mvnw spotbugs:check
```
Report: `target/spotbugsXml.xml`

#### 3. Tutti i controlli di sicurezza
```bash
./mvnw clean verify
```

#### 4. Solo controlli senza build completo
```bash
./mvnw dependency-check:check spotbugs:check
```

### Su GitHub Actions

1. **Automatico:**
   - I controlli si eseguono automaticamente ad ogni push o PR

2. **Manuale:**
   - Vai alla tab "Actions"
   - Seleziona "Security Scan"
   - Clicca "Run workflow"

3. **Schedulato:**
   - Ogni lunedì alle 2 AM (UTC)

---

## 📊 Interpretazione dei Risultati

### OWASP Dependency Check

**Livelli di Severità:**
- 🔴 **CRITICAL** (9.0-10.0): Azione immediata richiesta
- 🟠 **HIGH** (7.0-8.9): Risolvere al più presto
- 🟡 **MEDIUM** (4.0-6.9): Pianificare fix
- 🟢 **LOW** (0.1-3.9): Monitorare

**Azioni:**
1. Aggiorna le dipendenze vulnerabili
2. Se non disponibile fix, valuta alternative
3. Se accettabile, aggiungi suppression in `owasp-suppression.xml` con giustificazione

### SpotBugs/FindSecBugs

**Categorie:**
- **SECURITY**: Vulnerabilità di sicurezza
- **BAD_PRACTICE**: Pratiche non raccomandate
- **CORRECTNESS**: Possibili bug
- **PERFORMANCE**: Problemi di performance

**Priority:**
- 1 (High): Risolvere immediatamente
- 2 (Medium): Risolvere quando possibile
- 3 (Low): Considerare

### CodeQL

**Query Categories:**
- **security-extended**: Problemi di sicurezza
- **quality**: Problemi di qualità del codice

**Alert Levels:**
- Error: Blocca il merge
- Warning: Richiede revisione
- Note: Informativo

### Trivy

**Vulnerability Types:**
- OS packages
- Application dependencies
- Misconfigurations

**Actions:**
- Aggiorna immagine base
- Aggiorna dipendenze
- Correggi configurazioni

---

## 🎯 Best Practice

### 1. **Dependency Management**
- ✅ Mantieni le dipendenze aggiornate
- ✅ Usa versioni specifiche, non range
- ✅ Rivedi regolarmente le dipendenze transitive
- ❌ Non ignorare warning di sicurezza

### 2. **Secret Management**
- ✅ Usa GitHub Secrets per credenziali
- ✅ Usa vault per segreti in produzione
- ✅ Ruota regolarmente i segreti
- ❌ Mai committare credenziali nel codice
- ❌ Mai loggare informazioni sensibili

### 3. **Code Security**
- ✅ Valida tutti gli input
- ✅ Usa prepared statements per SQL
- ✅ Sanitizza output per prevenire XSS
- ✅ Implementa proper authentication/authorization
- ✅ Usa librerie crittografiche moderne

### 4. **Container Security**
- ✅ Usa immagini base minimal (Alpine, distroless)
- ✅ Non eseguire container come root
- ✅ Scansiona regolarmente le immagini
- ✅ Usa multi-stage builds

### 5. **CI/CD Security**
- ✅ Limita i permessi dei workflow
- ✅ Usa actions verificate
- ✅ Proteggi i branch principali
- ✅ Richiedi review per modifiche sensibili

### 6. **Monitoring**
- ✅ Rivedi regolarmente i report di sicurezza
- ✅ Configura notifiche per vulnerabilità critiche
- ✅ Mantieni un log delle suppression con giustificazioni
- ✅ Esegui scan schedulati settimanali

---

## 🔄 Processo di Remediation

### Quando viene trovata una vulnerabilità:

1. **Valuta la severità e l'impatto**
   - Controlla CVSS score
   - Verifica se il codice vulnerabile è effettivamente usato
   - Valuta l'esposizione (interno/esterno)

2. **Ricerca soluzioni**
   - Aggiornamento dipendenza
   - Patch disponibili
   - Workaround temporanei
   - Mitigazioni a livello di configurazione

3. **Implementa il fix**
   - Aggiorna dipendenze
   - Modifica codice se necessario
   - Testa approfonditamente

4. **Verifica**
   - Ri-esegui i controlli di sicurezza
   - Conferma che la vulnerabilità sia risolta
   - Verifica che non siano introdotti nuovi problemi

5. **Documenta**
   - Registra la vulnerabilità e il fix
   - Se suppressed, documenta il motivo
   - Aggiorna dipendenze in `pom.xml`

---

## 📝 Suppression di Vulnerabilità

Se una vulnerabilità è un falso positivo o un rischio accettato:

1. Aggiungi in `owasp-suppression.xml`:
```xml
<suppress>
    <notes><![CDATA[
        [Spiegazione dettagliata del perché questa vulnerabilità è soppressa]
        - Versione: X.Y.Z
        - Data: YYYY-MM-DD
        - Approvato da: Nome
        - Revisione: YYYY-MM-DD
    ]]></notes>
    <cve>CVE-2023-XXXXX</cve>
</suppress>
```

2. Crea un issue su GitHub per tracking
3. Pianifica una revisione periodica

---

## 🚨 Incident Response

### In caso di vulnerabilità critica scoperta:

1. **Immediato:**
   - Valuta se sistemi in produzione sono affetti
   - Se sì, considera hotfix o rollback
   - Notifica il team

2. **Breve termine (24-48h):**
   - Implementa fix
   - Testa approfonditamente
   - Deploy in produzione

3. **Follow-up:**
   - Post-mortem
   - Aggiorna processi per prevenire ricorrenze
   - Aggiorna documentazione

---

## 📚 Risorse

- [OWASP Top 10](https://owasp.org/www-project-top-ten/)
- [OWASP Dependency-Check](https://owasp.org/www-project-dependency-check/)
- [FindSecBugs Documentation](https://find-sec-bugs.github.io/)
- [GitHub Security Features](https://docs.github.com/en/code-security)
- [Trivy Documentation](https://aquasecurity.github.io/trivy/)
- [National Vulnerability Database](https://nvd.nist.gov/)

---

## 📞 Contatti

Per questioni di sicurezza:
- **Security Team:** [email protetto]
- **Emergency:** [canale Slack/Teams]

**Nota:** Per vulnerabilità critiche, seguire il processo di Incident Response.

---

*Ultimo aggiornamento: 14 Gennaio 2026*
