package com.shittu24.ecommerce.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("Address Entity Tests")
class AddressTest {

    private Address address;

    @BeforeEach
    void setUp() {
        address = new Address();
    }

    @Test
    @DisplayName("Should initialize Address with default values")
    void testAddressInitialization() {
        assertThat(address).isNotNull();
        assertThat(address.getStreet()).isNull();
        assertThat(address.getCity()).isNull();
        assertThat(address.getState()).isNull();
    }

    @Test
    @DisplayName("Should set and get street")
    void testSetGetStreet() {
        address.setStreet("123 Main Street");
        assertThat(address.getStreet()).isEqualTo("123 Main Street");
    }

    @Test
    @DisplayName("Should set and get city")
    void testSetGetCity() {
        address.setCity("New York");
        assertThat(address.getCity()).isEqualTo("New York");
    }

    @Test
    @DisplayName("Should set and get state")
    void testSetGetState() {
        address.setState("NY");
        assertThat(address.getState()).isEqualTo("NY");
    }

    @Test
    @DisplayName("Should set and get country")
    void testSetGetCountry() {
        address.setCountry("USA");
        assertThat(address.getCountry()).isEqualTo("USA");
    }

    @Test
    @DisplayName("Should set and get zip code")
    void testSetGetZipCode() {
        address.setZipCode("10001");
        assertThat(address.getZipCode()).isEqualTo("10001");
    }

    @Test
    @DisplayName("Should set and get ID")
    void testSetGetId() {
        address.setId(1L);
        assertThat(address.getId()).isEqualTo(1L);
    }

    @Test
    @DisplayName("Should create complete address")
    void testCompleteAddress() {
        address.setId(1L);
        address.setStreet("456 Oak Avenue");
        address.setCity("Boston");
        address.setState("MA");
        address.setCountry("USA");
        address.setZipCode("02108");
        
        assertThat(address.getId()).isEqualTo(1L);
        assertThat(address.getStreet()).isEqualTo("456 Oak Avenue");
        assertThat(address.getCity()).isEqualTo("Boston");
        assertThat(address.getState()).isEqualTo("MA");
        assertThat(address.getCountry()).isEqualTo("USA");
        assertThat(address.getZipCode()).isEqualTo("02108");
    }
}
