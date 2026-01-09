package com.shittu24.ecommerce.dto;

import com.shittu24.ecommerce.entity.Address;
import com.shittu24.ecommerce.entity.Customer;
import com.shittu24.ecommerce.entity.Order;
import com.shittu24.ecommerce.entity.OrderItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

@DisplayName("Purchase DTO Tests")
class PurchaseTest {

    private Purchase purchase;
    private Customer customer;
    private Order order;
    private Address billingAddress;
    private Address shippingAddress;
    private Set<OrderItem> orderItems;

    @BeforeEach
    void setUp() {
        purchase = new Purchase();
        customer = new Customer();
        order = new Order();
        billingAddress = new Address();
        shippingAddress = new Address();
        orderItems = new HashSet<>();
    }

    @Test
    @DisplayName("Should initialize Purchase with default values")
    void testPurchaseInitialization() {
        assertThat(purchase).isNotNull();
        assertThat(purchase.getCustomer()).isNull();
        assertThat(purchase.getOrder()).isNull();
    }

    @Test
    @DisplayName("Should set and get customer")
    void testSetGetCustomer() {
        customer.setEmail("test@example.com");
        purchase.setCustomer(customer);
        assertThat(purchase.getCustomer()).isEqualTo(customer);
        assertThat(purchase.getCustomer().getEmail()).isEqualTo("test@example.com");
    }

    @Test
    @DisplayName("Should set and get order")
    void testSetGetOrder() {
        order.setTotalPrice(new BigDecimal("99.99"));
        purchase.setOrder(order);
        assertThat(purchase.getOrder()).isEqualTo(order);
        assertThat(purchase.getOrder().getTotalPrice()).isEqualTo(new BigDecimal("99.99"));
    }

    @Test
    @DisplayName("Should set and get billing address")
    void testSetGetBillingAddress() {
        billingAddress.setStreet("123 Main St");
        purchase.setBillingAddress(billingAddress);
        assertThat(purchase.getBillingAddress()).isEqualTo(billingAddress);
        assertThat(purchase.getBillingAddress().getStreet()).isEqualTo("123 Main St");
    }

    @Test
    @DisplayName("Should set and get shipping address")
    void testSetGetShippingAddress() {
        shippingAddress.setCity("Boston");
        purchase.setShippingAddress(shippingAddress);
        assertThat(purchase.getShippingAddress()).isEqualTo(shippingAddress);
        assertThat(purchase.getShippingAddress().getCity()).isEqualTo("Boston");
    }

    @Test
    @DisplayName("Should set and get order items")
    void testSetGetOrderItems() {
        OrderItem item = new OrderItem();
        item.setQuantity(2);
        orderItems.add(item);
        
        purchase.setOrderItems(orderItems);
        assertThat(purchase.getOrderItems()).isNotEmpty();
        assertThat(purchase.getOrderItems()).hasSize(1);
    }

    @Test
    @DisplayName("Should handle null order items set")
    void testNullOrderItems() {
        purchase.setOrderItems(null);
        assertThat(purchase.getOrderItems()).isNull();
    }

    @Test
    @DisplayName("Should handle empty order items set")
    void testEmptyOrderItems() {
        purchase.setOrderItems(new HashSet<>());
        assertThat(purchase.getOrderItems()).isEmpty();
    }

    @Test
    @DisplayName("Should complete purchase with all fields")
    void testCompletePurchase() {
        customer.setEmail("john@example.com");
        order.setTotalPrice(new BigDecimal("150.00"));
        billingAddress.setStreet("123 Billing St");
        shippingAddress.setStreet("456 Shipping Ave");
        
        OrderItem item = new OrderItem();
        item.setQuantity(1);
        orderItems.add(item);
        
        purchase.setCustomer(customer);
        purchase.setOrder(order);
        purchase.setBillingAddress(billingAddress);
        purchase.setShippingAddress(shippingAddress);
        purchase.setOrderItems(orderItems);
        
        assertThat(purchase.getCustomer()).isNotNull();
        assertThat(purchase.getOrder()).isNotNull();
        assertThat(purchase.getBillingAddress()).isNotNull();
        assertThat(purchase.getShippingAddress()).isNotNull();
        assertThat(purchase.getOrderItems()).isNotEmpty();
    }
}
