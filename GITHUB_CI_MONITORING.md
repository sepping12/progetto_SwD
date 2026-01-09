# GitHub CI/CD Execution - Live Monitoring Guide

**Push Timestamp**: January 9, 2026, ~16:00 UTC+1  
**Repository**: https://github.com/sepping12/progetto_SwD  
**Commit**: `3a7fda3` - "feat: Implement CI/CD pipelines, Docker configuration, and JaCoCo coverage"

---

## 🚀 Workflows Triggered

Your push has automatically triggered both GitHub Actions workflows:

### 1. **ci.yml** - Continuous Integration Pipeline
**Status**: Check at https://github.com/sepping12/progetto_SwD/actions

**Expected Execution Time**: ~5-10 minutes

**Steps** (in order):
1. ✅ Checkout code
2. ✅ Set up Java 17 (Temurin)
3. ✅ Cache Maven dependencies
4. ✅ Make mvnw executable
5. ✅ Wait for MySQL service
6. ⏳ Build with Maven (mvn clean verify)
7. ⏳ Upload JaCoCo coverage report
8. ⏳ Comment PR with coverage (if PR)
9. ⏳ Run tests
10. ⏳ SonarCloud scan (optional, if SONAR_TOKEN configured)

**Success Indicators**:
- ✅ Green checkmark next to commit
- ✅ All steps completed without errors
- ✅ Coverage report generated
- ✅ Tests passed

### 2. **build.yml** - Docker Build & Push
**Status**: Check at https://github.com/sepping12/progetto_SwD/actions

**Expected Execution Time**: ~10-15 minutes

**Steps** (in order):
1. ✅ Checkout code
2. ✅ Set up Docker Buildx
3. ⏳ Log in to Docker Hub (skipped for PR)
4. ⏳ Extract metadata (tags, labels)
5. ⏳ Build and push Docker image
6. ⏳ Generate digest

**Success Indicators**:
- ✅ Docker image built successfully
- ✅ Image tags created (latest, main, commit SHA)
- ⏳ Pushed to DockerHub (requires DOCKER_USERNAME + DOCKER_PASSWORD secrets)

---

## 📊 Monitoring Your Workflows

### Option 1: GitHub Web UI
1. Go to: https://github.com/sepping12/progetto_SwD/actions
2. Look for workflows triggered at ~16:00
3. Click on each workflow to see detailed logs
4. Watch the progress in real-time

### Option 2: Command Line
```bash
# Check latest workflow status
git log --oneline | head -5

# View workflow results
# Results will show in GitHub Actions tab
```

### Option 3: Check Badges
Once workflows complete, your repo will have badges:
```markdown
[![CI/CD](https://github.com/sepping12/progetto_SwD/actions/workflows/ci.yml/badge.svg)](https://github.com/sepping12/progetto_SwD/actions/workflows/ci.yml)
[![Docker Build](https://github.com/sepping12/progetto_SwD/actions/workflows/build.yml/badge.svg)](https://github.com/sepping12/progetto_SwD/actions/workflows/build.yml)
```

---

## ✅ Expected Results

### **ci.yml** Should Complete With:
- ✅ BUILD SUCCESS
- ✅ Tests: 1 passed, 0 failed
- ✅ JaCoCo Coverage Report: Generated
- ✅ SonarCloud: Scanned (if configured)

**Artifacts Generated**:
- `jacoco-report/` - Coverage details
- `coverage-report/` - Coverage HTML

### **build.yml** Should Complete With:
- ✅ Docker image built
- ✅ Image tags created
- ⏳ Image pushed to DockerHub (if secrets configured)

**Image Tags Created**:
- `latest` (always points to main)
- `main` (branch name)
- `3a7fda3` (commit SHA)

---

## ⚠️ Potential Issues & Solutions

### Issue 1: "Jobs for this run haven't started yet"
**Cause**: GitHub is queuing your workflow  
**Solution**: Wait 1-2 minutes for execution to start

### Issue 2: ci.yml fails with "MySQL connection refused"
**Cause**: MySQL service didn't start in time  
**Solution**: Already fixed in ci.yml with health checks and wait logic

### Issue 3: build.yml skips Docker push
**Cause**: DOCKER_USERNAME or DOCKER_PASSWORD secrets not configured  
**Solution**: See "Required Secrets Setup" below

### Issue 4: SonarCloud step fails
**Cause**: SONAR_TOKEN not configured  
**Solution**: This is optional, can be skipped

### Issue 5: "Permission denied" on mvnw
**Already Fixed**: ci.yml includes `chmod +x mvnw` step

---

## 🔐 Required Secrets Setup (For Docker Push)

If you want `build.yml` to push to DockerHub:

1. Go to: https://github.com/sepping12/progetto_SwD/settings/secrets/actions
2. Click "New repository secret"
3. Add two secrets:

```
Name: DOCKER_USERNAME
Value: your-dockerhub-username

Name: DOCKER_PASSWORD  
Value: your-dockerhub-access-token
```

(Get access token from: https://hub.docker.com/settings/security)

---

## 📈 Monitoring Coverage

After ci.yml completes:

1. Go to commit: https://github.com/sepping12/progetto_SwD/commits/main
2. Click on commit `3a7fda3`
3. Download "jacoco-report" artifact
4. Open `index.html` in browser to view coverage

**Expected Coverage**: ~80-100% (depends on test scope)

---

## 🔍 Workflow Logs

To view detailed logs:

1. https://github.com/sepping12/progetto_SwD/actions
2. Click on workflow run (e.g., "feat: Implement CI/CD...")
3. Click on job (e.g., "build")
4. Expand steps to see logs

**Key Log Sections**:
- "Build with Maven" - compilation output
- "Run tests" - test results
- "Upload JaCoCo" - coverage report generation
- "Build and push Docker" - Docker build logs

---

## ✅ What To Expect In Next 15 Minutes

| Time | Event | Status |
|------|-------|--------|
| Now | Push to GitHub | ✅ Done |
| +30s | Workflows queued | ⏳ In progress |
| +1min | ci.yml starts | ⏳ In progress |
| +3min | Docker build starts | ⏳ In progress |
| +8min | ci.yml completes | ⏳ Expected |
| +12min | build.yml completes | ⏳ Expected |
| +15min | All workflows done | ⏳ Expected |

---

## 📋 Checklist While Waiting

- [ ] Push committed successfully (checked ✅)
- [ ] Go to GitHub Actions tab
- [ ] Watch ci.yml execution
- [ ] Watch build.yml execution
- [ ] Download coverage report when ready
- [ ] Check for Docker image in DockerHub (if secrets configured)
- [ ] Review any errors in logs
- [ ] Update status in roadmap

---

## 🎯 Next Steps After Workflows Complete

1. **If ci.yml passes**: ✅ Build & test working!
2. **If build.yml passes**: ✅ Docker image created!
3. **If both pass**: Ready for Section 2 (SonarCloud Analysis)

---

**Last Updated**: January 9, 2026  
**Guide Purpose**: Monitor GitHub Actions CI/CD execution
