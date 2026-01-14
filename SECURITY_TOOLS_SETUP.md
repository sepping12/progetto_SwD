# Security Analysis Tools - Setup Guide

This project implements comprehensive security analysis using **GitGuardian**, **Snyk**, and **SonarQube/SonarCloud** as required by the security criteria.

## 🔒 Security Tools Overview

### 1. GitGuardian - Secret Scanning
**Purpose**: Detect hardcoded secrets, API keys, credentials, and sensitive data in code and commit history.

**Features**:
- Real-time secret detection across 350+ types
- Historical commit scanning
- Policy enforcement
- Incident management dashboard

**Setup**:
1. Sign up at [GitGuardian](https://www.gitguardian.com/)
2. Get your API key from the dashboard
3. Add as GitHub secret:
   ```bash
   Repository Settings → Secrets and variables → Actions → New repository secret
   Name: GITGUARDIAN_API_KEY
   Value: <your-api-key>
   ```

**Fallback**: If GitGuardian API key is not configured, the workflow automatically falls back to Gitleaks for basic secret scanning.

### 2. Snyk - Dependency Vulnerability Scanning
**Purpose**: Identify and fix vulnerabilities in dependencies, container images, and open source libraries.

**Features**:
- Real-time vulnerability database (proprietary + NVD)
- License compliance checking
- Fix recommendations with PRs
- Container and IaC scanning

**Setup**:
1. Sign up at [Snyk](https://snyk.io/) (free for open source)
2. Authenticate and link your GitHub repository
3. Get your API token from Account Settings
4. Add as GitHub secret:
   ```bash
   Repository Settings → Secrets and variables → Actions → New repository secret
   Name: SNYK_TOKEN
   Value: <your-snyk-token>
   ```

**CLI Installation** (for local testing):
```bash
# Install Snyk CLI
npm install -g snyk

# Or using Homebrew
brew install snyk

# Authenticate
snyk auth

# Test your project
snyk test

# Monitor for new vulnerabilities
snyk monitor
```

### 3. SonarQube/SonarCloud - Code Quality & Security
**Purpose**: Comprehensive code quality analysis with security hotspots, OWASP Top 10 coverage, and technical debt tracking.

**Features**:
- Security Hotspots (OWASP Top 10)
- Code Smells & Technical Debt
- Code Coverage integration
- Quality Gates
- Continuous inspection

**Setup** (Using SonarCloud - Free for public repos):
1. Sign up at [SonarCloud](https://sonarcloud.io) with GitHub
2. Import your repository
3. Generate a token from Account → Security
4. Add as GitHub secret:
   ```bash
   Repository Settings → Secrets and variables → Actions → New repository secret
   Name: SONAR_TOKEN
   Value: <your-sonar-token>
   ```

**Local Analysis**:
```bash
# Run SonarQube analysis locally
./mvnw clean verify sonar:sonar \
  -Dsonar.projectKey=<your-project-key> \
  -Dsonar.organization=<your-org> \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.token=<your-token>
```

## 📊 Complete Security Stack

The project uses a **defense-in-depth** approach with multiple complementary tools:

| Tool | Category | Focus Area | Status |
|------|----------|-----------|---------|
| **GitGuardian** | Secret Detection | Hardcoded credentials, API keys | ✅ Configured |
| **Snyk** | Dependency Security | Vulnerabilities in libraries | ✅ Configured |
| **SonarQube/SonarCloud** | SAST + Quality | Code quality, security hotspots | ✅ Configured |
| **OWASP Dependency-Check** | CVE Scanning | Known vulnerabilities (NVD) | ⚠️ Requires NVD API Key |
| **SpotBugs + FindSecBugs** | SAST | Security patterns, bug detection | ✅ Active |
| **CodeQL** | Semantic Analysis | Advanced code security queries | ✅ Active |
| **Trivy** | Container Security | Docker image vulnerabilities | ✅ Active |

## 🚀 Workflow Integration

All security tools are integrated in `.github/workflows/security.yml`:

```yaml
Triggers:
- push: on main/develop branches
- pull_request: on main/develop branches  
- schedule: weekly (Monday 2 AM)

Jobs:
1. gitguardian-scan → Secret detection
2. snyk-security → Dependency vulnerabilities
3. sonarqube-analysis → Code quality & security hotspots
4. dependency-check → OWASP CVE scanning
5. spotbugs-analysis → Static analysis
6. codeql-analysis → Semantic security analysis
7. docker-security → Container scanning
8. security-summary → Consolidated results
```

## 🔧 Configuration Steps

### Quick Setup (All 3 Required Tools)

1. **GitGuardian**:
   ```bash
   Visit: https://www.gitguardian.com/
   Sign up → Get API Key → Add to GitHub Secrets as GITGUARDIAN_API_KEY
   ```

2. **Snyk**:
   ```bash
   Visit: https://snyk.io/
   Sign up → Link GitHub → Get Token → Add to GitHub Secrets as SNYK_TOKEN
   ```

3. **SonarCloud**:
   ```bash
   Visit: https://sonarcloud.io/
   Sign in with GitHub → Import Repo → Get Token → Add to GitHub Secrets as SONAR_TOKEN
   ```

### Verify Setup

Run the security workflow manually:
```bash
# Go to GitHub Actions
# Select "Security Scan" workflow
# Click "Run workflow" → "Run workflow"
```

Or push a commit:
```bash
git commit -m "test: trigger security scan"
git push
```

## 📈 Monitoring & Reports

### View Results

1. **GitHub Security Tab**:
   - Navigate to `Security` → `Code scanning alerts`
   - View all SARIF reports from Snyk, CodeQL, Trivy

2. **GitHub Actions**:
   - View workflow runs with detailed logs
   - Download artifacts (reports in HTML/JSON/SARIF)

3. **External Dashboards**:
   - **GitGuardian**: https://dashboard.gitguardian.com/
   - **Snyk**: https://app.snyk.io/
   - **SonarCloud**: https://sonarcloud.io/

### Report Artifacts

Each workflow run produces downloadable reports:
- `snyk-security-report` - JSON with vulnerability details
- `dependency-check-report` - HTML OWASP report
- `spotbugs-report` - XML with bug findings
- `trivy-security-report` - JSON container scan results
- `sonarqube-quality-gate` - Quality gate status

## 🎯 Quality Gates & Thresholds

### Snyk
- Severity threshold: **HIGH**
- Fails on: Critical or High severity vulnerabilities
- Includes: License compliance checks

### SonarQube
- Quality Gate: Default from SonarCloud
- Coverage: Minimum 80% (configured in project)
- Security Hotspots: Must be reviewed

### OWASP Dependency-Check
- CVSS threshold: **7.0** (HIGH)
- Fails on: Vulnerabilities ≥ 7.0

### SpotBugs
- Effort: Max
- Threshold: Low (reports all issues)
- FindSecBugs plugin: Enabled for security patterns

## 🔐 Security Best Practices

### Secret Management
- ✅ Never commit secrets to Git
- ✅ Use GitHub Secrets for CI/CD
- ✅ Rotate API keys regularly
- ✅ Use environment-specific credentials

### Dependency Management
- ✅ Keep dependencies updated
- ✅ Review Snyk/Dependabot PRs promptly
- ✅ Use exact versions (not ranges)
- ✅ Audit transitive dependencies

### Code Security
- ✅ Address High/Critical findings immediately
- ✅ Review security hotspots in SonarQube
- ✅ Follow OWASP Top 10 guidelines
- ✅ Implement security testing in dev cycle

## 📚 Additional Resources

### Documentation
- [GitGuardian Docs](https://docs.gitguardian.com/)
- [Snyk Documentation](https://docs.snyk.io/)
- [SonarQube Security](https://docs.sonarqube.org/latest/user-guide/security-reports/)
- [OWASP Top 10](https://owasp.org/www-project-top-ten/)

### Training
- [Snyk Learn](https://learn.snyk.io/) - Free security education
- [OWASP CheatSheets](https://cheatsheetseries.owasp.org/)
- [GitHub Security Lab](https://securitylab.github.com/)

## 🆘 Troubleshooting

### GitGuardian Issues
**Problem**: `Error: GitGuardian API key not found`
**Solution**: Add `GITGUARDIAN_API_KEY` to GitHub Secrets. Workflow will fall back to Gitleaks.

### Snyk Issues
**Problem**: `Snyk test failed: Unauthorized`
**Solution**: Verify `SNYK_TOKEN` is correct and has repository access permissions.

### SonarQube Issues
**Problem**: `Quality Gate failed`
**Solution**: Review findings in SonarCloud dashboard and address issues. Consider adjusting thresholds.

**Problem**: `403 Forbidden`
**Solution**: Regenerate `SONAR_TOKEN` and update GitHub secret.

### Rate Limits
All tools have API rate limits:
- **GitGuardian**: Depends on plan
- **Snyk**: 200 tests/month (free tier)
- **SonarCloud**: No hard limits for public repos

## ✅ Verification Checklist

- [ ] GitGuardian API key configured
- [ ] Snyk token configured
- [ ] SonarCloud token configured
- [ ] Security workflow runs successfully
- [ ] No secrets detected in code
- [ ] All dependencies scanned
- [ ] SonarQube Quality Gate passes
- [ ] Security tab shows no critical issues
- [ ] Team has access to external dashboards

## 🎓 Why These Three Tools?

### Criterion: "Security is analyzed using GitGuardian, Snyk, and SonarQube"

1. **GitGuardian**: Industry-leading **secret detection** with the largest pattern database
2. **Snyk**: Best-in-class **dependency security** with proprietary vulnerability data + auto-fix
3. **SonarQube/SonarCloud**: Comprehensive **SAST + quality** analysis with OWASP coverage

These three tools provide **complete coverage**:
- **Pre-commit**: GitGuardian prevents secrets from being committed
- **Build-time**: Snyk scans dependencies during CI
- **Code-level**: SonarQube analyzes source code for vulnerabilities

**Result**: Defense-in-depth security posture meeting industry best practices.
