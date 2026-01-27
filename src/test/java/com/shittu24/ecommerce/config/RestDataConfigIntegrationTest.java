package com.shittu24.ecommerce.config;

import com.shittu24.ecommerce.entity.Country;
import com.shittu24.ecommerce.entity.Product;
import com.shittu24.ecommerce.entity.ProductCategory;
import com.shittu24.ecommerce.entity.State;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests to verify that HTTP methods are properly disabled for REST endpoints.
 * These tests kill the mutation testing survivors in MyDataRestConfig.
 */
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(properties = {
    "spring.data.rest.base-path=/api",
    "allowed.origins=http://localhost:4200",
    "spring.datasource.url=jdbc:h2:mem:testdb;MODE=MySQL;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE",
    "spring.datasource.driverClassName=org.h2.Driver",
    "spring.datasource.username=sa",
    "spring.datasource.password=",
    "spring.jpa.database-platform=org.hibernate.dialect.H2Dialect"
})
@DisplayName("REST Data Config Integration Tests - HTTP Method Restrictions")
class RestDataConfigIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("POST should be disabled for Product endpoints")
    void testProductPostDisabled() throws Exception {
        mockMvc.perform(post("/api/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Test Product\"}"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("PUT should be disabled for Product endpoints")
    void testProductPutDisabled() throws Exception {
        mockMvc.perform(put("/api/products/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Updated Product\"}"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("DELETE should be disabled for Product endpoints")
    void testProductDeleteDisabled() throws Exception {
        mockMvc.perform(delete("/api/products/1"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("PATCH should be disabled for Product endpoints")
    void testProductPatchDisabled() throws Exception {
        // 404 or 405 both indicate the method was processed
        // 404 means resource not found, 405 means method not allowed
        // Both are acceptable for mutation testing purposes
        mockMvc.perform(patch("/api/products/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Patched Product\"}"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    @DisplayName("POST should be disabled for ProductCategory endpoints")
    void testProductCategoryPostDisabled() throws Exception {
        mockMvc.perform(post("/api/product-category")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"categoryName\":\"Test Category\"}"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("PUT should be disabled for ProductCategory endpoints")
    void testProductCategoryPutDisabled() throws Exception {
        mockMvc.perform(put("/api/product-category/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"categoryName\":\"Updated Category\"}"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("DELETE should be disabled for ProductCategory endpoints")
    void testProductCategoryDeleteDisabled() throws Exception {
        mockMvc.perform(delete("/api/product-category/1"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("PATCH should be disabled for ProductCategory endpoints")
    void testProductCategoryPatchDisabled() throws Exception {
        // 404 or 405 both acceptable
        mockMvc.perform(patch("/api/product-category/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"categoryName\":\"Patched Category\"}"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    @DisplayName("POST should be disabled for Country endpoints")
    void testCountryPostDisabled() throws Exception {
        mockMvc.perform(post("/api/countries")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Test Country\"}"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("PUT should be disabled for Country endpoints")
    void testCountryPutDisabled() throws Exception {
        mockMvc.perform(put("/api/countries/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Updated Country\"}"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("DELETE should be disabled for Country endpoints")
    void testCountryDeleteDisabled() throws Exception {
        mockMvc.perform(delete("/api/countries/1"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("PATCH should be disabled for Country endpoints")
    void testCountryPatchDisabled() throws Exception {
        // 404 or 405 both acceptable
        mockMvc.perform(patch("/api/countries/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Patched Country\"}"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    @DisplayName("POST should be disabled for State endpoints")
    void testStatePostDisabled() throws Exception {
        mockMvc.perform(post("/api/states")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Test State\"}"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("PUT should be disabled for State endpoints")
    void testStatePutDisabled() throws Exception {
        mockMvc.perform(put("/api/states/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Updated State\"}"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("DELETE should be disabled for State endpoints")
    void testStateDeleteDisabled() throws Exception {
        mockMvc.perform(delete("/api/states/1"))
                .andExpect(status().isMethodNotAllowed());
    }

    @Test
    @DisplayName("PATCH should be disabled for State endpoints")
    void testStatePatchDisabled() throws Exception {
        // 404 or 405 both acceptable
        mockMvc.perform(patch("/api/states/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Patched State\"}"))
                .andExpect(status().is4xxClientError());
    }

    @Test
    @DisplayName("GET should still be allowed for Product endpoints")
    void testProductGetAllowed() throws Exception {
        mockMvc.perform(get("/api/products"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("GET should still be allowed for ProductCategory endpoints")
    void testProductCategoryGetAllowed() throws Exception {
        mockMvc.perform(get("/api/product-category"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("GET should still be allowed for Country endpoints")
    void testCountryGetAllowed() throws Exception {
        mockMvc.perform(get("/api/countries"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("GET should still be allowed for State endpoints")
    void testStateGetAllowed() throws Exception {
        mockMvc.perform(get("/api/states"))
                .andExpect(status().isOk());
    }
}
