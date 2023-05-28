package com.splitscale.reems.Unit.Entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;

import com.splitscale.reems.tenantinfo.TenantInfo;

import org.junit.jupiter.api.Test;

public class TenantInfoTest {

  @Test
  public void testGettersAndSetters() {
    // Create test data
    String id = "01";
    String tenantName = "Jiv Dela Cruz";
    Date created = Date.valueOf("2023-01-01");
    Date edited = Date.valueOf("2023-01-02");

    // Create a TenantInfo object
    TenantInfo tenantInfo = new TenantInfo();

    // Set the values using the setter methods
    tenantInfo.setId(id);
    tenantInfo.setTenantName(tenantName);
    tenantInfo.setCreated(created);
    tenantInfo.setEdited(edited);

    // Check if the getter methods return the correct values
    assertEquals(id, tenantInfo.getId());
    assertEquals(tenantName, tenantInfo.getTenantName());
    assertEquals(created, tenantInfo.getCreated());
    assertEquals(edited, tenantInfo.getEdited());
  }

  @Test
  public void testConstructor() {
    // Create test data
    String id = "01";
    String tenantName = "Jiv Dela Cruz";
    Date created = Date.valueOf("2023-01-01");
    Date edited = Date.valueOf("2023-01-02");

    // Create a TenantInfo object using the constructor
    TenantInfo tenantInfo = new TenantInfo(id, tenantName, created, edited);

    // Check if the getter methods return the correct values
    assertEquals(id, tenantInfo.getId());
    assertEquals(tenantName, tenantInfo.getTenantName());
    assertEquals(created, tenantInfo.getCreated());
    assertEquals(edited, tenantInfo.getEdited());
  }
}
