package com.shittu24.ecommerce.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shittu24.ecommerce.dto.Purchase;
import com.shittu24.ecommerce.dto.PurchaseResponse;
import com.shittu24.ecommerce.entity.Address;
import com.shittu24.ecommerce.entity.Customer;
import com.shittu24.ecommerce.entity.Order;
import com.shittu24.ecommerce.entity.OrderItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for CheckoutController
 * Tests the REST API endpoints for order placement
 */
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(properties = {
    "spring.datasource.url=jdbc:h2:mem:testdb;MODE=MySQL;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE",
    "spring.datasource.driverClassName=org.h2.Driver",
    "spring.datasource.username=sa",
    "spring.datasource.password=",
    "spring.jpa.database-platform=org.hibernate.dialect.H2Dialect",
    "spring.jpa.hibernate.ddl-auto=create-drop"
})
@DisplayName("CheckoutController Integration Tests")
class CheckoutControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private Purchase purchase;
    private Customer customer;
    private Order order;
    private Set<OrderItem> orderItems;
    private Address billingAddress;
    private Address shippingAddress;

    @BeforeEach
    void setUp() {
        customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setEmail("john.doe@example.com");

        order = new Order();
        order.setTotalPrice(new BigDecimal("299.99"));
        order.setTotalQuantity(5);

        OrderItem item1 = new OrderItem();
        item1.setQuantity(2);
        item1.setUnitPrice(new BigDecimal("49.99"));

        OrderItem item2 = new OrderItem();
        item2.setQuantity(3);
        item2.setUnitPrice(new BigDecimal("100.00"));

        orderItems = new HashSet<>();
        orderItems.add(item1);
        orderItems.add(item2);

        billingAddress = new Address();
        billingAddress.setStreet("123 Main Street");
        billingAddress.setCity("New York");
        billingAddress.setState("NY");
        billingAddress.setCountry("USA");
        billingAddress.setZipCode("10001");

        shippingAddress = new Address();
        shippingAddress.setStreet("456 Oak Avenue");
        shippingAddress.setCity("Boston");
        shippingAddress.setState("MA");
        shippingAddress.setCountry("USA");
        shippingAddress.setZipCode("02108");

        purchase = new Purchase();
        purchase.setCustomer(customer);
        purchase.setOrder(order);
        purchase.setOrderItems(orderItems);
        purchase.setBillingAddress(billingAddress);
        purchase.setShippingAddress(shippingAddress);
    }

    @Test
    @DisplayName("POST /api/checkout/purchase should place order successfully")
    void testPlaceOrderSuccess() throws Exception {
        MvcResult result = mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.orderTrackingNumber").exists())
                .andExpect(jsonPath("$.orderTrackingNumber").isString())
                .andExpect(jsonPath("$.orderTrackingNumber").value(notNullValue()))
                .andReturn();

        String response = result.getResponse().getContentAsString();
        PurchaseResponse purchaseResponse = objectMapper.readValue(response, PurchaseResponse.class);
        
        assert purchaseResponse.getOrderTrackingNumber() != null;
        assert purchaseResponse.getOrderTrackingNumber().length() == 36; // UUID format
    }

    @Test
    @DisplayName("POST /api/checkout/purchase with multiple items")
    void testPlaceOrderMultipleItems() throws Exception {
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.orderTrackingNumber").exists());
    }

    @Test
    @DisplayName("POST /api/checkout/purchase returns valid UUID tracking number")
    void testOrderTrackingNumberFormat() throws Exception {
        MvcResult result = mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andReturn();

        String response = result.getResponse().getContentAsString();
        PurchaseResponse purchaseResponse = objectMapper.readValue(response, PurchaseResponse.class);
        
        // Validate UUID format: 8-4-4-4-12
        String tracking = purchaseResponse.getOrderTrackingNumber();
        assert tracking.matches("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}");
    }

    @Test
    @DisplayName("POST /api/checkout/purchase with complete purchase data")
    void testPlaceOrderCompleteData() throws Exception {
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.orderTrackingNumber", not(emptyString())))
                .andExpect(jsonPath("$.orderTrackingNumber").exists());
    }

    @Test
    @DisplayName("POST /api/checkout/purchase with different customer")
    void testPlaceOrderDifferentCustomer() throws Exception {
        Customer anotherCustomer = new Customer();
        anotherCustomer.setFirstName("Jane");
        anotherCustomer.setLastName("Smith");
        anotherCustomer.setEmail("jane.smith@example.com");

        purchase.setCustomer(anotherCustomer);

        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.orderTrackingNumber").exists());
    }

    @Test
    @DisplayName("POST /api/checkout/purchase with high order value")
    void testPlaceOrderHighValue() throws Exception {
        order.setTotalPrice(new BigDecimal("9999.99"));
        order.setTotalQuantity(100);

        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.orderTrackingNumber").exists());
    }

    @Test
    @DisplayName("POST /api/checkout/purchase with low order value")
    void testPlaceOrderLowValue() throws Exception {
        order.setTotalPrice(new BigDecimal("0.99"));
        order.setTotalQuantity(1);

        orderItems.clear();
        OrderItem item = new OrderItem();
        item.setQuantity(1);
        item.setUnitPrice(new BigDecimal("0.99"));
        orderItems.add(item);

        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.orderTrackingNumber").exists());
    }

    @Test
    @DisplayName("POST /api/checkout/purchase endpoint is accessible")
    void testEndpointAccessible() throws Exception {
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("POST /api/checkout/purchase returns PurchaseResponse object")
    void testResponseStructure() throws Exception {
        MvcResult result = mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isMap())
                .andReturn();

        String response = result.getResponse().getContentAsString();
        assert response.contains("orderTrackingNumber");
    }

    @Test
    @DisplayName("POST /api/checkout/purchase handles billing address")
    void testBillingAddressHandling() throws Exception {
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.orderTrackingNumber").exists());
    }

    @Test
    @DisplayName("POST /api/checkout/purchase handles shipping address")
    void testShippingAddressHandling() throws Exception {
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.orderTrackingNumber").exists());
    }

    @Test
    @DisplayName("POST /api/checkout/purchase consecutive requests generate different tracking numbers")
    void testConsecutiveRequestsUniqueTracking() throws Exception {
        MvcResult result1 = mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andReturn();

        String tracking1 = objectMapper.readValue(
            result1.getResponse().getContentAsString(), 
            PurchaseResponse.class
        ).getOrderTrackingNumber();

        MvcResult result2 = mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andReturn();

        String tracking2 = objectMapper.readValue(
            result2.getResponse().getContentAsString(), 
            PurchaseResponse.class
        ).getOrderTrackingNumber();

        assert !tracking1.equals(tracking2) : "Tracking numbers should be unique";
    }

    @Test
    @DisplayName("POST /api/checkout/purchase with minimal order data")
    void testPlaceOrderMinimalData() throws Exception {
        Customer minimalCustomer = new Customer();
        minimalCustomer.setEmail("minimal@example.com");

        Order minimalOrder = new Order();
        Set<OrderItem> minimalItems = new HashSet<>();

        Purchase minimalPurchase = new Purchase();
        minimalPurchase.setCustomer(minimalCustomer);
        minimalPurchase.setOrder(minimalOrder);
        minimalPurchase.setOrderItems(minimalItems);
        minimalPurchase.setBillingAddress(billingAddress);
        minimalPurchase.setShippingAddress(shippingAddress);

        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(minimalPurchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.orderTrackingNumber").exists());
    }
}
