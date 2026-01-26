package com.shittu24.ecommerce.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Advanced tests for PurchaseResponse to increase mutation coverage
 */
@DisplayName("PurchaseResponse Advanced Tests")
class PurchaseResponseAdvancedTest {

    @Test
    @DisplayName("Test hashCode with same tracking number")
    void testHashCodeSameTrackingNumber() {
        PurchaseResponse r1 = new PurchaseResponse();
        PurchaseResponse r2 = new PurchaseResponse();
        
        r1.setOrderTrackingNumber("TRK-12345");
        r2.setOrderTrackingNumber("TRK-12345");
        
        assertEquals(r1.hashCode(), r2.hashCode(),
            "Same tracking numbers should produce same hashCode");
    }

    @Test
    @DisplayName("Test hashCode with different tracking numbers")
    void testHashCodeDifferentTrackingNumbers() {
        PurchaseResponse r1 = new PurchaseResponse();
        PurchaseResponse r2 = new PurchaseResponse();
        
        r1.setOrderTrackingNumber("TRK-11111");
        r2.setOrderTrackingNumber("TRK-22222");
        
        assertNotEquals(r1.hashCode(), r2.hashCode(),
            "Different tracking numbers should produce different hashCodes");
    }

    @Test
    @DisplayName("Test hashCode with null tracking number")
    void testHashCodeNullTrackingNumber() {
        PurchaseResponse r1 = new PurchaseResponse();
        PurchaseResponse r2 = new PurchaseResponse();
        
        r1.setOrderTrackingNumber(null);
        r2.setOrderTrackingNumber(null);
        
        assertEquals(r1.hashCode(), r2.hashCode(),
            "Null tracking numbers should produce same hashCode");
    }

    @Test
    @DisplayName("Test equals with same tracking number")
    void testEqualsSameTrackingNumber() {
        PurchaseResponse r1 = new PurchaseResponse();
        PurchaseResponse r2 = new PurchaseResponse();
        
        r1.setOrderTrackingNumber("TRK-EQUAL");
        r2.setOrderTrackingNumber("TRK-EQUAL");
        
        assertEquals(r1, r2, "Same tracking numbers should be equal");
    }

    @Test
    @DisplayName("Test equals with different tracking numbers")
    void testEqualsDifferentTrackingNumbers() {
        PurchaseResponse r1 = new PurchaseResponse();
        PurchaseResponse r2 = new PurchaseResponse();
        
        r1.setOrderTrackingNumber("TRK-AAA");
        r2.setOrderTrackingNumber("TRK-BBB");
        
        assertNotEquals(r1, r2, "Different tracking numbers should not be equal");
    }

    @Test
    @DisplayName("Test equals with null")
    void testEqualsNull() {
        PurchaseResponse r = new PurchaseResponse();
        r.setOrderTrackingNumber("TRK-123");
        
        assertNotEquals(r, null, "PurchaseResponse should not equal null");
        assertFalse(r.equals(null));
    }

    @Test
    @DisplayName("Test equals with different type")
    void testEqualsDifferentType() {
        PurchaseResponse r = new PurchaseResponse();
        String notAResponse = "not a response";
        
        assertNotEquals(r, notAResponse);
        assertFalse(r.equals(notAResponse));
    }

    @Test
    @DisplayName("Test equals reflexive")
    void testEqualsReflexive() {
        PurchaseResponse r = new PurchaseResponse();
        r.setOrderTrackingNumber("TRK-REFLEX");
        
        assertEquals(r, r, "Object must equal itself");
        assertTrue(r.equals(r));
    }

    @Test
    @DisplayName("Test equals symmetric")
    void testEqualsSymmetric() {
        PurchaseResponse r1 = new PurchaseResponse();
        PurchaseResponse r2 = new PurchaseResponse();
        
        r1.setOrderTrackingNumber("TRK-SYM");
        r2.setOrderTrackingNumber("TRK-SYM");
        
        assertEquals(r1, r2);
        assertEquals(r2, r1);
    }

    @Test
    @DisplayName("Test equals transitive")
    void testEqualsTransitive() {
        PurchaseResponse r1 = new PurchaseResponse();
        PurchaseResponse r2 = new PurchaseResponse();
        PurchaseResponse r3 = new PurchaseResponse();
        
        r1.setOrderTrackingNumber("TRK-TRANS");
        r2.setOrderTrackingNumber("TRK-TRANS");
        r3.setOrderTrackingNumber("TRK-TRANS");
        
        assertEquals(r1, r2);
        assertEquals(r2, r3);
        assertEquals(r1, r3);
    }

    @Test
    @DisplayName("Test hashCode consistency")
    void testHashCodeConsistency() {
        PurchaseResponse r = new PurchaseResponse();
        r.setOrderTrackingNumber("TRK-CONSISTENT");
        
        int hash1 = r.hashCode();
        int hash2 = r.hashCode();
        int hash3 = r.hashCode();
        
        assertEquals(hash1, hash2);
        assertEquals(hash2, hash3);
    }

    @Test
    @DisplayName("Test toString not null")
    void testToStringNotNull() {
        PurchaseResponse r = new PurchaseResponse();
        r.setOrderTrackingNumber("TRK-STRING");
        
        String str = r.toString();
        
        assertNotNull(str);
        assertTrue(str.contains("PurchaseResponse"));
    }

    @Test
    @DisplayName("Test toString with null tracking number")
    void testToStringNullTrackingNumber() {
        PurchaseResponse r = new PurchaseResponse();
        r.setOrderTrackingNumber(null);
        
        String str = r.toString();
        
        assertNotNull(str);
    }

    @Test
    @DisplayName("Test canEqual with PurchaseResponse")
    void testCanEqualWithPurchaseResponse() {
        PurchaseResponse r1 = new PurchaseResponse();
        PurchaseResponse r2 = new PurchaseResponse();
        
        assertTrue(r1.canEqual(r2));
    }

    @Test
    @DisplayName("Test canEqual with same instance")
    void testCanEqualSameInstance() {
        PurchaseResponse r = new PurchaseResponse();
        
        assertTrue(r.canEqual(r));
    }

    @Test
    @DisplayName("Test getter and setter")
    void testGetterSetter() {
        PurchaseResponse r = new PurchaseResponse();
        
        assertNull(r.getOrderTrackingNumber());
        
        String trackingNumber = "TRK-GETTER-SETTER";
        r.setOrderTrackingNumber(trackingNumber);
        
        assertEquals(trackingNumber, r.getOrderTrackingNumber());
    }

    @Test
    @DisplayName("Test with very long tracking number")
    void testVeryLongTrackingNumber() {
        PurchaseResponse r = new PurchaseResponse();
        String longTracking = "TRK-" + "X".repeat(500);
        
        r.setOrderTrackingNumber(longTracking);
        
        assertEquals(longTracking, r.getOrderTrackingNumber());
    }

    @Test
    @DisplayName("Test with special characters in tracking number")
    void testSpecialCharactersInTrackingNumber() {
        PurchaseResponse r = new PurchaseResponse();
        String specialTracking = "TRK-ÄÖÜ-#$%&-2024";
        
        r.setOrderTrackingNumber(specialTracking);
        
        assertEquals(specialTracking, r.getOrderTrackingNumber());
    }

    @Test
    @DisplayName("Test multiple updates to tracking number")
    void testMultipleUpdates() {
        PurchaseResponse r = new PurchaseResponse();
        
        r.setOrderTrackingNumber("TRK-001");
        assertEquals("TRK-001", r.getOrderTrackingNumber());
        
        r.setOrderTrackingNumber("TRK-002");
        assertEquals("TRK-002", r.getOrderTrackingNumber());
        
        r.setOrderTrackingNumber("TRK-003");
        assertEquals("TRK-003", r.getOrderTrackingNumber());
    }

    @Test
    @DisplayName("Test equal objects have equal hashCode")
    void testEqualObjectsEqualHashCode() {
        PurchaseResponse r1 = new PurchaseResponse();
        PurchaseResponse r2 = new PurchaseResponse();
        
        r1.setOrderTrackingNumber("TRK-HASH-EQUAL");
        r2.setOrderTrackingNumber("TRK-HASH-EQUAL");
        
        assertEquals(r1, r2);
        assertEquals(r1.hashCode(), r2.hashCode());
    }
}
