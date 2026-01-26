package com.shittu24.ecommerce.dto;

import com.shittu24.ecommerce.entity.Address;
import com.shittu24.ecommerce.entity.Customer;
import com.shittu24.ecommerce.entity.Order;
import com.shittu24.ecommerce.entity.OrderItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Advanced tests for Purchase equals/hashCode to kill mutation testing survivors
 * Focuses on detecting specific field differences and hashCode calculation mutations
 */
@DisplayName("Purchase Advanced HashCode/Equals Tests")
class PurchaseHashCodeEqualsAdvancedTest {

    @Test
    @DisplayName("HashCode should differ when customer changes")
    void testHashCodeDifferentCustomer() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Customer c1 = new Customer();
        c1.setFirstName("Alice");
        c1.setEmail("alice@test.com");
        
        Customer c2 = new Customer();
        c2.setFirstName("Bob");
        c2.setEmail("bob@test.com");
        
        p1.setCustomer(c1);
        p2.setCustomer(c2);
        
        assertNotEquals(p1.hashCode(), p2.hashCode(), 
            "HashCode must differ for different customers");
    }

    @Test
    @DisplayName("HashCode should differ when order changes")
    void testHashCodeDifferentOrder() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Order o1 = new Order();
        o1.setTotalPrice(new BigDecimal("100.00"));
        
        Order o2 = new Order();
        o2.setTotalPrice(new BigDecimal("200.00"));
        
        p1.setOrder(o1);
        p2.setOrder(o2);
        
        assertNotEquals(p1.hashCode(), p2.hashCode(),
            "HashCode must differ for different orders");
    }

    @Test
    @DisplayName("HashCode should differ when shipping address changes")
    void testHashCodeDifferentShippingAddress() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Address a1 = new Address();
        a1.setCity("Boston");
        
        Address a2 = new Address();
        a2.setCity("New York");
        
        p1.setShippingAddress(a1);
        p2.setShippingAddress(a2);
        
        assertNotEquals(p1.hashCode(), p2.hashCode(),
            "HashCode must differ for different shipping addresses");
    }

    @Test
    @DisplayName("HashCode should differ when billing address changes")
    void testHashCodeDifferentBillingAddress() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Address a1 = new Address();
        a1.setCity("Boston");
        
        Address a2 = new Address();
        a2.setCity("Chicago");
        
        p1.setBillingAddress(a1);
        p2.setBillingAddress(a2);
        
        assertNotEquals(p1.hashCode(), p2.hashCode(),
            "HashCode must differ for different billing addresses");
    }

    @Test
    @DisplayName("HashCode should differ when orderItems change")
    void testHashCodeDifferentOrderItems() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        OrderItem item1 = new OrderItem();
        item1.setQuantity(1);
        Set<OrderItem> items1 = new HashSet<>();
        items1.add(item1);
        
        OrderItem item2 = new OrderItem();
        item2.setQuantity(5);
        Set<OrderItem> items2 = new HashSet<>();
        items2.add(item2);
        
        p1.setOrderItems(items1);
        p2.setOrderItems(items2);
        
        assertNotEquals(p1.hashCode(), p2.hashCode(),
            "HashCode must differ for different order items");
    }

    @Test
    @DisplayName("Equals should detect customer difference")
    void testEqualsDifferentCustomer() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Customer c1 = new Customer();
        c1.setEmail("user1@test.com");
        
        Customer c2 = new Customer();
        c2.setEmail("user2@test.com");
        
        p1.setCustomer(c1);
        p2.setCustomer(c2);
        
        assertNotEquals(p1, p2, "Purchases with different customers must not be equal");
    }

    @Test
    @DisplayName("Equals should detect order difference")
    void testEqualsDifferentOrder() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Order o1 = new Order();
        o1.setTotalQuantity(1);
        
        Order o2 = new Order();
        o2.setTotalQuantity(2);
        
        p1.setOrder(o1);
        p2.setOrder(o2);
        
        assertNotEquals(p1, p2, "Purchases with different orders must not be equal");
    }

    @Test
    @DisplayName("Equals should detect shipping address difference")
    void testEqualsDifferentShippingAddress() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Address a1 = new Address();
        a1.setZipCode("10001");
        
        Address a2 = new Address();
        a2.setZipCode("90210");
        
        p1.setShippingAddress(a1);
        p2.setShippingAddress(a2);
        
        assertNotEquals(p1, p2, "Purchases with different shipping addresses must not be equal");
    }

    @Test
    @DisplayName("Equals should detect billing address difference")
    void testEqualsDifferentBillingAddress() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Address a1 = new Address();
        a1.setStreet("Main St");
        
        Address a2 = new Address();
        a2.setStreet("Oak Ave");
        
        p1.setBillingAddress(a1);
        p2.setBillingAddress(a2);
        
        assertNotEquals(p1, p2, "Purchases with different billing addresses must not be equal");
    }

    @Test
    @DisplayName("Equals should detect orderItems difference")
    void testEqualsDifferentOrderItems() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Set<OrderItem> items1 = new HashSet<>();
        items1.add(new OrderItem());
        
        Set<OrderItem> items2 = new HashSet<>();
        items2.add(new OrderItem());
        items2.add(new OrderItem());
        
        p1.setOrderItems(items1);
        p2.setOrderItems(items2);
        
        assertNotEquals(p1, p2, "Purchases with different order items must not be equal");
    }

    @Test
    @DisplayName("Equals should return false for null")
    void testEqualsNull() {
        Purchase p = new Purchase();
        p.setCustomer(new Customer());
        
        assertNotEquals(p, null, "Purchase should not equal null");
        assertFalse(p.equals(null), "equals(null) must return false");
    }

    @Test
    @DisplayName("Equals should return false for different type")
    void testEqualsDifferentType() {
        Purchase p = new Purchase();
        String notAPurchase = "not a purchase";
        
        assertNotEquals(p, notAPurchase, "Purchase should not equal String");
        assertFalse(p.equals(notAPurchase), "equals(String) must return false");
    }

    @Test
    @DisplayName("Equals should be reflexive")
    void testEqualsReflexive() {
        Purchase p = new Purchase();
        p.setCustomer(new Customer());
        
        assertEquals(p, p, "Purchase must equal itself");
        assertTrue(p.equals(p), "equals(this) must return true");
    }

    @Test
    @DisplayName("Equals should be symmetric")
    void testEqualsSymmetric() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Customer c = new Customer();
        c.setEmail("test@example.com");
        
        p1.setCustomer(c);
        p2.setCustomer(c);
        
        assertEquals(p1, p2, "p1 must equal p2");
        assertEquals(p2, p1, "p2 must equal p1");
    }

    @Test
    @DisplayName("HashCode consistent with multiple calls")
    void testHashCodeConsistent() {
        Purchase p = new Purchase();
        Customer c = new Customer();
        c.setEmail("consistent@test.com");
        p.setCustomer(c);
        
        int hash1 = p.hashCode();
        int hash2 = p.hashCode();
        int hash3 = p.hashCode();
        
        assertEquals(hash1, hash2, "hashCode must be consistent");
        assertEquals(hash2, hash3, "hashCode must be consistent");
    }

    @Test
    @DisplayName("Equal objects must have same hashCode")
    void testEqualObjectsSameHashCode() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Customer c = new Customer();
        c.setFirstName("John");
        c.setLastName("Doe");
        c.setEmail("john@test.com");
        
        p1.setCustomer(c);
        p2.setCustomer(c);
        
        assertEquals(p1, p2, "Purchases must be equal");
        assertEquals(p1.hashCode(), p2.hashCode(), 
            "Equal purchases must have same hashCode");
    }

    @Test
    @DisplayName("Test canEqual with different instance")
    void testCanEqualDifferentInstance() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        assertTrue(p1.canEqual(p2), "canEqual must return true for Purchase instance");
    }

    @Test
    @DisplayName("Test canEqual with same instance")
    void testCanEqualSameInstance() {
        Purchase p = new Purchase();
        
        assertTrue(p.canEqual(p), "canEqual must return true for same instance");
    }

    @Test
    @DisplayName("HashCode with all null fields")
    void testHashCodeAllNullFields() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        assertEquals(p1.hashCode(), p2.hashCode(),
            "Purchases with all null fields must have same hashCode");
    }

    @Test
    @DisplayName("HashCode with only customer set")
    void testHashCodeOnlyCustomer() {
        Purchase p1 = new Purchase();
        Purchase p2 = new Purchase();
        
        Customer c = new Customer();
        c.setEmail("test@example.com");
        
        p1.setCustomer(c);
        p2.setCustomer(c);
        
        // Should have same hashCode if same customer instance
        assertEquals(p1.hashCode(), p2.hashCode(),
            "Purchases with same customer instance should have same hashCode");
    }

    @Test
    @DisplayName("HashCode with multiple fields set")
    void testHashCodeMultipleFields() {
        Purchase p = new Purchase();
        
        Customer c = new Customer();
        c.setEmail("multi@test.com");
        
        Order o = new Order();
        o.setTotalPrice(new BigDecimal("500.00"));
        
        Address addr = new Address();
        addr.setCity("Boston");
        
        p.setCustomer(c);
        p.setOrder(o);
        p.setShippingAddress(addr);
        
        int hash = p.hashCode();
        
        assertNotEquals(0, hash, "HashCode should not be 0 for populated Purchase");
    }
}
