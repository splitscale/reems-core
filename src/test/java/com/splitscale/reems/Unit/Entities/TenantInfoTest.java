package com.splitscale.reems.Unit.Entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.splitscale.reems.tenantinfo.TenantInfo;
import org.junit.jupiter.api.Test;

public class TenantInfoTest {

  @Test
  public void testGettersAndSetters() {
    // Create a sample TenantInfo instance
    String id = "01";
    String tenantName = "Jiv DelaCruz";
    String propertyName = "Building A";

    TenantInfo tenantInfo = new TenantInfo(id, tenantName, propertyName);

    // Test the getters
    assertEquals(id, tenantInfo.getId());
    assertEquals(tenantName, tenantInfo.getTenantName());
    assertEquals(propertyName, tenantInfo.getPropertyName());

    // Test the setters
    String newId = "02";
    String newTenantName = "Jane Smith";
    String newPropertyName = "New Property";

    tenantInfo.setId(newId);
    tenantInfo.setTenantName(newTenantName);
    tenantInfo.setPropertyName(newPropertyName);

    // Test the updated values
    assertEquals(newId, tenantInfo.getId());
    assertEquals(newTenantName, tenantInfo.getTenantName());
    assertEquals(newPropertyName, tenantInfo.getPropertyName());
  }
}
