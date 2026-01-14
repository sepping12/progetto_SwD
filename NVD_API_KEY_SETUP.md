# 🔑 Configurazione NVD API Key per OWASP Dependency-Check

## Problema
OWASP Dependency-Check richiede una **NVD API Key** per accedere al National Vulnerability Database (NVD). Senza questa chiave, il controllo delle vulnerabilità fallisce con errore 403/404.

---

## ✅ Soluzione Rapida (Configurazione Opzionale)

Il workflow è già configurato per funzionare **senza** la chiave NVD API, usando dati cached locali. Tuttavia, per risultati completi e aggiornati, è **altamente raccomandato** configurare una chiave API.

---

## 📝 Come Ottenere una NVD API Key

### 1. Registrati per una chiave API (Gratis)

1. Vai a: https://nvd.nist.gov/developers/request-an-api-key
2. Compila il modulo con il tuo indirizzo email
3. Riceverai un'email con la tua API Key

⏱️ **Tempo richiesto**: ~2 minuti

---

## 🔧 Come Configurare la Chiave su GitHub

### Passaggio 1: Aggiungi la chiave come Secret

1. Vai al tuo repository su GitHub
2. Clicca su **Settings** → **Secrets and variables** → **Actions**
3. Clicca **New repository secret**
4. Compila:
   - **Name**: `NVD_API_KEY`
   - **Value**: La tua chiave API ricevuta via email
5. Clicca **Add secret**

### Passaggio 2: Verifica

Il workflow è già configurato per usare automaticamente la chiave se presente:

```yaml
env:
  NVD_API_KEY: ${{ secrets.NVD_API_KEY }}
```

Quando fai il prossimo push, il workflow userà la chiave automaticamente.

---

## 🚀 Vantaggi dell'uso della NVD API Key

✅ **Database aggiornato**: Accesso alle vulnerabilità più recenti  
✅ **Più veloce**: Download più rapido dei dati NVD  
✅ **Più affidabile**: Nessun errore 403/404  
✅ **Rate limit maggiore**: Fino a 5 richieste al secondo (vs 0.6/sec senza chiave)

---

## 🔍 Stato Attuale del Workflow

**Senza NVD API Key:**
- ✅ Il workflow continua a funzionare
- ⚠️ Usa solo dati cached locali
- ⚠️ Potrebbero mancare vulnerabilità recenti
- ⚠️ Warning: "No NVD API Key found"

**Con NVD API Key:**
- ✅ Database NVD completo e aggiornato
- ✅ Vulnerabilità più recenti incluse
- ✅ Nessun warning
- ✅ Performance migliori

---

## 📊 Verifica Configurazione

Dopo aver aggiunto la chiave:

1. Vai su **Actions** tab
2. Esegui manualmente il workflow **Security Scan**
3. Controlla i log del job "OWASP Dependency Check"
4. Dovresti vedere: `"Using NVD API Key for dependency check"`

---

## 🔒 Sicurezza

- ✅ La chiave è memorizzata come **secret** crittografato
- ✅ Non appare mai nei log
- ✅ Accessibile solo dal workflow
- ✅ Può essere ruotata in qualsiasi momento

---

## ❓ FAQ

### Q: È obbligatoria la chiave API?
**A:** No, il workflow funziona anche senza. Tuttavia è **altamente raccomandato** per risultati completi.

### Q: Quanto costa?
**A:** La chiave API è **completamente gratuita**.

### Q: Quante richieste posso fare?
**A:** 
- **Senza chiave**: 0.6 richieste/secondo (~5 al minuto)
- **Con chiave**: 5 richieste/secondo (~300 al minuto)

### Q: Devo rinnovarla?
**A:** No, la chiave API non scade (salvo cambio policy NVD).

### Q: Cosa succede se non la configuro?
**A:** Il workflow continua a funzionare ma:
- Usa solo dati cached
- Potrebbero mancare vulnerabilità recenti
- Genera un warning nei log

---

## 🛠️ Configurazione Locale (Opzionale)

Se vuoi usare la chiave anche in locale:

### Linux/Mac:
```bash
export NVD_API_KEY="your-api-key-here"
./mvnw dependency-check:check -DnvdApiKey=$NVD_API_KEY
```

### Windows PowerShell:
```powershell
$env:NVD_API_KEY="your-api-key-here"
./mvnw dependency-check:check -DnvdApiKey=$env:NVD_API_KEY
```

### O nel pom.xml:
```xml
<plugin>
    <groupId>org.owasp</groupId>
    <artifactId>dependency-check-maven</artifactId>
    <configuration>
        <nvdApiKey>${env.NVD_API_KEY}</nvdApiKey>
    </configuration>
</plugin>
```

---

## 📚 Risorse

- **Richiedi API Key**: https://nvd.nist.gov/developers/request-an-api-key
- **Documentazione NVD**: https://nvd.nist.gov/developers
- **Dependency-Check Docs**: https://jeremylong.github.io/DependencyCheck/
- **GitHub Secrets**: https://docs.github.com/en/actions/security-guides/encrypted-secrets

---

## 🆘 Troubleshooting

### Errore: "403 or 404 error"
✅ **Risolto**: Il workflow ora gestisce questo caso automaticamente.

### Errore: "Invalid API Key"
1. Verifica che la chiave sia corretta
2. Controlla che il secret si chiami esattamente `NVD_API_KEY`
3. Ri-aggiungi la chiave nelle GitHub Secrets

### Workflow continua a fallire
1. Verifica i log del job
2. Controlla che `mvnw` sia eseguibile (`chmod +x mvnw`)
3. Verifica la connessione a internet del runner

---

*Ultimo aggiornamento: 14 Gennaio 2026*
