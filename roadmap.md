# Spring PetClinic Dependability Analysis - Evaluation Checklist

## Project Information

- **Team Members**: Giuseppe eEsposito, Alfonso Maria Ferrara
- **Start Date**: 31 ottobre 2025
- **Last Update**: 28 novembre 2025


## Evaluation Criteria Status

### ✅ 1. CI/CD & Build - COMPLETATO

- [x] Project buildable locally (`mvn clean install`)
- [x] GitHub Actions CI/CD configured
- [x] Build passes successfully
- [x] Tests run automatically (44 test, 100% pass)
- [x] **Deadline**: Week 1
- **Status**: ✅ Completed
- **Notes**: 
  - Pipeline CI funzionante con Java 17 (Maven wrapper, JaCoCo coverage)
  - Docker multi-stage build configurato (Eclipse Temurin 21)
  - Health checks abilitati per container
  - Workflows: ci.yml (build + JaCoCo + SonarCloud), build.yml (Docker push to DockerHub)

### ✅ 2. SonarCloud Analysis - COMPLETATO

- [] SonarCloud account connected
- [] Project imported and analyzed
- [] Issues categorized (0 Bugs / 0 Vulnerabilities / 23 Code Smells)
- [] Results documented with rationale
- [] Metrics documented (91.9% coverage, Triple A rating)
- [] **Deadline**: Week 2
- **Status**: � Completed
- **Notes**:
  - Security: A (0 vulnerabilità)
  - Reliability: A (0 bug)
  - Maintainability: A (23 code smell minori)
  - Coverage: 91.9%
  - Duplications: 0%
  - Troubleshooting OWASP dependency-check documentato

### ✅ 3. Docker Image on DockerHub - COMPLETATO

- [] Dockerfile created/optimized (multi-stage build)
- [] Docker image builds successfully
- [] Image pushed to DockerHub automaticamente
- [] Image is public and accessible
- [] Documentation for image usage
- [] **Deadline**: Week 1
- **Status**: � Completed
- **Notes**:
  - Multi-stage build con Eclipse Temurin 21
  - Tags: latest, main, SHA commit
  - Health checks configurati
  - User non-root per sicurezza

### ✅ 4. Docker Container Runnable - COMPLETATO

- [] Container runs successfully
- [] Web application accessible (localhost:8080)
- [] Database connection works (H2 in-memory)
- [] Docker-compose for orchestration
- [] Instructions in README
- [] **Deadline**: Week 1
- **Status**: � Completed
- **Notes**: Testato localmente, funziona correttamente

### ✅ 5. Code Coverage (JaCoCo) - COMPLETATO

- [] JaCoCo configured in pom.xml
- [] Coverage report generated
- [] Coverage analyzed (91.9% overall)
- [] Critical paths identified
- [] Analysis documented
- [] **Deadline**: Week 2
- **Status**: � Completed
- **Notes**:
  - Report integrato con SonarCloud
  - 44 test passano con successo
  - Supera target 80%

### 🔴 6. Mutation Testing (PITest)

- [ ] PITest plugin configured
- [ ] Mutation campaign executed
- [ ] Mutation score calculated
- [ ] Survived mutants analyzed
- [ ] Weak test spots identified
- [ ] Test improvements proposed/implemented
- [ ] **Deadline**: Week 3
- **Status**: 🔴 Not Started
- **Notes**: Prossimo step da implementare

### 🔴 7. Performance Tests (JMH)

- [ ] JMH dependency added
- [ ] Critical components identified
- [ ] Benchmarks written for 3+ components
- [ ] Benchmarks executed
- [ ] Results analyzed
- [ ] Bottlenecks documented
- [ ] **Deadline**: Week 4
- **Status**: 🔴 Not Started
- **Notes**:

### 🔴 8. Automated Test Generation

- [ ] Coverage gaps identified
- [ ] Tool selected (EvoSuite/Randoop)
- [ ] Tests generated
- [ ] Tests reviewed and improved
- [ ] Tests integrated in test suite
- [ ] Coverage improvement measured
- [ ] **Deadline**: Week 4
- **Status**: 🔴 Not Started
- **Notes**:

### 🟡 9. Security Analysis - PARZIALE

- [ ] OWASP FindSecBugs configured
- [] OWASP Dependency-Check configured (skipped in CI per mancanza API key NVD)
- [ ] Security scans executed
- [] SonarCloud security analysis: 0 vulnerabilità
- [ ] Security assessment documented
- [ ] Mitigation strategies proposed
- [ ] **Deadline**: Week 5
- **Status**: 🟡 Partial
- **Notes**: SonarCloud non rileva vulnerabilità. OWASP DC richiede NVD API key.
- **Status**: 🔴 Not Started
- **Notes**:

## Documentation & Reporting

### LaTeX Report

- [] Report structure created
- [ ] Introduction section (in progress)
- [ ] Background & Methodology
- [ ] Analysis sections (all 9 criteria)
- [ ] Results & Discussion
- [ ] Improvements implemented
- [ ] Conclusions
- [ ] Bibliography
- [ ] Figures & Tables
- [ ] **Deadline**: Week 6
- **Status**: � In Progress

### Presentation

- [ ] Slide deck created
- [ ] Content covers all criteria
- [ ] Visuals & graphs included
- [ ] Practice presentation
- [ ] **Deadline**: Week 7
- **Status**: 🔴 Not Started

## GitHub Repository Requirements

- [] All code committed
- [] Meaningful commit history
- [] Analysis reports included
- [] README.md comprehensive
- [ ] LaTeX report PDF uploaded
- [ ] Presentation slides uploaded
- [] Analysis artifacts included

## Final Checks

- [ ] All 9 criteria completed
- [ ] Report reviewed and finalized
- [ ] Presentation ready
- [] Repository clean and organized
- [] All documentation up to date

---

## Progress Summary

| Criterio             | Status | Completamento |
| -------------------- | ------ | ------------- |
| 1. CI/CD & Build     | 🟢     | 100%          |
| 2. SonarCloud        | 🟢     | 100%          |
| 3. Docker Image      | 🟢     | 100%          |
| 4. Docker Container  | 🟢     | 100%          |
| 5. Code Coverage     | 🟢     | 100%          |
| 6. Mutation Testing  | 🔴     | 0%            |
| 7. Performance (JMH) | 🔴     | 0%            |
| 8. Test Generation   | 🔴     | 0%            |
| 9. Security Analysis | 🟡     | 50%           |

**Progresso Totale**: 5.5/9 criteri (~61%)

---

## Notes & Progress Log

### Week 1 (31 ottobre - 6 novembre 2025):

- [] Project structure created, workspace setup completed
- [] Fork Spring PetClinic repository
- [] Clone repository locally
- [] Verify local build works (fixed Java 25→21)
- [] Setup CI/CD pipeline (GitHub Actions)
- [] Create and push Docker image

### Week 2 (7-13 novembre 2025):

- [] Configure SonarCloud
- [] Run initial analysis
- [] Fix OWASP dependency-check issue (NVD API key required)
- [] JaCoCo already configured, coverage: 91.9%

### Week 3 (14-20 novembre 2025):

- [] Documentazione SonarCloud completata
- [] Troubleshooting documentato
- [ ] Configure PITest (prossimo step)
- [ ] Execute mutation testing

### Week 4 (21-27 novembre 2025):

- [ ] Setup JMH benchmarks
- [ ] Generate automated tests
- [ ] Measure improvements

### Week 5 (28 novembre - 4 dicembre 2025):

- [] Report SonarCloud/Coverage completati (28/11)
- [ ] Security analysis con OWASP tools
- [ ] Document vulnerabilities

### Week 6:

- [ ] Complete LaTeX report
- [ ] Review all documentation

### Week 7:

- [ ] Finalize presentation
- [ ] Final review and submission