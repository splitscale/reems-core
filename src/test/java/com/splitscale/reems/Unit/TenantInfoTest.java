package com.splitscale.reems.Unit;

import com.splitscale.reems.tenantinfo.TenantInfo;
import org.junit.Assert;
import org.junit.Test;

public class TenantInfoTest {

  @Test
  public void testGettersAndSetters() {
    // Create a sample TenantInfo instance
    String id = "1";
    String tenantName = "Jiv DelaCruz";
    String propertyName = "Building A";

    TenantInfo tenantInfo = new TenantInfo(id, tenantName, propertyName);

    // Test the getters
    Assert.assertEquals(id, tenantInfo.getId());
    Assert.assertEquals(tenantName, tenantInfo.getTenantName());
    Assert.assertEquals(propertyName, tenantInfo.getPropertyName());

    // Test the setters
    String newId = "2";
    String newTenantName = "Jane Smith";
    String newPropertyName = "New Property";

    tenantInfo.setId(newId);
    tenantInfo.setTenantName(newTenantName);
    tenantInfo.setPropertyName(newPropertyName);

    // Test the updated values
    Assert.assertEquals(newId, tenantInfo.getId());
    Assert.assertEquals(newTenantName, tenantInfo.getTenantName());
    Assert.assertEquals(newPropertyName, tenantInfo.getPropertyName());
  }
}
