# GitHub Secrets Configuration

This document lists all GitHub Secrets required for the CI/CD pipeline and security workflows.

## 🔐 Required Secrets

### Primary Security Tools (Required by Criterion)

#### 1. GITGUARDIAN_API_KEY
- **Tool**: GitGuardian
- **Purpose**: Secret scanning and detection
- **Required**: ✅ Yes (criterion requirement)
- **How to get**:
  1. Sign up at https://www.gitguardian.com/
  2. Navigate to API → Personal Access Tokens
  3. Create new token with repository scanning permissions
- **Fallback**: Uses Gitleaks if not configured

#### 2. SNYK_TOKEN
- **Tool**: Snyk
- **Purpose**: Dependency vulnerability scanning
- **Required**: ✅ Yes (criterion requirement)
- **How to get**:
  1. Sign up at https://snyk.io/
  2. Go to Account Settings → Auth Token
  3. Copy token (or generate new one)
- **Free tier**: 200 tests/month for open source

#### 3. SONAR_TOKEN
- **Tool**: SonarQube/SonarCloud
- **Purpose**: Code quality and security analysis
- **Required**: ✅ Yes (criterion requirement)
- **How to get**:
  1. Sign up at https://sonarcloud.io/
  2. Navigate to My Account → Security
  3. Generate new token
- **Free**: For public repositories

### Optional/Enhancement Secrets

#### 4. NVD_API_KEY
- **Tool**: OWASP Dependency-Check
- **Purpose**: CVE vulnerability scanning via National Vulnerability Database
- **Required**: ⚠️ Highly Recommended
- **How to get**:
  1. Request at https://nvd.nist.gov/developers/request-an-api-key
  2. Free API key via email (instant)
- **Note**: Without this, OWASP Dependency-Check will be skipped

#### 5. GITLEAKS_LICENSE
- **Tool**: Gitleaks
- **Purpose**: Backup secret scanning (if GitGuardian not available)
- **Required**: ❌ Optional
- **How to get**: Only needed for Gitleaks Pro features
- **Note**: Open source version works without license

#### 6. GITHUB_TOKEN
- **Tool**: GitHub Actions
- **Purpose**: Automatically provided by GitHub Actions
- **Required**: ✅ Automatic
- **Note**: No configuration needed - automatically available in workflows

## 📝 How to Add Secrets

### Via GitHub Web Interface

1. Go to your repository on GitHub
2. Click **Settings** → **Secrets and variables** → **Actions**
3. Click **New repository secret**
4. Enter:
   - **Name**: Exact name from list above (case-sensitive)
   - **Value**: Your API key/token
5. Click **Add secret**

### Via GitHub CLI

```bash
# Set a secret using GitHub CLI
gh secret set GITGUARDIAN_API_KEY

# Or provide value directly
echo "your-api-key-here" | gh secret set GITGUARDIAN_API_KEY

# Set multiple secrets from file
gh secret set SNYK_TOKEN < snyk_token.txt
gh secret set SONAR_TOKEN < sonar_token.txt
```

## 🎯 Priority Setup Order

### Immediate (Required by Security Criterion)
1. **GITGUARDIAN_API_KEY** - Secret scanning
2. **SNYK_TOKEN** - Dependency security  
3. **SONAR_TOKEN** - Code quality & security

### High Priority (Enhanced Security)
4. **NVD_API_KEY** - CVE scanning

### Optional
5. **GITLEAKS_LICENSE** - Only if using Gitleaks Pro

## ✅ Verification

### Check if Secrets are Set

```bash
# List all secrets (values are hidden)
gh secret list

# Expected output:
# GITGUARDIAN_API_KEY    Updated 2026-01-14
# SNYK_TOKEN            Updated 2026-01-14
# SONAR_TOKEN           Updated 2026-01-14
# NVD_API_KEY           Updated 2026-01-14
```

### Test Workflow

1. Go to **Actions** tab
2. Select **Security Scan** workflow
3. Click **Run workflow** → **Run workflow**
4. Wait for completion
5. Check that all jobs complete successfully

### Verify in Workflow Logs

Look for these indicators in workflow logs:

```
✅ Using GitGuardian API key for secret scanning
✅ Running Snyk security scan
✅ Running SonarQube analysis
✅ Using NVD API Key for dependency check
```

If you see warnings like:
```
⚠️ WARNING: GITGUARDIAN_API_KEY not configured
⚠️ WARNING: SNYK_TOKEN not configured
⚠️ WARNING: SONAR_TOKEN not configured
```

Then the corresponding secret needs to be added.

## 🔄 Secret Rotation

### Best Practices

- **Rotate secrets** every 90 days
- **Revoke old tokens** immediately after updating
- **Use service accounts** when possible
- **Monitor token usage** in respective platforms

### How to Rotate

1. Generate new token/key in service platform
2. Update GitHub secret with new value
3. Verify workflow still works
4. Revoke old token/key
5. Document rotation date

### Rotation Schedule

```bash
# Set reminders for:
GITGUARDIAN_API_KEY: Every 90 days
SNYK_TOKEN: Every 90 days
SONAR_TOKEN: Every 90 days
NVD_API_KEY: Yearly
```

## 🚨 Security Considerations

### Do's ✅
- ✅ Use separate tokens for different environments (dev/staging/prod)
- ✅ Limit token permissions to minimum required
- ✅ Monitor token usage in service dashboards
- ✅ Revoke tokens immediately if compromised
- ✅ Use organization-level secrets for shared projects

### Don'ts ❌
- ❌ Never commit secrets to Git (even in private repos)
- ❌ Don't share tokens via email or chat
- ❌ Don't use personal tokens for organization projects
- ❌ Don't reuse tokens across multiple projects
- ❌ Don't store tokens in code or config files

## 📊 Secret Usage Matrix

| Secret | Used By | Frequency | Impact if Missing |
|--------|---------|-----------|-------------------|
| GITGUARDIAN_API_KEY | security.yml | Every push/PR | Falls back to Gitleaks |
| SNYK_TOKEN | security.yml | Every push/PR | Dependency scan skipped |
| SONAR_TOKEN | security.yml, ci.yml | Every push/PR | Code quality scan skipped |
| NVD_API_KEY | security.yml | Weekly + push | OWASP check skipped |
| GITHUB_TOKEN | All workflows | Always | Workflow fails completely |

## 🆘 Troubleshooting

### Issue: "Secret not found"
**Cause**: Secret name mismatch or not set
**Solution**: 
```bash
# Check exact name
gh secret list

# Ensure name matches exactly (case-sensitive)
# Correct: GITGUARDIAN_API_KEY
# Wrong: gitguardian_api_key, GitGuardian_Api_Key
```

### Issue: "Unauthorized" or "403 Forbidden"
**Cause**: Invalid or expired token
**Solution**: 
1. Verify token in service platform
2. Generate new token if expired
3. Update GitHub secret with new value

### Issue: "Rate limit exceeded"
**Cause**: Free tier limits reached
**Solution**:
- **Snyk**: Upgrade plan or reduce test frequency
- **SonarCloud**: Usually no limits for public repos
- **GitGuardian**: Check your plan limits

### Issue: Workflow skips security jobs
**Cause**: Secrets conditionally used
**Solution**: Check workflow logs for specific warnings about which secrets are missing

## 📚 Additional Resources

- [GitHub Encrypted Secrets](https://docs.github.com/en/actions/security-guides/encrypted-secrets)
- [GitGuardian Setup](https://docs.gitguardian.com/)
- [Snyk Authentication](https://docs.snyk.io/snyk-cli/authenticate-the-cli-with-your-account)
- [SonarCloud Setup](https://docs.sonarcloud.io/getting-started/github/)
- [NVD API Key](https://nvd.nist.gov/developers/request-an-api-key)

## ✅ Setup Completion Checklist

Use this checklist to ensure all secrets are properly configured:

- [ ] GITGUARDIAN_API_KEY added to GitHub Secrets
- [ ] SNYK_TOKEN added to GitHub Secrets  
- [ ] SONAR_TOKEN added to GitHub Secrets
- [ ] NVD_API_KEY added to GitHub Secrets (recommended)
- [ ] Verified secrets with `gh secret list`
- [ ] Triggered test workflow run
- [ ] All security jobs completed successfully
- [ ] Checked external dashboards (GitGuardian, Snyk, SonarCloud)
- [ ] Team members have access to service platforms
- [ ] Documented secret rotation schedule
- [ ] Set calendar reminders for rotation (90 days)

---

**Status**: Once all required secrets are configured, the security criterion will be fully satisfied with GitGuardian, Snyk, and SonarQube/SonarCloud actively scanning the codebase.
