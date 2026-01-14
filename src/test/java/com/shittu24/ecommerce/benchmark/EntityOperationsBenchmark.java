package com.shittu24.ecommerce.benchmark;

import com.shittu24.ecommerce.entity.Address;
import com.shittu24.ecommerce.entity.Customer;
import com.shittu24.ecommerce.entity.Order;
import com.shittu24.ecommerce.entity.OrderItem;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * JMH Microbenchmark for Entity Operations
 * Tests the performance of critical entity operations:
 * - Order creation and item addition
 * - Customer creation and order assignment
 * - Address setting
 * - Relationship management
 * 
 * These operations are fundamental to the e-commerce checkout process
 * 
 * Run with: mvn clean test-compile exec:exec@run-benchmarks
 * Or: java -cp target/test-classes:target/classes org.openjdk.jmh.Main EntityOperationsBenchmark
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class EntityOperationsBenchmark {

    private Address billingAddress;
    private Address shippingAddress;
    private Customer customer;
    private Order order;
    private Set<OrderItem> orderItems;

    @Setup(Level.Iteration)
    public void setup() {
        // Setup addresses
        billingAddress = new Address();
        billingAddress.setStreet("123 Main St");
        billingAddress.setCity("Boston");
        billingAddress.setState("MA");
        billingAddress.setCountry("USA");
        billingAddress.setZipCode("02101");

        shippingAddress = new Address();
        shippingAddress.setStreet("456 Oak Ave");
        shippingAddress.setCity("Cambridge");
        shippingAddress.setState("MA");
        shippingAddress.setCountry("USA");
        shippingAddress.setZipCode("02138");

        // Setup customer
        customer = new Customer();
        customer.setId(1L);
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setEmail("john.doe@example.com");

        // Setup order
        order = new Order();
        order.setOrderTrackingNumber(UUID.randomUUID().toString());
        order.setTotalQuantity(5);
        order.setTotalPrice(new BigDecimal("500.00"));
        order.setStatus("Processing");
        order.setDateCreated(new Date());
        order.setLastUpdated(new Date());

        // Setup order items
        orderItems = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            OrderItem item = new OrderItem();
            item.setId((long) i);
            item.setQuantity(1);
            item.setUnitPrice(new BigDecimal("100.00"));
            item.setImageUrl("https://example.com/product" + i + ".jpg");
            orderItems.add(item);
        }
    }

    /**
     * Benchmark: Create a new Order entity
     */
    @Benchmark
    public void benchmarkCreateOrder(Blackhole blackhole) {
        Order newOrder = new Order();
        newOrder.setOrderTrackingNumber(UUID.randomUUID().toString());
        newOrder.setTotalQuantity(3);
        newOrder.setTotalPrice(new BigDecimal("300.00"));
        newOrder.setStatus("New");
        newOrder.setDateCreated(new Date());
        newOrder.setLastUpdated(new Date());
        blackhole.consume(newOrder);
    }

    /**
     * Benchmark: Add single OrderItem to Order
     */
    @Benchmark
    public void benchmarkAddSingleOrderItem(Blackhole blackhole) {
        Order testOrder = new Order();
        OrderItem item = new OrderItem();
        item.setQuantity(1);
        item.setUnitPrice(new BigDecimal("50.00"));
        
        testOrder.add(item);
        blackhole.consume(testOrder);
    }

    /**
     * Benchmark: Add multiple OrderItems to Order (5 items)
     */
    @Benchmark
    public void benchmarkAddMultipleOrderItems(Blackhole blackhole) {
        Order testOrder = new Order();
        for (int i = 0; i < 5; i++) {
            OrderItem item = new OrderItem();
            item.setQuantity(1);
            item.setUnitPrice(new BigDecimal("100.00"));
            testOrder.add(item);
        }
        blackhole.consume(testOrder);
    }

    /**
     * Benchmark: Add Order to Customer (relationship management)
     */
    @Benchmark
    public void benchmarkAddOrderToCustomer(Blackhole blackhole) {
        Customer testCustomer = new Customer();
        testCustomer.setFirstName("Jane");
        testCustomer.setLastName("Smith");
        testCustomer.setEmail("jane.smith@example.com");
        
        Order testOrder = new Order();
        testOrder.setOrderTrackingNumber(UUID.randomUUID().toString());
        testOrder.setTotalPrice(new BigDecimal("200.00"));
        
        testCustomer.add(testOrder);
        blackhole.consume(testCustomer);
    }

    /**
     * Benchmark: Set addresses on Order
     */
    @Benchmark
    public void benchmarkSetOrderAddresses(Blackhole blackhole) {
        Order testOrder = new Order();
        testOrder.setBillingAddress(billingAddress);
        testOrder.setShippingAddress(shippingAddress);
        blackhole.consume(testOrder);
    }

    /**
     * Benchmark: Complete Order setup (realistic scenario)
     * Creates order, adds items, sets addresses, and associates with customer
     */
    @Benchmark
    public void benchmarkCompleteOrderSetup(Blackhole blackhole) {
        // Create customer
        Customer testCustomer = new Customer();
        testCustomer.setFirstName("Test");
        testCustomer.setLastName("User");
        testCustomer.setEmail("test@example.com");
        
        // Create order
        Order testOrder = new Order();
        testOrder.setOrderTrackingNumber(UUID.randomUUID().toString());
        testOrder.setTotalQuantity(3);
        testOrder.setTotalPrice(new BigDecimal("300.00"));
        testOrder.setStatus("Processing");
        testOrder.setDateCreated(new Date());
        
        // Add items
        for (int i = 0; i < 3; i++) {
            OrderItem item = new OrderItem();
            item.setQuantity(1);
            item.setUnitPrice(new BigDecimal("100.00"));
            testOrder.add(item);
        }
        
        // Set addresses
        testOrder.setBillingAddress(billingAddress);
        testOrder.setShippingAddress(shippingAddress);
        
        // Associate with customer
        testCustomer.add(testOrder);
        
        blackhole.consume(testCustomer);
    }

    /**
     * Benchmark: Create Customer entity
     */
    @Benchmark
    public void benchmarkCreateCustomer(Blackhole blackhole) {
        Customer newCustomer = new Customer();
        newCustomer.setFirstName("New");
        newCustomer.setLastName("Customer");
        newCustomer.setEmail("new.customer@example.com");
        blackhole.consume(newCustomer);
    }

    /**
     * Benchmark: Create OrderItem entity
     */
    @Benchmark
    public void benchmarkCreateOrderItem(Blackhole blackhole) {
        OrderItem item = new OrderItem();
        item.setQuantity(2);
        item.setUnitPrice(new BigDecimal("75.50"));
        item.setImageUrl("https://example.com/product.jpg");
        blackhole.consume(item);
    }

    /**
     * Benchmark: Create Address entity
     */
    @Benchmark
    public void benchmarkCreateAddress(Blackhole blackhole) {
        Address address = new Address();
        address.setStreet("789 Elm St");
        address.setCity("New York");
        address.setState("NY");
        address.setCountry("USA");
        address.setZipCode("10001");
        blackhole.consume(address);
    }

    /**
     * Benchmark: BigDecimal calculations (price calculations)
     */
    @Benchmark
    public void benchmarkPriceCalculations(Blackhole blackhole) {
        BigDecimal unitPrice = new BigDecimal("99.99");
        int quantity = 5;
        BigDecimal totalPrice = unitPrice.multiply(new BigDecimal(quantity));
        blackhole.consume(totalPrice);
    }

    /**
     * Benchmark: HashSet operations for OrderItems
     */
    @Benchmark
    public void benchmarkOrderItemsSetOperations(Blackhole blackhole) {
        Set<OrderItem> items = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            OrderItem item = new OrderItem();
            item.setId((long) i);
            item.setQuantity(1);
            item.setUnitPrice(new BigDecimal("50.00"));
            items.add(item);
        }
        blackhole.consume(items);
    }

    /**
     * Benchmark: Large order with 20 items (stress test)
     */
    @Benchmark
    public void benchmarkLargeOrderCreation(Blackhole blackhole) {
        Order testOrder = new Order();
        testOrder.setOrderTrackingNumber(UUID.randomUUID().toString());
        
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (int i = 0; i < 20; i++) {
            OrderItem item = new OrderItem();
            item.setQuantity(1);
            BigDecimal price = new BigDecimal("100.00");
            item.setUnitPrice(price);
            testOrder.add(item);
            totalPrice = totalPrice.add(price);
        }
        
        testOrder.setTotalQuantity(20);
        testOrder.setTotalPrice(totalPrice);
        testOrder.setBillingAddress(billingAddress);
        testOrder.setShippingAddress(shippingAddress);
        
        blackhole.consume(testOrder);
    }
}
