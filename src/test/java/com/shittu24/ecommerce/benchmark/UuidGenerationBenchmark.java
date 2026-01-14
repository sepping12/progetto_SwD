package com.shittu24.ecommerce.benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * JMH Microbenchmark for UUID Generation
 * Tests the performance of generating unique order tracking numbers
 * This is a critical operation that happens for every order placed
 * 
 * Run with: mvn clean test-compile exec:exec@run-benchmarks
 * Or: java -cp target/test-classes:target/classes org.openjdk.jmh.Main UuidGenerationBenchmark
 */
@BenchmarkMode({Mode.AverageTime, Mode.Throughput})
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class UuidGenerationBenchmark {

    /**
     * Benchmark: Single UUID generation
     * Measures the time to generate one UUID (standard approach)
     */
    @Benchmark
    public void benchmarkSingleUuidGeneration(Blackhole blackhole) {
        String trackingNumber = UUID.randomUUID().toString();
        blackhole.consume(trackingNumber);
    }

    /**
     * Benchmark: Batch UUID generation (10 UUIDs)
     * Simulates generating tracking numbers for multiple orders
     */
    @Benchmark
    public void benchmarkBatchUuidGeneration10(Blackhole blackhole) {
        Set<String> trackingNumbers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            trackingNumbers.add(UUID.randomUUID().toString());
        }
        blackhole.consume(trackingNumbers);
    }

    /**
     * Benchmark: Batch UUID generation (100 UUIDs)
     * Tests performance under high load scenarios
     */
    @Benchmark
    public void benchmarkBatchUuidGeneration100(Blackhole blackhole) {
        Set<String> trackingNumbers = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            trackingNumbers.add(UUID.randomUUID().toString());
        }
        blackhole.consume(trackingNumbers);
    }

    /**
     * Benchmark: UUID generation with toString conversion overhead
     */
    @Benchmark
    public void benchmarkUuidWithToString(Blackhole blackhole) {
        UUID uuid = UUID.randomUUID();
        String trackingNumber = uuid.toString();
        blackhole.consume(trackingNumber);
    }

    /**
     * Benchmark: UUID generation without toString (baseline)
     */
    @Benchmark
    public void benchmarkUuidWithoutToString(Blackhole blackhole) {
        UUID uuid = UUID.randomUUID();
        blackhole.consume(uuid);
    }

    /**
     * Benchmark: Verify UUID uniqueness (critical for order tracking)
     * Generates 1000 UUIDs and ensures they're unique
     */
    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @Measurement(iterations = 5, batchSize = 1)
    public void benchmarkUuidUniqueness(Blackhole blackhole) {
        Set<String> uniqueIds = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            uniqueIds.add(UUID.randomUUID().toString());
        }
        // Verify all are unique
        boolean allUnique = uniqueIds.size() == 1000;
        blackhole.consume(allUnique);
    }
}
