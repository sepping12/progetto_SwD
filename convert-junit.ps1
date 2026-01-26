# Convert JUnit 4 to JUnit 5
$files = Get-ChildItem -Path "src\test\java\com\shittu24\ecommerce\generated" -Filter "RegressionTest*.java"

foreach ($file in $files) {
    Write-Host "Converting $($file.Name)..." -ForegroundColor Yellow
    
    $content = Get-Content $file.FullName -Raw
    
    # Replace imports
    $content = $content -replace 'import org\.junit\.FixMethodOrder;', "import org.junit.jupiter.api.MethodOrderer;`r`nimport org.junit.jupiter.api.TestMethodOrder;"
    $content = $content -replace 'import org\.junit\.Test;', 'import org.junit.jupiter.api.Test;'
    $content = $content -replace 'import org\.junit\.runners\.MethodSorters;', ''
    $content = $content -replace 'import org\.junit\.runner\.RunWith;', ''
    $content = $content -replace 'import org\.junit\.runners\.Suite;', ''
    
    # Replace annotations
    $content = $content -replace '@FixMethodOrder\(MethodSorters\.NAME_ASCENDING\)', '@TestMethodOrder(MethodOrderer.MethodName.class)'
    $content = $content -replace '@RunWith\(Suite\.class\)', ''
    $content = $content -replace '@Suite\.SuiteClasses\([^)]+\)', '// Suite managed by test framework'
    
    Set-Content -Path $file.FullName -Value $content -NoNewline
    Write-Host "✓ Converted $($file.Name)" -ForegroundColor Green
}

Write-Host "`n✓ All files converted!" -ForegroundColor Green
