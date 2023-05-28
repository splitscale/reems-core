package com.splitscale.reems.Unit.Entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.splitscale.reems.tenantinfo.TenantInfo;

public class TenantInfoTest {

  @Test
  public void testGettersAndSetters() {
    // Create a sample TenantInfo instance
    String id = "01";
    String tenantName = "Jiv DelaCruz";

    TenantInfo tenantInfo = new TenantInfo(id, tenantName);

    // Test the getters
    assertEquals(id, tenantInfo.getId());
    assertEquals(tenantName, tenantInfo.getTenantName());

    // Test the setters
    String newId = "02";
    String newTenantName = "Jane Smith";

    tenantInfo.setId(newId);
    tenantInfo.setTenantName(newTenantName);

    // Test the updated values
    assertEquals(newId, tenantInfo.getId());
    assertEquals(newTenantName, tenantInfo.getTenantName());
  }
}
