package com.splitscale.reems.tenantinfo;

public class TenantInfoResponse {

  private String id;
  private String tenantName;
  private String propertyName;

  public TenantInfoResponse(String id, String tenantName, String propertyName) {
    this.id = id;
    this.tenantName = tenantName;
    this.propertyName = propertyName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }
}
