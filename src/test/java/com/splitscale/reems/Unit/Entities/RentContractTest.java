package com.splitscale.reems.Unit.Entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.splitscale.reems.rentContract.RentContract;

class RentContractTest {

    @Test
    void testRentContractInitialization() {
        // Arrange
        String id = "123";
        String tenantInfoId = "456";
        String propertyId = "789";

        // Act
        RentContract rentContract = new RentContract(id, tenantInfoId, propertyId);

        // Assert
        Assertions.assertEquals(id, rentContract.getId());
        Assertions.assertEquals(tenantInfoId, rentContract.getTenantInfoId());
        Assertions.assertEquals(propertyId, rentContract.getPropertyId());
    }

    @Test
    void testRentContractProperties() {
        // Arrange
        RentContract rentContract = new RentContract();

        // Act
        rentContract.setId("123");
        rentContract.setTenantInfoId("456");
        rentContract.setPropertyId("789");

        // Assert
        Assertions.assertEquals("123", rentContract.getId());
        Assertions.assertEquals("456", rentContract.getTenantInfoId());
        Assertions.assertEquals("789", rentContract.getPropertyId());
    }
}
