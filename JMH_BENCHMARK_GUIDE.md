# JMH Microbenchmark Documentation

## Overview

This project includes comprehensive JMH (Java Microbenchmark Harness) microbenchmarks to test the performance of the most demanding components of the e-commerce application.

## Benchmarked Components

### 1. CheckoutServiceBenchmark
**File:** `src/test/java/com/shittu24/ecommerce/benchmark/CheckoutServiceBenchmark.java`

Tests the performance of the **CheckoutService** - the most critical component of the application:
- **benchmarkPlaceOrderNewCustomer**: Measures order placement for new customers
- **benchmarkPlaceOrderExistingCustomer**: Tests customer lookup and reuse performance
- **benchmarkPlaceOrderMultipleItems**: Evaluates performance with large orders (10 items)
- **benchmarkPlaceOrderThroughput**: Measures throughput (operations per second)

### 2. UuidGenerationBenchmark
**File:** `src/test/java/com/shittu24/ecommerce/benchmark/UuidGenerationBenchmark.java`

Tests the performance of UUID generation for order tracking numbers:
- **benchmarkSingleUuidGeneration**: Single UUID generation performance
- **benchmarkBatchUuidGeneration10**: Batch generation (10 UUIDs)
- **benchmarkBatchUuidGeneration100**: High-load batch generation (100 UUIDs)
- **benchmarkUuidWithToString**: UUID with toString conversion overhead
- **benchmarkUuidWithoutToString**: Baseline UUID generation
- **benchmarkUuidUniqueness**: Verifies uniqueness of 1000 UUIDs

### 3. EntityOperationsBenchmark
**File:** `src/test/java/com/shittu24/ecommerce/benchmark/EntityOperationsBenchmark.java`

Tests the performance of entity operations:
- **benchmarkCreateOrder**: Order entity creation
- **benchmarkAddSingleOrderItem**: Adding one item to order
- **benchmarkAddMultipleOrderItems**: Adding 5 items to order
- **benchmarkAddOrderToCustomer**: Customer-order relationship management
- **benchmarkSetOrderAddresses**: Setting billing/shipping addresses
- **benchmarkCompleteOrderSetup**: Complete realistic order setup
- **benchmarkCreateCustomer**: Customer entity creation
- **benchmarkCreateOrderItem**: OrderItem entity creation
- **benchmarkCreateAddress**: Address entity creation
- **benchmarkPriceCalculations**: BigDecimal price calculations
- **benchmarkOrderItemsSetOperations**: HashSet operations for items
- **benchmarkLargeOrderCreation**: Stress test with 20 items

## Running the Benchmarks

### Option 1: Using Maven (Recommended)

```bash
# Compile the project and benchmarks
mvn clean test-compile

# Run all benchmarks
mvn exec:exec@run-benchmarks

# Or use the integration-test phase
mvn clean integration-test
```

### Option 2: Run Specific Benchmark

```bash
# Run only CheckoutServiceBenchmark
mvn exec:exec -Dexec.args="CheckoutServiceBenchmark"

# Run only UuidGenerationBenchmark
mvn exec:exec -Dexec.args="UuidGenerationBenchmark"

# Run only EntityOperationsBenchmark
mvn exec:exec -Dexec.args="EntityOperationsBenchmark"
```

### Option 3: Direct Java Execution

```bash
# Compile first
mvn clean test-compile

# Run from command line
java -cp "target/test-classes;target/classes" org.openjdk.jmh.Main

# Run specific benchmark
java -cp "target/test-classes;target/classes" org.openjdk.jmh.Main CheckoutServiceBenchmark

# Run with specific pattern
java -cp "target/test-classes;target/classes" org.openjdk.jmh.Main ".*placeOrder.*"
```

### Option 4: Run with Custom JMH Options

```bash
# Run with 10 warmup iterations and 10 measurement iterations
java -cp "target/test-classes;target/classes" org.openjdk.jmh.Main -wi 10 -i 10

# Run with different fork count
java -cp "target/test-classes;target/classes" org.openjdk.jmh.Main -f 2

# Generate JSON results
java -cp "target/test-classes;target/classes" org.openjdk.jmh.Main -rf json -rff results.json

# Run single benchmark method
java -cp "target/test-classes;target/classes" org.openjdk.jmh.Main CheckoutServiceBenchmark.benchmarkPlaceOrderNewCustomer
```

## Understanding the Results

### Result Metrics

JMH provides several measurement modes:

1. **AverageTime**: Average time per operation (lower is better)
   - Units: microseconds (µs) or nanoseconds (ns)
   - Example: `5.234 ± 0.123 µs/op` means 5.234 microseconds per operation

2. **Throughput**: Operations per time unit (higher is better)
   - Units: ops/s (operations per second)
   - Example: `1000.5 ± 50.2 ops/s` means 1000 operations per second

3. **SingleShotTime**: Time for a single execution
   - Useful for measuring cold start performance

### Sample Output

```
Benchmark                                                Mode  Cnt    Score    Error  Units
CheckoutServiceBenchmark.benchmarkPlaceOrderNewCustomer  avgt    5   45.123 ±  2.456  µs/op
CheckoutServiceBenchmark.benchmarkPlaceOrderThroughput   thrpt   5  22000    ± 1100   ops/s
UuidGenerationBenchmark.benchmarkSingleUuidGeneration    avgt    5    2.345 ±  0.123  µs/op
EntityOperationsBenchmark.benchmarkCreateOrder           avgt    5  120.456 ±  5.678  ns/op
```

### Interpreting Results

- **Score**: The measured performance value
- **Error**: The margin of error (95% confidence interval)
- **Lower error values** indicate more stable/consistent performance
- **Compare baseline vs optimized** implementations to measure improvements

## Benchmark Configuration

All benchmarks are configured with:
- **Warmup iterations**: 3 iterations, 1 second each
- **Measurement iterations**: 5 iterations, 1 second each
- **Fork**: 1 (runs in separate JVM process)
- **State**: Thread scope (each thread gets its own state)

### Why These Settings?

- **Warmup**: Allows JIT compiler to optimize the code
- **Measurement**: Provides statistically significant results
- **Fork**: Isolates benchmark from other processes
- **Thread scope**: Ensures thread safety and independence

## Performance Optimization Guidelines

### CheckoutService Performance
- **Target**: < 50 µs per operation for new customer checkout
- **Critical factors**:
  - Repository mock performance
  - Entity relationship setup
  - UUID generation overhead

### UUID Generation Performance
- **Target**: < 3 µs per UUID generation
- **Optimization considerations**:
  - Use UUID.randomUUID() directly (it's already optimized)
  - Avoid unnecessary toString() calls until needed
  - Consider caching for non-critical IDs (not recommended for order tracking)

### Entity Operations Performance
- **Target**: < 200 ns for simple entity creation
- **Optimization considerations**:
  - Minimize constructor logic
  - Use lazy initialization for collections
  - Optimize BigDecimal operations (use valueOf for small integers)

## Troubleshooting

### Issue: Benchmarks take too long
**Solution**: Reduce iterations temporarily for testing
```bash
java -cp "target/test-classes;target/classes" org.openjdk.jmh.Main -wi 1 -i 2
```

### Issue: OutOfMemoryError
**Solution**: Increase heap size
```bash
java -Xmx2g -cp "target/test-classes;target/classes" org.openjdk.jmh.Main
```

### Issue: Inconsistent results
**Solution**: 
- Close other applications
- Disable CPU power saving
- Increase measurement iterations
- Run with more forks

### Issue: ClassNotFoundException
**Solution**: Ensure compilation is complete
```bash
mvn clean test-compile
```

## Best Practices

1. **Run on idle system**: Close other applications
2. **Multiple runs**: Run benchmarks multiple times to verify consistency
3. **Baseline comparison**: Always compare against a baseline
4. **Document changes**: Record what optimizations were tested
5. **Use profilers**: Combine with profiling tools (VisualVM, YourKit) for deep analysis

## Dependencies

The following dependencies are required (already configured in pom.xml):

```xml
<dependency>
    <groupId>org.openjdk.jmh</groupId>
    <artifactId>jmh-core</artifactId>
    <version>1.37</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.openjdk.jmh</groupId>
    <artifactId>jmh-generator-annprocess</artifactId>
    <version>1.37</version>
    <scope>test</scope>
</dependency>
```

## Resources

- **JMH Official**: https://github.com/openjdk/jmh
- **JMH Samples**: https://github.com/openjdk/jmh/tree/master/jmh-samples
- **JMH Visualizer**: https://jmh.morethan.io/ (paste your JSON results)

## CI/CD Integration

To integrate benchmarks into CI/CD pipeline:

```yaml
# Example GitHub Actions
- name: Run JMH Benchmarks
  run: mvn clean test-compile exec:exec@run-benchmarks -Dexec.args="-rf json -rff benchmark-results.json"
  
- name: Archive benchmark results
  uses: actions/upload-artifact@v2
  with:
    name: benchmark-results
    path: benchmark-results.json
```

## Monitoring Performance Over Time

Track benchmark results over time to detect performance regressions:

1. **Save results**: `mvn exec:exec -Dexec.args="-rf json -rff results-$(date +%Y%m%d).json"`
2. **Compare**: Use JMH Visualizer or custom scripts
3. **Alert on regression**: Set thresholds for acceptable performance

## Contact & Support

For questions or issues with benchmarks, refer to the project documentation or contact the development team.

---

**Last Updated**: January 2026
**JMH Version**: 1.37
**Java Version**: 17
