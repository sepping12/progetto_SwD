package com.shittu24.ecommerce.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

@DisplayName("OrderItem Entity Tests")
class OrderItemTest {

    private OrderItem orderItem;

    @BeforeEach
    void setUp() {
        orderItem = new OrderItem();
    }

    @Test
    @DisplayName("Should initialize OrderItem with default values")
    void testOrderItemInitialization() {
        assertThat(orderItem).isNotNull();
        assertThat(orderItem.getQuantity()).isEqualTo(0);
        assertThat(orderItem.getUnitPrice()).isNull();
    }

    @Test
    @DisplayName("Should set and get quantity")
    void testSetGetQuantity() {
        orderItem.setQuantity(5);
        assertThat(orderItem.getQuantity()).isEqualTo(5);
    }

    @Test
    @DisplayName("Should set and get unit price")
    void testSetGetUnitPrice() {
        BigDecimal price = new BigDecimal("29.99");
        orderItem.setUnitPrice(price);
        assertThat(orderItem.getUnitPrice()).isEqualTo(price);
    }

    @Test
    @DisplayName("Should set and get order")
    void testSetGetOrder() {
        Order order = new Order();
        orderItem.setOrder(order);
        assertThat(orderItem.getOrder()).isEqualTo(order);
    }

    @Test
    @DisplayName("Should set and get image URL")
    void testSetGetImageUrl() {
        String imageUrl = "https://example.com/image.jpg";
        orderItem.setImageUrl(imageUrl);
        assertThat(orderItem.getImageUrl()).isEqualTo(imageUrl);
    }

    @Test
    @DisplayName("Should set and get product ID")
    void testSetGetProductId() {
        orderItem.setProductId(123L);
        assertThat(orderItem.getProductId()).isEqualTo(123L);
    }

    @Test
    @DisplayName("Should set and get ID")
    void testSetGetId() {
        orderItem.setId(1L);
        assertThat(orderItem.getId()).isEqualTo(1L);
    }
}
