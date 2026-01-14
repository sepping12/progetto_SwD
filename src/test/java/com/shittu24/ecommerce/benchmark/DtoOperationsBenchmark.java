package com.shittu24.ecommerce.benchmark;

import com.shittu24.ecommerce.dto.Purchase;
import com.shittu24.ecommerce.dto.PurchaseResponse;
import com.shittu24.ecommerce.entity.Address;
import com.shittu24.ecommerce.entity.Customer;
import com.shittu24.ecommerce.entity.Order;
import com.shittu24.ecommerce.entity.OrderItem;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * JMH Microbenchmark for DTO Operations
 * Tests the performance of Data Transfer Objects used in the checkout process
 * 
 * DTOs are critical for API performance as they're created for every request
 * 
 * Run with: mvn clean test-compile exec:exec@run-benchmarks
 * Or: java -cp target/test-classes:target/classes org.openjdk.jmh.Main DtoOperationsBenchmark
 */
@BenchmarkMode({Mode.AverageTime, Mode.Throughput})
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class DtoOperationsBenchmark {

    private Customer customer;
    private Order order;
    private Set<OrderItem> orderItems;
    private Address billingAddress;
    private Address shippingAddress;

    @Setup(Level.Iteration)
    public void setup() {
        customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setEmail("john.doe@example.com");

        order = new Order();
        order.setOrderTrackingNumber(UUID.randomUUID().toString());
        order.setTotalQuantity(3);
        order.setTotalPrice(new BigDecimal("300.00"));

        orderItems = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            OrderItem item = new OrderItem();
            item.setQuantity(1);
            item.setUnitPrice(new BigDecimal("100.00"));
            orderItems.add(item);
        }

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
    }

    /**
     * Benchmark: Create a Purchase DTO
     */
    @Benchmark
    public void benchmarkCreatePurchase(Blackhole blackhole) {
        Purchase purchase = new Purchase();
        purchase.setCustomer(customer);
        purchase.setOrder(order);
        purchase.setOrderItems(orderItems);
        purchase.setBillingAddress(billingAddress);
        purchase.setShippingAddress(shippingAddress);
        blackhole.consume(purchase);
    }

    /**
     * Benchmark: Create a PurchaseResponse DTO
     */
    @Benchmark
    public void benchmarkCreatePurchaseResponse(Blackhole blackhole) {
        String trackingNumber = UUID.randomUUID().toString();
        PurchaseResponse response = new PurchaseResponse(trackingNumber);
        blackhole.consume(response);
    }

    /**
     * Benchmark: Get all fields from Purchase DTO
     */
    @Benchmark
    public void benchmarkGetPurchaseFields(Blackhole blackhole) {
        Purchase purchase = new Purchase();
        purchase.setCustomer(customer);
        purchase.setOrder(order);
        purchase.setOrderItems(orderItems);
        purchase.setBillingAddress(billingAddress);
        purchase.setShippingAddress(shippingAddress);

        // Access all fields
        Customer c = purchase.getCustomer();
        Order o = purchase.getOrder();
        Set<OrderItem> items = purchase.getOrderItems();
        Address billing = purchase.getBillingAddress();
        Address shipping = purchase.getShippingAddress();

        blackhole.consume(c);
        blackhole.consume(o);
        blackhole.consume(items);
        blackhole.consume(billing);
        blackhole.consume(shipping);
    }

    /**
     * Benchmark: Complete Purchase DTO lifecycle (create and access)
     */
    @Benchmark
    public void benchmarkCompletePurchaseLifecycle(Blackhole blackhole) {
        // Create new entities
        Customer newCustomer = new Customer();
        newCustomer.setFirstName("Jane");
        newCustomer.setLastName("Smith");
        newCustomer.setEmail("jane@example.com");

        Order newOrder = new Order();
        newOrder.setTotalQuantity(2);
        newOrder.setTotalPrice(new BigDecimal("200.00"));

        Set<OrderItem> newItems = new HashSet<>();
        for (int i = 0; i < 2; i++) {
            OrderItem item = new OrderItem();
            item.setQuantity(1);
            item.setUnitPrice(new BigDecimal("100.00"));
            newItems.add(item);
        }

        Address newBilling = new Address();
        newBilling.setStreet("789 Pine St");
        newBilling.setCity("New York");
        newBilling.setState("NY");
        newBilling.setCountry("USA");
        newBilling.setZipCode("10001");

        Address newShipping = new Address();
        newShipping.setStreet("321 Oak St");
        newShipping.setCity("Brooklyn");
        newShipping.setState("NY");
        newShipping.setCountry("USA");
        newShipping.setZipCode("11201");

        // Create Purchase
        Purchase purchase = new Purchase();
        purchase.setCustomer(newCustomer);
        purchase.setOrder(newOrder);
        purchase.setOrderItems(newItems);
        purchase.setBillingAddress(newBilling);
        purchase.setShippingAddress(newShipping);

        // Access fields
        String email = purchase.getCustomer().getEmail();
        BigDecimal total = purchase.getOrder().getTotalPrice();
        int itemCount = purchase.getOrderItems().size();

        blackhole.consume(purchase);
        blackhole.consume(email);
        blackhole.consume(total);
        blackhole.consume(itemCount);
    }

    /**
     * Benchmark: Create Purchase with varying number of order items
     */
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void benchmarkPurchaseWithMultipleItems(Blackhole blackhole) {
        Set<OrderItem> manyItems = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            OrderItem item = new OrderItem();
            item.setQuantity(1);
            item.setUnitPrice(new BigDecimal("50.00"));
            manyItems.add(item);
        }

        Purchase purchase = new Purchase();
        purchase.setCustomer(customer);
        purchase.setOrder(order);
        purchase.setOrderItems(manyItems);
        purchase.setBillingAddress(billingAddress);
        purchase.setShippingAddress(shippingAddress);

        blackhole.consume(purchase);
    }

    /**
     * Benchmark: Serialization-like access pattern
     * Simulates what happens when converting DTO to JSON
     */
    @Benchmark
    public void benchmarkDtoSerializationPattern(Blackhole blackhole) {
        Purchase purchase = new Purchase();
        purchase.setCustomer(customer);
        purchase.setOrder(order);
        purchase.setOrderItems(orderItems);
        purchase.setBillingAddress(billingAddress);
        purchase.setShippingAddress(shippingAddress);

        // Access all fields as serialization would
        Customer c = purchase.getCustomer();
        String firstName = c.getFirstName();
        String lastName = c.getLastName();
        String email = c.getEmail();

        Order o = purchase.getOrder();
        BigDecimal totalPrice = o.getTotalPrice();
        int totalQuantity = o.getTotalQuantity();

        Set<OrderItem> items = purchase.getOrderItems();
        items.forEach(item -> {
            blackhole.consume(item.getQuantity());
            blackhole.consume(item.getUnitPrice());
        });

        Address billing = purchase.getBillingAddress();
        blackhole.consume(billing.getStreet());
        blackhole.consume(billing.getCity());

        blackhole.consume(firstName);
        blackhole.consume(lastName);
        blackhole.consume(email);
        blackhole.consume(totalPrice);
        blackhole.consume(totalQuantity);
    }

    /**
     * Benchmark: Batch PurchaseResponse creation
     * Simulates creating responses for multiple concurrent orders
     */
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void benchmarkBatchPurchaseResponseCreation(Blackhole blackhole) {
        for (int i = 0; i < 100; i++) {
            PurchaseResponse response = new PurchaseResponse(UUID.randomUUID().toString());
            blackhole.consume(response);
        }
    }

    /**
     * Benchmark: Memory allocation pattern for Purchase DTO
     */
    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void benchmarkPurchaseMemoryAllocation(Blackhole blackhole) {
        Purchase purchase = new Purchase();
        
        Customer c = new Customer();
        c.setFirstName("Test");
        c.setLastName("User");
        c.setEmail("test@example.com");
        
        Order o = new Order();
        o.setTotalQuantity(1);
        o.setTotalPrice(new BigDecimal("100.00"));
        
        Set<OrderItem> items = new HashSet<>();
        OrderItem item = new OrderItem();
        item.setQuantity(1);
        item.setUnitPrice(new BigDecimal("100.00"));
        items.add(item);
        
        Address addr1 = new Address();
        addr1.setStreet("123 St");
        addr1.setCity("City");
        addr1.setState("ST");
        addr1.setCountry("Country");
        addr1.setZipCode("12345");
        
        Address addr2 = new Address();
        addr2.setStreet("456 Ave");
        addr2.setCity("Town");
        addr2.setState("ST");
        addr2.setCountry("Country");
        addr2.setZipCode("67890");
        
        purchase.setCustomer(c);
        purchase.setOrder(o);
        purchase.setOrderItems(items);
        purchase.setBillingAddress(addr1);
        purchase.setShippingAddress(addr2);
        
        blackhole.consume(purchase);
    }
}
