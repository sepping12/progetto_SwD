package com.shittu24.ecommerce.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

@DisplayName("Order Entity Tests")
class OrderTest {

    private Order order;
    private OrderItem orderItem;

    @BeforeEach
    void setUp() {
        order = new Order();
        orderItem = new OrderItem();
    }

    @Test
    @DisplayName("Should initialize Order with default values")
    void testOrderInitialization() {
        assertThat(order).isNotNull();
        assertThat(order.getTotalPrice()).isNull();
        assertThat(order.getTotalQuantity()).isEqualTo(0);
    }

    @Test
    @DisplayName("Should set and get order tracking number")
    void testSetGetOrderTrackingNumber() {
        String trackingNumber = "123e4567-e89b-12d3-a456-426614174000";
        order.setOrderTrackingNumber(trackingNumber);
        assertThat(order.getOrderTrackingNumber()).isEqualTo(trackingNumber);
    }

    @Test
    @DisplayName("Should set and get total price")
    void testSetGetTotalPrice() {
        BigDecimal price = new BigDecimal("99.99");
        order.setTotalPrice(price);
        assertThat(order.getTotalPrice()).isEqualTo(price);
    }

    @Test
    @DisplayName("Should set and get total quantity")
    void testSetGetTotalQuantity() {
        int quantity = 10;
        order.setTotalQuantity(quantity);
        assertThat(order.getTotalQuantity()).isEqualTo(quantity);
    }

    @Test
    @DisplayName("Should set and get billing address")
    void testSetGetBillingAddress() {
        Address address = new Address();
        address.setStreet("123 Main St");
        order.setBillingAddress(address);
        assertThat(order.getBillingAddress()).isEqualTo(address);
    }

    @Test
    @DisplayName("Should set and get shipping address")
    void testSetGetShippingAddress() {
        Address address = new Address();
        address.setStreet("456 Oak Ave");
        order.setShippingAddress(address);
        assertThat(order.getShippingAddress()).isEqualTo(address);
    }

    @Test
    @DisplayName("Should add order item to order")
    void testAddOrderItem() {
        OrderItem item = new OrderItem();
        item.setQuantity(2);
        item.setUnitPrice(new BigDecimal("50.00"));
        
        order.add(item);
        
        assertThat(order.getOrderItems()).isNotEmpty();
        assertThat(order.getOrderItems()).contains(item);
        assertThat(item.getOrder()).isEqualTo(order);
    }

    @Test
    @DisplayName("Should initialize order items as empty set")
    void testOrderItemsInitialization() {
        assertThat(order.getOrderItems()).isNotNull().isEmpty();
    }

    @Test
    @DisplayName("Should set and get order status")
    void testSetGetStatus() {
        order.setStatus("PENDING");
        assertThat(order.getStatus()).isEqualTo("PENDING");
    }

    @Test
    @DisplayName("Should set and get customer")
    void testSetGetCustomer() {
        Customer customer = new Customer();
        customer.setEmail("test@example.com");
        order.setCustomer(customer);
        assertThat(order.getCustomer()).isEqualTo(customer);
    }

    @Test
    @DisplayName("Should add multiple order items")
    void testAddMultipleOrderItems() {
        OrderItem item1 = new OrderItem();
        item1.setQuantity(1);
        OrderItem item2 = new OrderItem();
        item2.setQuantity(2);
        
        order.add(item1);
        order.add(item2);
        
        assertThat(order.getOrderItems()).hasSize(2);
    }
}
