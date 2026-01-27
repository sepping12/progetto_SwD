package com.shittu24.ecommerce.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

@DisplayName("Customer Entity Tests")
class CustomerTest {

    private Customer customer;
    private Order order;

    @BeforeEach
    void setUp() {
        customer = new Customer();
        order = new Order();
    }

    @Test
    @DisplayName("Should initialize Customer with default values")
    void testCustomerInitialization() {
        assertThat(customer).isNotNull();
        assertThat(customer.getEmail()).isNull();
        assertThat(customer.getFirstName()).isNull();
        assertThat(customer.getLastName()).isNull();
    }

    @Test
    @DisplayName("Should set and get first name")
    void testSetGetFirstName() {
        customer.setFirstName("John");
        assertThat(customer.getFirstName()).isEqualTo("John");
    }

    @Test
    @DisplayName("Should set and get last name")
    void testSetGetLastName() {
        customer.setLastName("Doe");
        assertThat(customer.getLastName()).isEqualTo("Doe");
    }

    @Test
    @DisplayName("Should set and get email")
    void testSetGetEmail() {
        String email = "john.doe@example.com";
        customer.setEmail(email);
        assertThat(customer.getEmail()).isEqualTo(email);
    }

    @Test
    @DisplayName("Should add order to customer")
    void testAddOrder() {
        customer.add(order);
        
        assertThat(customer.getOrders()).isNotEmpty();
        assertThat(customer.getOrders()).contains(order);
        assertThat(order.getCustomer()).isEqualTo(customer);
    }

    @Test
    @DisplayName("Should initialize orders as empty set")
    void testOrdersInitialization() {
        assertThat(customer.getOrders()).isNotNull().isEmpty();
    }

    @Test
    @DisplayName("Should add multiple orders")
    void testAddMultipleOrders() {
        Order order1 = new Order();
        Order order2 = new Order();
        
        customer.add(order1);
        customer.add(order2);
        
        assertThat(customer.getOrders()).hasSize(2);
    }

    @Test
    @DisplayName("Should maintain order relationship bidirectionally")
    void testOrderBidirectionalRelationship() {
        customer.add(order);
        
        assertThat(customer.getOrders()).contains(order);
        assertThat(order.getCustomer()).isEqualTo(customer);
    }

    @Test
    @DisplayName("Should set and get customer ID")
    void testSetGetId() {
        customer.setId(1L);
        assertThat(customer.getId()).isEqualTo(1L);
    }

    @Test
    @DisplayName("Should handle null orders when adding first order")
    void testAddOrderWhenOrdersIsNull() {
        // Create a new customer with null orders explicitly
        Customer newCustomer = new Customer();
        // Ensure orders is null initially (already is by default)
        newCustomer.setOrders(null);
        
        Order newOrder = new Order();
        newOrder.setOrderTrackingNumber("TEST-123");
        
        // This will trigger the if (orders == null) branch
        newCustomer.add(newOrder);
        
        // Verify the order was added and collection was initialized
        assertThat(newCustomer.getOrders()).isNotNull();
        assertThat(newCustomer.getOrders()).hasSize(1);
        assertThat(newCustomer.getOrders()).contains(newOrder);
        assertThat(newOrder.getCustomer()).isEqualTo(newCustomer);
    }
}
