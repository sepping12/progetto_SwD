package com.shittu24.ecommerce.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shittu24.ecommerce.dto.Purchase;
import com.shittu24.ecommerce.dto.PurchaseResponse;
import com.shittu24.ecommerce.entity.Address;
import com.shittu24.ecommerce.entity.Customer;
import com.shittu24.ecommerce.entity.Order;
import com.shittu24.ecommerce.entity.OrderItem;
import com.shittu24.ecommerce.service.CheckoutService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.StringContains.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CheckoutController.class)
@DisplayName("Checkout Controller API Tests")
class CheckoutControllerApiTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CheckoutService checkoutService;

    @Autowired
    private ObjectMapper objectMapper;

    private Purchase purchase;
    private PurchaseResponse response;

    @BeforeEach
    void setUp() {
        // Initialize test purchase data
        Customer customer = new Customer();
        customer.setFirstName("Jane");
        customer.setLastName("Smith");
        customer.setEmail("jane.smith@example.com");

        Order order = new Order();
        order.setTotalPrice(new BigDecimal("499.99"));
        order.setTotalQuantity(3);

        OrderItem item1 = new OrderItem();
        item1.setUnitPrice(new BigDecimal("149.99"));
        item1.setQuantity(1);

        OrderItem item2 = new OrderItem();
        item2.setUnitPrice(new BigDecimal("175.00"));
        item2.setQuantity(2);

        Set<OrderItem> orderItems = new HashSet<>();
        orderItems.add(item1);
        orderItems.add(item2);

        Address billingAddress = new Address();
        billingAddress.setStreet("789 Billing Lane");
        billingAddress.setCity("Los Angeles");
        billingAddress.setState("CA");
        billingAddress.setCountry("USA");
        billingAddress.setZipCode("90001");

        Address shippingAddress = new Address();
        shippingAddress.setStreet("321 Shipping Road");
        shippingAddress.setCity("San Francisco");
        shippingAddress.setState("CA");
        shippingAddress.setCountry("USA");
        shippingAddress.setZipCode("94105");

        purchase = new Purchase();
        purchase.setCustomer(customer);
        purchase.setOrder(order);
        purchase.setOrderItems(orderItems);
        purchase.setBillingAddress(billingAddress);
        purchase.setShippingAddress(shippingAddress);

        response = new PurchaseResponse("f6b89370-e2f5-4a1f-8f7c-5d5c4e0f7a2b");
    }

    @Test
    @DisplayName("Should successfully place order via POST endpoint")
    void testPlaceOrderSuccess() throws Exception {
        // Arrange
        when(checkoutService.placeOrder(any(Purchase.class))).thenReturn(response);

        // Act & Assert
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.orderTrackingNumber", notNullValue()));
    }

    @Test
    @DisplayName("Should return correct tracking number format")
    void testReturnTrackingNumberFormat() throws Exception {
        // Arrange
        when(checkoutService.placeOrder(any(Purchase.class))).thenReturn(response);

        // Act & Assert
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.orderTrackingNumber", 
                        containsString("f6b89370-e2f5-4a1f-8f7c-5d5c4e0f7a2b")));
    }

    @Test
    @DisplayName("Should handle multiple sequential requests")
    void testMultipleSequentialRequests() throws Exception {
        // Arrange
        PurchaseResponse response1 = new PurchaseResponse("uuid-1");
        PurchaseResponse response2 = new PurchaseResponse("uuid-2");
        
        when(checkoutService.placeOrder(any(Purchase.class)))
                .thenReturn(response1)
                .thenReturn(response2);

        // Act & Assert - First request
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.orderTrackingNumber", containsString("uuid-1")));

        // Act & Assert - Second request
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.orderTrackingNumber", containsString("uuid-2")));
    }

    @Test
    @DisplayName("Should handle missing request body gracefully")
    void testMissingRequestBody() throws Exception {
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

    @Test
    @DisplayName("Should accept POST request to correct endpoint")
    void testCorrectEndpoint() throws Exception {
        // Arrange
        when(checkoutService.placeOrder(any(Purchase.class))).thenReturn(response);

        // Act & Assert
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("Should return JSON content type")
    void testResponseContentType() throws Exception {
        // Arrange
        when(checkoutService.placeOrder(any(Purchase.class))).thenReturn(response);

        // Act & Assert
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    @Test
    @DisplayName("Should include orderTrackingNumber in response")
    void testResponseContainsTrackingNumber() throws Exception {
        // Arrange
        when(checkoutService.placeOrder(any(Purchase.class))).thenReturn(response);

        // Act & Assert
        mockMvc.perform(post("/api/checkout/purchase")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(purchase)))
                .andExpect(jsonPath("$.orderTrackingNumber").exists())
                .andExpect(jsonPath("$.orderTrackingNumber").isNotEmpty());
    }
}
