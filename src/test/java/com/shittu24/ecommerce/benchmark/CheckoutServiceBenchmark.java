package com.shittu24.ecommerce.benchmark;

import com.shittu24.ecommerce.dao.CustomerRepository;
import com.shittu24.ecommerce.dto.Purchase;
import com.shittu24.ecommerce.dto.PurchaseResponse;
import com.shittu24.ecommerce.entity.Address;
import com.shittu24.ecommerce.entity.Customer;
import com.shittu24.ecommerce.entity.Order;
import com.shittu24.ecommerce.entity.OrderItem;
import com.shittu24.ecommerce.service.CheckoutServiceImplementation;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * JMH Microbenchmark for CheckoutService - The Most Demanding Component
 * Tests the performance of the order placement process including:
 * - Customer lookup and creation
 * - Order processing with multiple items
 * - Address handling
 * - Repository operations
 * 
 * Run with: mvn clean test-compile exec:exec@run-benchmarks
 * Or: java -cp target/test-classes:target/classes org.openjdk.jmh.Main CheckoutServiceBenchmark
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Thread)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class CheckoutServiceBenchmark {

    private CheckoutServiceImplementation checkoutService;
    private CustomerRepository customerRepository;
    private Purchase purchaseNewCustomer;
    private Purchase purchaseExistingCustomer;
    private Purchase purchaseMultipleItems;
    private Customer existingCustomer;

    @Setup(Level.Trial)
    public void setup() {
        // Mock the repository
        customerRepository = mock(CustomerRepository.class);
        checkoutService = new CheckoutServiceImplementation(customerRepository);
        
        // Setup existing customer
        existingCustomer = new Customer();
        existingCustomer.setId(100L);
        existingCustomer.setFirstName("Existing");
        existingCustomer.setLastName("Customer");
        existingCustomer.setEmail("existing@test.com");
        
        // Setup purchase for new customer
        purchaseNewCustomer = createPurchase("new@test.com", 2);
        
        // Setup purchase for existing customer
        purchaseExistingCustomer = createPurchase("existing@test.com", 2);
        
        // Setup purchase with multiple items (10 items)
        purchaseMultipleItems = createPurchase("multi@test.com", 10);
        
        // Configure repository mocks
        when(customerRepository.findByEmail("new@test.com")).thenReturn(null);
        when(customerRepository.findByEmail("existing@test.com")).thenReturn(existingCustomer);
        when(customerRepository.findByEmail("multi@test.com")).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenAnswer(invocation -> invocation.getArgument(0));
    }

    /**
     * Helper method to create a purchase with specified number of items
     */
    private Purchase createPurchase(String email, int itemCount) {
        Customer customer = new Customer();
        customer.setFirstName("Test");
        customer.setLastName("Customer");
        customer.setEmail(email);
        
        Order order = new Order();
        order.setTotalQuantity(itemCount);
        order.setTotalPrice(new BigDecimal("100.00").multiply(new BigDecimal(itemCount)));
        
        Set<OrderItem> orderItems = new HashSet<>();
        for (int i = 0; i < itemCount; i++) {
            OrderItem item = new OrderItem();
            item.setQuantity(1);
            item.setUnitPrice(new BigDecimal("100.00"));
            item.setImageUrl("https://example.com/product" + i + ".jpg");
            orderItems.add(item);
        }
        
        Address billingAddress = new Address();
        billingAddress.setStreet("123 Main St");
        billingAddress.setCity("Boston");
        billingAddress.setState("MA");
        billingAddress.setCountry("USA");
        billingAddress.setZipCode("02101");
        
        Address shippingAddress = new Address();
        shippingAddress.setStreet("456 Oak Ave");
        shippingAddress.setCity("Cambridge");
        shippingAddress.setState("MA");
        shippingAddress.setCountry("USA");
        shippingAddress.setZipCode("02138");
        
        Purchase purchase = new Purchase();
        purchase.setCustomer(customer);
        purchase.setOrder(order);
        purchase.setOrderItems(orderItems);
        purchase.setBillingAddress(billingAddress);
        purchase.setShippingAddress(shippingAddress);
        
        return purchase;
    }

    /**
     * Benchmark: Place order for new customer
     * This is the most common scenario in e-commerce systems
     */
    @Benchmark
    public void benchmarkPlaceOrderNewCustomer(Blackhole blackhole) {
        PurchaseResponse response = checkoutService.placeOrder(purchaseNewCustomer);
        blackhole.consume(response);
    }

    /**
     * Benchmark: Place order for existing customer
     * Tests customer lookup and reuse performance
     */
    @Benchmark
    public void benchmarkPlaceOrderExistingCustomer(Blackhole blackhole) {
        PurchaseResponse response = checkoutService.placeOrder(purchaseExistingCustomer);
        blackhole.consume(response);
    }

    /**
     * Benchmark: Place order with multiple items
     * Tests performance with larger order sizes (10 items)
     */
    @Benchmark
    public void benchmarkPlaceOrderMultipleItems(Blackhole blackhole) {
        PurchaseResponse response = checkoutService.placeOrder(purchaseMultipleItems);
        blackhole.consume(response);
    }

    /**
     * Benchmark: Compare throughput of all scenarios
     */
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void benchmarkPlaceOrderThroughput(Blackhole blackhole) {
        PurchaseResponse response = checkoutService.placeOrder(purchaseNewCustomer);
        blackhole.consume(response);
    }
}
