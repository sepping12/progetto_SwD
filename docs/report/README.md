# LaTeX Report Compilation Guide

## Report Structure

```
docs/report/
├── main.tex                    # Main document file
├── bibliography.bib            # Bibliography references
├── sections/
│   ├── 01-introduction.tex     # ✅ CREATED
│   ├── 02-background.tex       # TODO: Create next
│   ├── 03-methodology.tex      # TODO: Create next
│   ├── 04-analysis.tex         # TODO: Create next
│   ├── 05-results.tex          # TODO: Create next
│   ├── 06-improvements.tex     # TODO: Create next
│   └── 07-conclusions.tex      # TODO: Create next
└── figures/                    # TODO: Add figures/screenshots
```

## Compilation Steps

### Local Compilation (TeX Live / MiKTeX)

```bash
cd docs/report
pdflatex main.tex
bibtex main
pdflatex main.tex
pdflatex main.tex
```

### Overleaf Compilation

1. Create new project on Overleaf
2. Upload all files maintaining directory structure
3. Set compiler to `pdfLaTeX`
4. Compile

## Current Status

- ✅ Main document structure (main.tex)
- ✅ Bibliography file (bibliography.bib)
- ✅ Section 1: Introduction (01-introduction.tex)
- ⏳ Section 2-7: To be created

## Next Steps

The remaining sections will be created following this structure:

1. **02-background.tex**: Dependability concepts and tools
2. **03-methodology.tex**: Experimental setup and procedures
3. **04-analysis.tex**: Detailed results for all 9 criteria
4. **05-results.tex**: Discussion and synthesis
5. **06-improvements.tex**: Enhancements implemented
6. **07-conclusions.tex**: Summary and future work

## Key Data for Sections

### Criterion Results (for Section 4)
1. CI/CD: 4 workflows, Green build status
2. SonarCloud: A ratings, 0 bugs, 91.9% coverage
3. Docker Image: Multi-stage build, health checks
4. Docker Container: Runs successfully, MySQL/H2 support
5. Code Coverage: 91.9% (JaCoCo)
6. Mutation Testing: **100% score** (16/16 mutants), 161 tests
7. Performance: Sub-millisecond operations (JMH)
8. Test Generation: 1,465 Randoop tests
9. Security: 0 vulnerabilities (SpotBugs, OWASP DC)

### Project Metrics
- Tests: 1,626 total (161 manual + 1,465 generated)
- Mutation Score: 100% on business logic
- Code Coverage: 91.9%
- SonarCloud: Triple-A rating
- Build Time: ~42 seconds (CI)
- Docker Image: Multi-stage, optimized

## Authors
- Alfonso Maria Ferrara
- Giuseppe Esposito

## Academic Year
2024/2025 - Software Dependability Course
Università degli Studi di Salerno
