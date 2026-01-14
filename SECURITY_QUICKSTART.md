# 🔒 Security CI/CD - Guida Rapida

## Comandi Essenziali

### Esecuzione Locale

```bash
# Tutti i controlli di sicurezza
./mvnw clean verify

# Solo OWASP Dependency Check
./mvnw dependency-check:check

# Solo SpotBugs
./mvnw spotbugs:check

# Dependency Check + SpotBugs
./mvnw dependency-check:check spotbugs:check
```

### Visualizzare Report

```bash
# OWASP Dependency Check Report
start target/dependency-check-report.html

# SpotBugs Report
start target/spotbugsXml.xml
```

---

## Workflow GitHub Actions

### Automatico
- ✅ Ad ogni **push** su `main` o `develop`
- ✅ Ad ogni **pull request**
- ✅ **Schedulato**: ogni lunedì alle 2 AM

### Manuale
1. Vai su **Actions** tab su GitHub
2. Seleziona **Security Scan**
3. Clicca **Run workflow**

---

## Controlli Implementati

| Controllo | Strumento | Cosa Verifica |
|-----------|-----------|---------------|
| **Dependency Scanning** | OWASP Dependency-Check | Vulnerabilità nelle dipendenze |
| **SAST** | SpotBugs + FindSecBugs | Bug e vulnerabilità nel codice |
| **Secret Detection** | Gitleaks | Credenziali e token committati |
| **Code Analysis** | CodeQL | Analisi semantica avanzata |
| **Container Scanning** | Trivy | Vulnerabilità nell'immagine Docker |
| **Policy Enforcement** | Maven Enforcer | Regole sulle dipendenze |

---

## Severità Vulnerabilità

- 🔴 **CRITICAL** (9.0-10.0): Fix immediato
- 🟠 **HIGH** (7.0-8.9): Fix urgente
- 🟡 **MEDIUM** (4.0-6.9): Pianifica fix
- 🟢 **LOW** (0.1-3.9): Monitora

---

## Report Disponibili

Dopo ogni build, trovi i report in:

- **Actions Artifacts** su GitHub:
  - `dependency-check-report` (HTML)
  - `spotbugs-report` (XML)
  - `trivy-security-report` (HTML)

- **Security Tab** su GitHub:
  - CodeQL alerts
  - Dependency alerts
  - Secret scanning alerts

---

## Fix Rapidi

### Vulnerabilità in Dipendenza
```bash
# 1. Identifica la dipendenza vulnerabile nel report
# 2. Aggiorna la versione in pom.xml
# 3. Testa
./mvnw clean test
# 4. Ri-verifica
./mvnw dependency-check:check
```

### Suppression Falsi Positivi
Edita `owasp-suppression.xml`:
```xml
<suppress>
    <notes><![CDATA[
        Motivo della suppression...
    ]]></notes>
    <cve>CVE-2023-XXXXX</cve>
</suppress>
```

---

## Contatti

- 📖 **Documentazione completa**: [SECURITY_CI_CD.md](SECURITY_CI_CD.md)
- 🐛 **Issue di sicurezza**: Apri un issue su GitHub
- 🚨 **Emergenza**: Contatta il team di sicurezza

---

*Ultimo aggiornamento: 14 Gennaio 2026*
