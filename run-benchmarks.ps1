# JMH Benchmark Runner Script
# PowerShell script to easily run JMH benchmarks

Write-Host "========================================" -ForegroundColor Cyan
Write-Host "   JMH Microbenchmark Test Runner" -ForegroundColor Cyan
Write-Host "========================================" -ForegroundColor Cyan
Write-Host ""

$projectDir = "c:\Users\alfon\Desktop\Prog SwD\progetto_SwD"
Set-Location $projectDir

Write-Host "Project Directory: $projectDir" -ForegroundColor Yellow
Write-Host ""

# Menu
Write-Host "Select benchmark to run:" -ForegroundColor Green
Write-Host "1. All Benchmarks" -ForegroundColor White
Write-Host "2. CheckoutService Benchmark (Most Demanding Component)" -ForegroundColor White
Write-Host "3. UUID Generation Benchmark" -ForegroundColor White
Write-Host "4. Entity Operations Benchmark" -ForegroundColor White
Write-Host "5. DTO Operations Benchmark" -ForegroundColor White
Write-Host "6. Compile Only (no benchmarks)" -ForegroundColor White
Write-Host "7. Run with JSON output" -ForegroundColor White
Write-Host "8. Quick test (1 warmup, 2 measurements)" -ForegroundColor White
Write-Host ""

$choice = Read-Host "Enter choice (1-8)"

Write-Host ""
Write-Host "Compiling project..." -ForegroundColor Yellow

# Compile first
$compileResult = mvn clean test-compile 2>&1 | Out-String

if ($compileResult -match "BUILD SUCCESS") {
    Write-Host "✓ Compilation successful!" -ForegroundColor Green
    Write-Host ""
} else {
    Write-Host "✗ Compilation failed!" -ForegroundColor Red
    Write-Host $compileResult
    exit 1
}

if ($choice -eq "6") {
    Write-Host "Compilation complete. Exiting." -ForegroundColor Green
    exit 0
}

# Set classpath
$classpath = "target\test-classes;target\classes"

# Run selected benchmark
switch ($choice) {
    "1" {
        Write-Host "Running ALL benchmarks..." -ForegroundColor Yellow
        Write-Host "This may take 5-10 minutes..." -ForegroundColor Yellow
        Write-Host ""
        java -cp $classpath org.openjdk.jmh.Main
    }
    "2" {
        Write-Host "Running CheckoutService Benchmark..." -ForegroundColor Yellow
        Write-Host ""
        java -cp $classpath org.openjdk.jmh.Main CheckoutServiceBenchmark
    }
    "3" {
        Write-Host "Running UUID Generation Benchmark..." -ForegroundColor Yellow
        Write-Host ""
        java -cp $classpath org.openjdk.jmh.Main UuidGenerationBenchmark
    }
    "4" {
        Write-Host "Running Entity Operations Benchmark..." -ForegroundColor Yellow
        Write-Host ""
        java -cp $classpath org.openjdk.jmh.Main EntityOperationsBenchmark
    }
    "5" {
        Write-Host "Running DTO Operations Benchmark..." -ForegroundColor Yellow
        Write-Host ""
        java -cp $classpath org.openjdk.jmh.Main DtoOperationsBenchmark
    }
    "7" {
        Write-Host "Running ALL benchmarks with JSON output..." -ForegroundColor Yellow
        Write-Host "Results will be saved to: benchmark-results.json" -ForegroundColor Cyan
        Write-Host ""
        java -cp $classpath org.openjdk.jmh.Main -rf json -rff benchmark-results.json
        Write-Host ""
        Write-Host "Results saved! Upload to https://jmh.morethan.io/ for visualization" -ForegroundColor Green
    }
    "8" {
        Write-Host "Running quick test (reduced iterations)..." -ForegroundColor Yellow
        Write-Host ""
        java -cp $classpath org.openjdk.jmh.Main -wi 1 -i 2
    }
    default {
        Write-Host "Invalid choice!" -ForegroundColor Red
        exit 1
    }
}

Write-Host ""
Write-Host "========================================" -ForegroundColor Cyan
Write-Host "   Benchmark Complete!" -ForegroundColor Cyan
Write-Host "========================================" -ForegroundColor Cyan
Write-Host ""
Write-Host "For more information, see:" -ForegroundColor Green
Write-Host "  - JMH_BENCHMARK_GUIDE.md (comprehensive guide)" -ForegroundColor White
Write-Host "  - JMH_BENCHMARK_SUMMARY.md (summary and results)" -ForegroundColor White
Write-Host ""
