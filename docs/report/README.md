# LaTeX Report Compilation Guide

## Report Structure

```
docs/report/
├── main.tex                    # Main document file
├── bibliography.bib            # Bibliography references
├── sections/
│   ├── 01-introduction.tex     # ✅ COMPLETE (156 lines)
│   ├── 02-background.tex       # ✅ COMPLETE (228 lines)
│   ├── 03-methodology.tex      # ✅ COMPLETE (237 lines)
│   ├── 04-analysis.tex         # ✅ COMPLETE (519 lines)
│   ├── 05-results.tex          # ✅ COMPLETE (286 lines)
│   ├── 06-improvements.tex     # ✅ COMPLETE (299 lines)
│   └── 07-conclusions.tex      # ✅ COMPLETE (253 lines)
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
- ✅ Bibliography file (bibliography.bib) - 18 references
- ✅ Section 1: Introduction (01-introduction.tex) - 156 lines
- ✅ Section 2: Background (02-background.tex) - 228 lines
- ✅ Section 3: Methodology (03-methodology.tex) - 237 lines
- ✅ Section 4: Analysis and Results (04-analysis.tex) - 519 lines
- ✅ Section 5: Results and Discussion (05-results.tex) - 286 lines
- ✅ Section 6: Improvements (06-improvements.tex) - 299 lines
- ✅ Section 7: Conclusions (07-conclusions.tex) - 253 lines

**Total: ~2,000 lines of LaTeX content**

## Report Complete!

## Report Complete!

The LaTeX report is now complete and ready for compilation. All 7 sections have been created following the structure of the reference repository.

## Next Steps

1. **Compile the report**:
   ```bash
   cd docs/report
   pdflatex main.tex
   bibtex main
   pdflatex main.tex
   pdflatex main.tex
   ```

2. **Optional: Add figures/screenshots** to the `figures/` directory for visual enhancement

3. **Review and polish**: Read through the generated PDF and make any final adjustments

4. **Create presentation slides**: After report completion
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
