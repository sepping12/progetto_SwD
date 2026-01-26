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

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Edge case tests for Purchase DTO
 * Tests boundary conditions and null handling
 */
@DisplayName("Purchase DTO Edge Case Tests")
class PurchaseEdgeCaseTest {

    @Test
    @DisplayName("Test Purchase with all null fields")
    void testPurchaseWithAllNullFields() {
        Purchase purchase = new Purchase();
        
        assertNull(purchase.getCustomer());
        assertNull(purchase.getShippingAddress());
        assertNull(purchase.getBillingAddress());
        assertNull(purchase.getOrder());
        assertNull(purchase.getOrderItems());
    }

    @Test
    @DisplayName("Test Purchase setter chain")
    void testPurchaseSetterChain() {
        Purchase purchase = new Purchase();
        Customer customer = new Customer();
        Address address = new Address();
        Order order = new Order();
        Set<OrderItem> items = new HashSet<>();

        purchase.setCustomer(customer);
        purchase.setShippingAddress(address);
        purchase.setBillingAddress(address);
        purchase.setOrder(order);
        purchase.setOrderItems(items);

        assertSame(customer, purchase.getCustomer());
        assertSame(address, purchase.getShippingAddress());
        assertSame(address, purchase.getBillingAddress());
        assertSame(order, purchase.getOrder());
        assertSame(items, purchase.getOrderItems());
    }

    @Test
    @DisplayName("Test Purchase with empty order items set")
    void testPurchaseWithEmptyOrderItems() {
        Purchase purchase = new Purchase();
        Set<OrderItem> emptySet = new HashSet<>();
        purchase.setOrderItems(emptySet);

        assertNotNull(purchase.getOrderItems());
        assertTrue(purchase.getOrderItems().isEmpty());
    }

    @Test
    @DisplayName("Test Purchase with single order item")
    void testPurchaseWithSingleOrderItem() {
        Purchase purchase = new Purchase();
        OrderItem item = new OrderItem();
        item.setQuantity(1);
        item.setUnitPrice(new BigDecimal("99.99"));
        
        Set<OrderItem> items = new HashSet<>();
        items.add(item);
        purchase.setOrderItems(items);

        assertEquals(1, purchase.getOrderItems().size());
        assertTrue(purchase.getOrderItems().contains(item));
    }

    @Test
    @DisplayName("Test Purchase with multiple order items")
    void testPurchaseWithMultipleOrderItems() {
        Purchase purchase = new Purchase();
        OrderItem item1 = new OrderItem();
        OrderItem item2 = new OrderItem();
        OrderItem item3 = new OrderItem();
        
        Set<OrderItem> items = new HashSet<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        purchase.setOrderItems(items);

        assertEquals(3, purchase.getOrderItems().size());
    }

    @Test
    @DisplayName("Test Purchase same billing and shipping address")
    void testPurchaseSameAddresses() {
        Purchase purchase = new Purchase();
        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Boston");

        purchase.setBillingAddress(address);
        purchase.setShippingAddress(address);

        assertSame(purchase.getBillingAddress(), purchase.getShippingAddress());
    }

    @Test
    @DisplayName("Test Purchase with null customer but valid order")
    void testPurchaseNullCustomerValidOrder() {
        Purchase purchase = new Purchase();
        Order order = new Order();
        order.setTotalPrice(new BigDecimal("100.00"));
        order.setTotalQuantity(5);

        purchase.setCustomer(null);
        purchase.setOrder(order);

        assertNull(purchase.getCustomer());
        assertNotNull(purchase.getOrder());
        assertEquals(new BigDecimal("100.00"), purchase.getOrder().getTotalPrice());
    }

    @Test
    @DisplayName("Test Purchase overwrite existing values")
    void testPurchaseOverwriteValues() {
        Purchase purchase = new Purchase();
        Customer customer1 = new Customer();
        customer1.setFirstName("John");
        Customer customer2 = new Customer();
        customer2.setFirstName("Jane");

        purchase.setCustomer(customer1);
        assertEquals("John", purchase.getCustomer().getFirstName());

        purchase.setCustomer(customer2);
        assertEquals("Jane", purchase.getCustomer().getFirstName());
    }

    @Test
    @DisplayName("Test Purchase with zero quantity order")
    void testPurchaseZeroQuantity() {
        Purchase purchase = new Purchase();
        Order order = new Order();
        order.setTotalQuantity(0);
        order.setTotalPrice(BigDecimal.ZERO);

        purchase.setOrder(order);

        assertEquals(0, purchase.getOrder().getTotalQuantity());
        assertEquals(BigDecimal.ZERO, purchase.getOrder().getTotalPrice());
    }

    @Test
    @DisplayName("Test Purchase with very large order quantity")
    void testPurchaseVeryLargeQuantity() {
        Purchase purchase = new Purchase();
        Order order = new Order();
        order.setTotalQuantity(Integer.MAX_VALUE);

        purchase.setOrder(order);

        assertEquals(Integer.MAX_VALUE, purchase.getOrder().getTotalQuantity());
    }

    @Test
    @DisplayName("Test Purchase equals and hashCode with Lombok")
    void testPurchaseEqualsHashCode() {
        Purchase purchase1 = new Purchase();
        Purchase purchase2 = new Purchase();

        // Test default equals/hashCode
        assertEquals(purchase1, purchase2);
        assertEquals(purchase1.hashCode(), purchase2.hashCode());

        // Test with different data
        Customer customer = new Customer();
        purchase1.setCustomer(customer);
        
        assertNotEquals(purchase1, purchase2);
    }

    @Test
    @DisplayName("Test Purchase toString method")
    void testPurchaseToString() {
        Purchase purchase = new Purchase();
        Customer customer = new Customer();
        customer.setFirstName("John");
        purchase.setCustomer(customer);

        String toString = purchase.toString();
        
        assertNotNull(toString);
        assertTrue(toString.contains("Purchase"));
    }

    @Test
    @DisplayName("Test PurchaseResponse with null tracking number")
    void testPurchaseResponseNullTrackingNumber() {
        PurchaseResponse response = new PurchaseResponse();
        
        assertNull(response.getOrderTrackingNumber());
    }

    @Test
    @DisplayName("Test PurchaseResponse with valid tracking number")
    void testPurchaseResponseWithTrackingNumber() {
        PurchaseResponse response = new PurchaseResponse();
        String trackingNumber = "TRK-12345-ABCDE";
        
        response.setOrderTrackingNumber(trackingNumber);
        
        assertEquals(trackingNumber, response.getOrderTrackingNumber());
    }

    @Test
    @DisplayName("Test PurchaseResponse with empty tracking number")
    void testPurchaseResponseEmptyTrackingNumber() {
        PurchaseResponse response = new PurchaseResponse();
        response.setOrderTrackingNumber("");
        
        assertEquals("", response.getOrderTrackingNumber());
    }

    @Test
    @DisplayName("Test PurchaseResponse overwrite tracking number")
    void testPurchaseResponseOverwriteTrackingNumber() {
        PurchaseResponse response = new PurchaseResponse();
        response.setOrderTrackingNumber("OLD-123");
        response.setOrderTrackingNumber("NEW-456");
        
        assertEquals("NEW-456", response.getOrderTrackingNumber());
    }
}
