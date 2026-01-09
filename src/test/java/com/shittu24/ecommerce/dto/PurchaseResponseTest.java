package com.shittu24.ecommerce.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("PurchaseResponse DTO Tests")
class PurchaseResponseTest {

    private PurchaseResponse purchaseResponse;

    @BeforeEach
    void setUp() {
        purchaseResponse = new PurchaseResponse();
    }

    @Test
    @DisplayName("Should create PurchaseResponse with no-arg constructor")
    void testNoArgConstructor() {
        assertThat(purchaseResponse).isNotNull();
    }

    @Test
    @DisplayName("Should set and get order tracking number")
    void testSetGetOrderTrackingNumber() {
        String trackingNumber = "123e4567-e89b-12d3-a456-426614174000";
        purchaseResponse.setOrderTrackingNumber(trackingNumber);
        assertThat(purchaseResponse.getOrderTrackingNumber()).isEqualTo(trackingNumber);
    }

    @Test
    @DisplayName("Should create PurchaseResponse with all-arg constructor")
    void testAllArgConstructor() {
        String trackingNumber = "uuid-123";
        PurchaseResponse response = new PurchaseResponse(trackingNumber);
        assertThat(response.getOrderTrackingNumber()).isEqualTo(trackingNumber);
    }

    @Test
    @DisplayName("Should handle null tracking number")
    void testNullTrackingNumber() {
        purchaseResponse.setOrderTrackingNumber(null);
        assertThat(purchaseResponse.getOrderTrackingNumber()).isNull();
    }

    @Test
    @DisplayName("Should handle empty tracking number")
    void testEmptyTrackingNumber() {
        purchaseResponse.setOrderTrackingNumber("");
        assertThat(purchaseResponse.getOrderTrackingNumber()).isEmpty();
    }
}
