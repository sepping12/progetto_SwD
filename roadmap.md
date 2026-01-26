# Spring PetClinic Dependability Analysis - Evaluation Checklist

## Project Information

- **Team Members**: Giuseppe Esposito, Alfonso Maria Ferrara
- **Start Date**: 31 ottobre 2025
- **Last Update**: 12 gennaio 2026


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

### ✅ 1b. JML Formal Specifications - COMPLETATO

- [x] JML specifications added to core methods
- [x] Preconditions defined for critical methods
- [x] Postconditions defined with return value constraints
- [x] Class invariants specified for entities
- [x] Semantic verification completed
- [x] No ambiguities found
- [x] **Deadline**: Week 1
- **Status**: ✅ Completed
- **Notes**: 
  - Specifiche JML aggiunte a 5 classi core:
    - `CheckoutServiceImplementation`: placeOrder(), generateOrderTrackingNumber()
    - `Customer`: add(Order) + invarianti
    - `Order`: add(OrderItem) + invarianti
    - `OrderItem`: invarianti di validazione
    - `Address`: invarianti di validazione
  - Verifica semantica: ✅ Nessuna ambiguità
  - Tutte le precondizioni sono verificabili
  - Tutte le postcondizioni sono garantite
  - Report completo: `JML_VERIFICATION.md`
  - Compilazione Java: ✅ Successo senza errori

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

### � 6. Mutation Testing (PITest)

- [x] PITest plugin configured
- [x] Mutation campaign executed
- [x] Mutation score calculated (9% with service tests)
- [x] Survived mutants analyzed
- [x] Weak test spots identified
- [x] Test improvements proposed/implemented (11 CheckoutService unit tests)
- [ ] **Deadline**: Week 3
- **Status**: 🟡 In Progress
- **Notes**: 
  - Initial score: 0% → 9% after adding CheckoutService tests
  - Line coverage improved: 30% → 66%
  - Test strength: 64% (156 tests running)
  - Next: Add controller integration tests

### 🔴 7. Performance Tests (JMH)

- [x] JMH dependency added
- [x] Critical components identified
- [x] Benchmarks written for 4 components (CheckoutService, UUID generation, Entity operations, DTO operations)
- [x] Benchmarks executed
- [x] Results analyzed and documented
- [x] Bottlenecks documented
- [ ] **Deadline**: Week 4
- **Status**: ✅ Completed
- **Notes**: 
  - 4 benchmark classes created with comprehensive performance tests
  - All operations complete in sub-millisecond time
  - Full documentation in JMH_BENCHMARK_SUMMARY.md

### 🔴 8. Automated Test Generation

- [x] Coverage gaps identified
- [x] Tool selected (Randoop 4.3.3)
- [x] Tests generated (1,465 regression tests)
- [x] Tests reviewed and verified (100% pass rate)
- [x] Tests integrated in test suite (Maven + CI/CD)
- [x] Coverage improvement measured (41,068 lines of test code added)
- [ ] **Deadline**: Week 4
- **Status**: ✅ Completed
- **Notes**: 
  - Randoop generated 1,465 tests for 5 entity classes
  - All tests passing (0 failures, 0 errors)
  - JUnit Vintage Engine added for JUnit 4 compatibility
  - Full documentation in TEST_GENERATION.md

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
| 6. Mutation Testing  | �     | 50%           |
| 7. Performance (JMH) | 🟢     | 100%          |
| 8. Test Generation   | 🟢     | 100%          |
| 9. Security Analysis | 🟡     | 75%           |

**Progresso Totale**: 7.25/9 criteri (~**89%** ✅)

**Tests**: 85 manual + 1,465 generated = **1,550 total tests**

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

## Roadmap

### Criterion 2: JML Specifications and OpenJML Verification
- **Status**: Implemented
- **Details**:
  - Added JML specifications for critical methods in the `src/main/jml` directory.
  - Configured OpenJML Maven plugin for formal verification during the `verify` phase.
  - Example specification provided in `Example.jml`.