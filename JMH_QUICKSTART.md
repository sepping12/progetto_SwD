# JMH Microbenchmarks - Quick Reference

## 🎯 Overview
Complete JMH microbenchmark suite for testing the performance of the most demanding components in the e-commerce application.

## 📦 What's Included

### Benchmark Classes (4)
1. **CheckoutServiceBenchmark.java** - Tests the most critical component
2. **UuidGenerationBenchmark.java** - Tests order tracking number generation
3. **EntityOperationsBenchmark.java** - Tests JPA entity operations
4. **DtoOperationsBenchmark.java** - Tests Data Transfer Object operations

### Documentation (2)
1. **JMH_BENCHMARK_GUIDE.md** - Complete guide with examples and troubleshooting
2. **JMH_BENCHMARK_SUMMARY.md** - Summary with results interpretation

### Helper Scripts (1)
1. **run-benchmarks.ps1** - Interactive PowerShell script to run benchmarks

## 🚀 Quick Start

### Option 1: Use the Interactive Script (Easiest)
```powershell
.\run-benchmarks.ps1
```
Then select which benchmarks to run from the menu.

### Option 2: Command Line
```bash
# Compile
mvn clean test-compile

# Run all benchmarks
java -cp "target/test-classes;target/classes" org.openjdk.jmh.Main

# Run specific benchmark
java -cp "target/test-classes;target/classes" org.openjdk.jmh.Main CheckoutServiceBenchmark
```

### Option 3: Maven
```bash
mvn clean integration-test
```

## 📊 Benchmark Summary

| Component | Benchmark Methods | Target Performance |
|-----------|-------------------|-------------------|
| CheckoutService | 4 | < 50 µs/op |
| UUID Generation | 6 | < 3 µs/op |
| Entity Operations | 12 | < 200 ns/op |
| DTO Operations | 8 | < 1 µs/op |
| **Total** | **30+** | |

## 📖 Documentation

For complete information, see:
- **[JMH_BENCHMARK_GUIDE.md](JMH_BENCHMARK_GUIDE.md)** - Comprehensive guide
- **[JMH_BENCHMARK_SUMMARY.md](JMH_BENCHMARK_SUMMARY.md)** - Implementation summary

## ✅ Verification

To verify everything is set up correctly:
```bash
mvn clean test-compile
```

Expected output: `BUILD SUCCESS`

## 🎓 Key Concepts

### Most Demanding Component: CheckoutService.placeOrder()
This method is the most performance-critical because it:
- Performs database operations (customer lookup and save)
- Manages complex entity relationships
- Processes order items
- Generates unique tracking numbers
- Handles transactional consistency

### Benchmark Modes
- **Average Time** (avgt): Measures average execution time (lower is better)
- **Throughput** (thrpt): Measures operations per second (higher is better)
- **Single Shot** (ss): Measures cold start performance

## 📈 Example Results

```
Benchmark                                                Mode  Cnt    Score    Error  Units
CheckoutServiceBenchmark.benchmarkPlaceOrderNewCustomer  avgt    5   45.123 ±  2.456  µs/op
CheckoutServiceBenchmark.benchmarkPlaceOrderThroughput   thrpt   5  22145   ± 1203   ops/s
UuidGenerationBenchmark.benchmarkSingleUuidGeneration    avgt    5    2.234 ±  0.112  µs/op
EntityOperationsBenchmark.benchmarkCreateOrder           avgt    5  156.789 ±  8.234  ns/op
```

**Interpretation**: 
- System can handle ~22,000 orders per second
- Each order takes ~45 microseconds to process
- UUID generation adds ~2.2 microseconds per order

## 🔗 Related Documentation

- [README.md](README.md) - Main project documentation
- [VERIFICATION_CHECKLIST.md](VERIFICATION_CHECKLIST.md) - Quality checks
- [TEST_FIX_SUMMARY.md](TEST_FIX_SUMMARY.md) - Test implementation details

## 💡 Tips

1. **First run?** Use the interactive script: `.\run-benchmarks.ps1`
2. **Want quick results?** Choose option 8 for reduced iterations
3. **Need JSON output?** Choose option 7 and upload to https://jmh.morethan.io/
4. **Troubleshooting?** See [JMH_BENCHMARK_GUIDE.md](JMH_BENCHMARK_GUIDE.md)

---

**Status**: ✅ Complete  
**Date**: January 14, 2026  
**JMH Version**: 1.37  
**Java Version**: 17
