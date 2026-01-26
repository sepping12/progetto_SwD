# Report LaTeX in Italiano - Analisi Dependability

## Struttura Report

```
docs/report/
├── main-ita.tex                # Documento principale in italiano
├── bibliography.bib            # Bibliografia (condivisa)
├── sections-ita/
│   ├── 01-introduzione.tex     # ✅ COMPLETO
│   ├── 02-background.tex       # ✅ COMPLETO
│   ├── 03-metodologia.tex      # ✅ COMPLETO
│   ├── 04-analisi.tex          # ✅ COMPLETO
│   ├── 05-risultati.tex        # ✅ COMPLETO
│   ├── 06-miglioramenti.tex    # ✅ COMPLETO
│   └── 07-conclusioni.tex      # ✅ COMPLETO
```

## Compilazione PDF

### Compilazione Locale (TeX Live / MiKTeX)

```bash
cd docs/report
pdflatex main-ita.tex
bibtex main-ita
pdflatex main-ita.tex
pdflatex main-ita.tex
```

Il PDF finale sarà generato come `main-ita.pdf`.

### Compilazione su Overleaf

1. Crea nuovo progetto su Overleaf
2. Carica tutti i file mantenendo la struttura directory
3. Imposta il compilatore su `pdfLaTeX`
4. Compila

## Stato Completamento

- ✅ Documento principale (main-ita.tex)
- ✅ Bibliografia (bibliography.bib) - 18 riferimenti
- ✅ Sezione 1: Introduzione (82 righe)
- ✅ Sezione 2: Background (105 righe)
- ✅ Sezione 3: Metodologia (127 righe)
- ✅ Sezione 4: Analisi e Risultati (269 righe)
- ✅ Sezione 5: Risultati e Discussione (152 righe)
- ✅ Sezione 6: Miglioramenti (167 righe)
- ✅ Sezione 7: Conclusioni (177 righe)

**Totale: ~1.100 righe di contenuto LaTeX**

**Target: 30-40 pagine** ✅

## Differenze con Versione Inglese

La versione italiana è una **versione condensata** del report originale inglese:

- **Contenuto**: Mantiene tutti i dati e risultati principali
- **Struttura**: Identica (7 sezioni)
- **Lunghezza**: ~1.100 righe (vs ~2.000 righe versione inglese)
- **Target**: 30-40 pagine (vs 50-60 pagine versione inglese)
- **Lingua**: Completamente tradotta in italiano
- **Tabelle**: Tutte le tabelle principali incluse
- **Codice**: Esempi di codice chiave mantenuti

## Metriche Chiave del Progetto

- **Mutation Score**: 100% (16/16 mutanti uccisi)
- **Code Coverage**: 91.9%
- **Test Totali**: 1.626
- **Vulnerabilità**: 0
- **Rating SonarCloud**: Triple-A (Security, Reliability, Maintainability)
- **Dimensione Immagine Docker**: 282 MB
- **Tempo Build CI/CD**: 45 secondi (media)

## Autori

- Alfonso Maria Ferrara
- Giuseppe Esposito

## Collegamenti

- **Repository GitHub**: https://github.com/sepping12/progetto_SwD
- **Dashboard SonarCloud**: https://sonarcloud.io/project/overview?id=sepping12_progetto_SwD
- **Immagine DockerHub**: https://hub.docker.com/r/sepping12/progetto-swd

## Note sulla Compilazione

### Requisiti

- LaTeX (TeX Live 2023+ o MiKTeX 2023+)
- Pacchetti richiesti: inputenc, babel (italian), graphicx, hyperref, listings, xcolor, booktabs, geometry, fancyhdr, tikz, amsmath, amssymb
- BibTeX per la bibliografia

### Risoluzione Problemi

**Problema**: Logo università mancante
**Soluzione**: Il logo `logo_unisa.png` deve essere nella stessa directory di main-ita.tex. Se non disponibile, commentare la riga nel file main-ita.tex.

**Problema**: Bibliografia non appare
**Soluzione**: Assicurati di eseguire bibtex dopo il primo pdflatex:
```bash
pdflatex main-ita.tex
bibtex main-ita
pdflatex main-ita.tex
pdflatex main-ita.tex
```

**Problema**: Errori di compilazione
**Soluzione**: Verifica che tutti i pacchetti LaTeX siano installati. Su TeX Live:
```bash
tlmgr install <pacchetto-mancante>
```

## Prossimi Passi

1. ✅ Report italiano completato
2. ⏳ Creare presentazione slides (PowerPoint o Beamer)
3. ⏳ (Opzionale) Aggiungere figure/screenshot alla directory `figures/`

## Struttura delle Sezioni

### 1. Introduzione
- Contesto progetto e panoramica applicazione
- Obiettivi analisi e nove criteri
- Risultati principali e innovazioni tecniche
- Struttura report e risorse

### 2. Background
- Concetti dependability software
- Mutation testing e interpretazione
- Descrizione strumenti (SonarCloud, JaCoCo, PITest, JMH, Randoop, SpotBugs, OWASP DC)
- Docker, CI/CD, Spring Boot, Lombok

### 3. Metodologia
- Ambiente sperimentale e stato iniziale
- Selezione strumenti con rationale
- Procedure valutazione per ogni criterio
- Processo miglioramento iterativo

### 4. Analisi e Risultati
- Risultati dettagliati per tutti i 9 criteri
- Metriche quantitative con tabelle
- Configurazioni tool chiave
- Riepilogo finale completo

### 5. Risultati e Discussione
- Valutazione complessiva e insight chiave
- Sinergia coverage e mutation testing
- Sfide incontrate e soluzioni
- Confronto con progetti riferimento
- Best practice e limitazioni

### 6. Miglioramenti
- Potenziamento infrastruttura testing
- Hardening sicurezza multi-tool
- Ottimizzazione pipeline CI/CD
- Potenziamenti containerizzazione Docker
- Raffinamenti qualità codice
- Tabella impatto miglioramenti

### 7. Conclusioni
- Riepilogo risultati quantitativi e qualitativi
- Risposte a domande di ricerca
- Lezioni apprese (tecniche e metodologiche)
- Limitazioni e lavoro futuro
- Raccomandazioni pratiche
- Contributo alla conoscenza
