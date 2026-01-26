package com.shittu24.ecommerce.config;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Integration tests for MyDataRestConfig
 * Tests REST configuration initialization with Spring context
 */
@SpringBootTest
@TestPropertySource(properties = {
    "spring.data.rest.base-path=/api",
    "allowed.origins=http://localhost:4200",
    // Override CI environment variables to use H2 for tests
    "spring.datasource.url=jdbc:h2:mem:testdb;MODE=MySQL;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE",
    "spring.datasource.driverClassName=org.h2.Driver",
    "spring.datasource.username=sa",
    "spring.datasource.password=",
    "spring.jpa.database-platform=org.hibernate.dialect.H2Dialect"
})
@DisplayName("MyDataRestConfig Integration Tests")
class MyDataRestConfigTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private MyDataRestConfig config;

    @Test
    @DisplayName("Should create config bean")
    void testConfigBean() {
        assertNotNull(config, "MyDataRestConfig bean should be created");
    }

    @Test
    @DisplayName("Should inject EntityManager")
    void testEntityManagerInjection() {
        assertNotNull(entityManager, "EntityManager should be injected");
    }

    @Test
    @DisplayName("Should have entities in metamodel")
    void testMetamodelHasEntities() {
        assertNotNull(entityManager.getMetamodel());
        assertFalse(entityManager.getMetamodel().getEntities().isEmpty(), 
                    "Metamodel should have entities");
    }

    @Test
    @DisplayName("Should have at least 5 entity types")
    void testEntityCount() {
        int entityCount = entityManager.getMetamodel().getEntities().size();
        assertTrue(entityCount >= 5, 
                   "Should have at least 5 entity types (Product, ProductCategory, Country, State, Customer)");
    }
}
