package com.shittu24.ecommerce.service;

import com.shittu24.ecommerce.dao.CustomerRepository;
import com.shittu24.ecommerce.dto.Purchase;
import com.shittu24.ecommerce.dto.PurchaseResponse;
import com.shittu24.ecommerce.entity.Address;
import com.shittu24.ecommerce.entity.Customer;
import com.shittu24.ecommerce.entity.Order;
import com.shittu24.ecommerce.entity.OrderItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Unit tests for CheckoutService
 * Tests the order placement and customer handling logic
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("CheckoutService Unit Tests")
class CheckoutServiceImplementationTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CheckoutServiceImplementation checkoutService;

    private Purchase purchase;
    private Customer newCustomer;
    private Customer existingCustomer;
    private Order order;
    private Set<OrderItem> orderItems;
    private Address billingAddress;
    private Address shippingAddress;

    @BeforeEach
    void setUp() {
        // Initialize test data
        newCustomer = new Customer();
        newCustomer.setId(1L);
        newCustomer.setFirstName("John");
        newCustomer.setLastName("Doe");
        newCustomer.setEmail("john@example.com");

        existingCustomer = new Customer();
        existingCustomer.setId(2L);
        existingCustomer.setFirstName("Existing");
        existingCustomer.setLastName("User");
        existingCustomer.setEmail("existing@example.com");

        order = new Order();
        order.setTotalPrice(new BigDecimal("100.00"));
        order.setTotalQuantity(2);

        OrderItem item1 = new OrderItem();
        item1.setQuantity(1);
        item1.setUnitPrice(new BigDecimal("50.00"));

        OrderItem item2 = new OrderItem();
        item2.setQuantity(1);
        item2.setUnitPrice(new BigDecimal("50.00"));

        orderItems = new HashSet<>();
        orderItems.add(item1);
        orderItems.add(item2);

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

        purchase = new Purchase();
        purchase.setCustomer(newCustomer);
        purchase.setOrder(order);
        purchase.setOrderItems(orderItems);
        purchase.setBillingAddress(billingAddress);
        purchase.setShippingAddress(shippingAddress);
    }

    @Test
    @DisplayName("Should place order for new customer successfully")
    void testPlaceOrderNewCustomer() {
        // Arrange
        when(customerRepository.findByEmail(anyString())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);

        // Act
        PurchaseResponse response = checkoutService.placeOrder(purchase);

        // Assert
        assertNotNull(response, "PurchaseResponse should not be null");
        assertNotNull(response.getOrderTrackingNumber(), "Order tracking number should be generated");
        assertEquals(36, response.getOrderTrackingNumber().length(), "Tracking number should be UUID format");
        
        // Verify that order tracking number was set
        assertEquals(order.getOrderTrackingNumber(), response.getOrderTrackingNumber());
        
        // Verify repository was called
        verify(customerRepository, times(1)).findByEmail(newCustomer.getEmail());
        verify(customerRepository, times(1)).save(any(Customer.class));
    }

    @Test
    @DisplayName("Should reuse existing customer when email matches")
    void testPlaceOrderExistingCustomer() {
        // Arrange
        purchase.getCustomer().setEmail(existingCustomer.getEmail());
        when(customerRepository.findByEmail(existingCustomer.getEmail())).thenReturn(existingCustomer);
        when(customerRepository.save(any(Customer.class))).thenReturn(existingCustomer);

        // Act
        PurchaseResponse response = checkoutService.placeOrder(purchase);

        // Assert
        assertNotNull(response);
        assertNotNull(response.getOrderTrackingNumber());
        
        // Verify that existing customer was found and saved
        verify(customerRepository, times(1)).findByEmail(existingCustomer.getEmail());
        verify(customerRepository, times(1)).save(existingCustomer);
    }

    @Test
    @DisplayName("Should set billing address on order")
    void testPlaceOrderSetsBillingAddress() {
        // Arrange
        when(customerRepository.findByEmail(anyString())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);
        
        ArgumentCaptor<Customer> customerCaptor = ArgumentCaptor.forClass(Customer.class);

        // Act
        checkoutService.placeOrder(purchase);

        // Assert
        verify(customerRepository).save(customerCaptor.capture());
        Customer savedCustomer = customerCaptor.getValue();
        assertNotNull(savedCustomer.getOrders());
        Order savedOrder = savedCustomer.getOrders().iterator().next();
        assertNotNull(savedOrder.getBillingAddress());
        assertEquals(billingAddress.getStreet(), savedOrder.getBillingAddress().getStreet());
    }

    @Test
    @DisplayName("Should set shipping address on order")
    void testPlaceOrderSetsShippingAddress() {
        // Arrange
        when(customerRepository.findByEmail(anyString())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);
        
        ArgumentCaptor<Customer> customerCaptor = ArgumentCaptor.forClass(Customer.class);

        // Act
        checkoutService.placeOrder(purchase);

        // Assert
        verify(customerRepository).save(customerCaptor.capture());
        Customer savedCustomer = customerCaptor.getValue();
        Order savedOrder = savedCustomer.getOrders().iterator().next();
        assertNotNull(savedOrder.getShippingAddress());
        assertEquals(shippingAddress.getCity(), savedOrder.getShippingAddress().getCity());
    }

    @Test
    @DisplayName("Should add all order items to order")
    void testPlaceOrderAddsAllOrderItems() {
        // Arrange
        when(customerRepository.findByEmail(anyString())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);
        
        ArgumentCaptor<Customer> customerCaptor = ArgumentCaptor.forClass(Customer.class);

        // Act
        checkoutService.placeOrder(purchase);

        // Assert
        verify(customerRepository).save(customerCaptor.capture());
        Customer savedCustomer = customerCaptor.getValue();
        Order savedOrder = savedCustomer.getOrders().iterator().next();
        assertEquals(orderItems.size(), savedOrder.getOrderItems().size());
    }

    @Test
    @DisplayName("Should generate unique tracking numbers for each order")
    void testTrackingNumberUniqueness() {
        // Arrange
        when(customerRepository.findByEmail(anyString())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);

        // Act
        PurchaseResponse response1 = checkoutService.placeOrder(purchase);
        
        Purchase purchase2 = new Purchase();
        Customer customer2 = new Customer();
        customer2.setEmail("john2@example.com");
        purchase2.setCustomer(customer2);
        purchase2.setOrder(new Order());
        purchase2.setOrderItems(new HashSet<>());
        purchase2.setBillingAddress(billingAddress);
        purchase2.setShippingAddress(shippingAddress);
        
        PurchaseResponse response2 = checkoutService.placeOrder(purchase2);

        // Assert
        assertNotEquals(
            response1.getOrderTrackingNumber(), 
            response2.getOrderTrackingNumber(),
            "Each order should have a unique tracking number"
        );
    }

    @Test
    @DisplayName("Should save customer with order relationship")
    void testPlaceOrderSavesCustomerWithOrder() {
        // Arrange
        when(customerRepository.findByEmail(anyString())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);
        
        ArgumentCaptor<Customer> customerCaptor = ArgumentCaptor.forClass(Customer.class);

        // Act
        checkoutService.placeOrder(purchase);

        // Assert
        verify(customerRepository).save(customerCaptor.capture());
        Customer savedCustomer = customerCaptor.getValue();
        assertNotNull(savedCustomer.getOrders());
        assertFalse(savedCustomer.getOrders().isEmpty());
    }

    @Test
    @DisplayName("Should handle null order items correctly")
    void testPlaceOrderWithEmptyOrderItems() {
        // Arrange
        purchase.setOrderItems(new HashSet<>());
        when(customerRepository.findByEmail(anyString())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);

        // Act & Assert
        assertDoesNotThrow(() -> {
            checkoutService.placeOrder(purchase);
        });
    }

    @Test
    @DisplayName("Should return valid PurchaseResponse object")
    void testPlaceOrderReturnsValidResponse() {
        // Arrange
        when(customerRepository.findByEmail(anyString())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);

        // Act
        PurchaseResponse response = checkoutService.placeOrder(purchase);

        // Assert
        assertNotNull(response);
        assertNotNull(response.getOrderTrackingNumber());
        assertTrue(response.getOrderTrackingNumber().length() > 0);
    }

    @Test
    @DisplayName("Should find customer by exact email match")
    void testFindCustomerByExactEmail() {
        // Arrange
        String customerEmail = "test@example.com";
        purchase.getCustomer().setEmail(customerEmail);
        when(customerRepository.findByEmail(customerEmail)).thenReturn(existingCustomer);
        when(customerRepository.save(any(Customer.class))).thenReturn(existingCustomer);

        // Act
        checkoutService.placeOrder(purchase);

        // Assert
        verify(customerRepository).findByEmail(customerEmail);
    }

    @Test
    @DisplayName("Should preserve order data during checkout")
    void testOrderDataPreservation() {
        // Arrange
        BigDecimal originalTotal = order.getTotalPrice();
        long originalQuantity = order.getTotalQuantity();
        
        when(customerRepository.findByEmail(anyString())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);
        
        ArgumentCaptor<Customer> customerCaptor = ArgumentCaptor.forClass(Customer.class);

        // Act
        checkoutService.placeOrder(purchase);

        // Assert
        verify(customerRepository).save(customerCaptor.capture());
        Customer savedCustomer = customerCaptor.getValue();
        Order savedOrder = savedCustomer.getOrders().iterator().next();
        assertEquals(originalTotal, savedOrder.getTotalPrice());
        assertEquals(originalQuantity, savedOrder.getTotalQuantity());
    }

    @Test
    @DisplayName("Should verify customer is added to repository during placeOrder")
    void testVerifyCustomerRepositoryCalled() {
        // Arrange
        when(customerRepository.findByEmail(newCustomer.getEmail())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);

        // Act
        checkoutService.placeOrder(purchase);

        // Assert
        verify(customerRepository, times(1)).findByEmail(any());
        verify(customerRepository, times(1)).save(any(Customer.class));
    }

    @Test
    @DisplayName("Should NOT duplicate existing customer in repository")
    void testExistingCustomerNotDuplicated() {
        // Arrange
        Customer foundCustomer = new Customer();
        foundCustomer.setId(100L);
        foundCustomer.setEmail(newCustomer.getEmail());
        when(customerRepository.findByEmail(newCustomer.getEmail())).thenReturn(foundCustomer);
        when(customerRepository.save(any(Customer.class))).thenReturn(foundCustomer);

        // Act
        checkoutService.placeOrder(purchase);

        // Assert - Should save the existing customer
        ArgumentCaptor<Customer> customerCaptor = ArgumentCaptor.forClass(Customer.class);
        verify(customerRepository).save(customerCaptor.capture());
        Customer savedCustomer = customerCaptor.getValue();
        assertNotNull(savedCustomer.getId());
    }

    @Test
    @DisplayName("Should handle order with single item")
    void testPlaceOrderWithSingleItem() {
        // Arrange
        Set<OrderItem> singleItem = new HashSet<>();
        OrderItem item = new OrderItem();
        item.setQuantity(1);
        item.setUnitPrice(new BigDecimal("99.99"));
        singleItem.add(item);
        purchase.setOrderItems(singleItem);
        
        when(customerRepository.findByEmail(anyString())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);

        // Act
        PurchaseResponse response = checkoutService.placeOrder(purchase);

        // Assert
        assertNotNull(response);
        assertNotNull(response.getOrderTrackingNumber());
    }

    @Test
    @DisplayName("Should maintain customer relationship when saving order")
    void testCustomerOrderRelationshipPreserved() {
        // Arrange
        when(customerRepository.findByEmail(anyString())).thenReturn(null);
        when(customerRepository.save(any(Customer.class))).thenReturn(newCustomer);

        // Act
        checkoutService.placeOrder(purchase);

        // Assert
        ArgumentCaptor<Customer> customerCaptor = ArgumentCaptor.forClass(Customer.class);
        verify(customerRepository).save(customerCaptor.capture());
        Customer savedCustomer = customerCaptor.getValue();
        
        // Verify the order is linked to the customer
        assertNotNull(savedCustomer.getOrders());
        assertFalse(savedCustomer.getOrders().isEmpty());
    }
}


