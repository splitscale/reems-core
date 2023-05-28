package com.splitscale.reems.tenantinfo;

public class TenantInfoRequest {

  private String tenantName;
  private String propertyName;

  public TenantInfoRequest() {
    //default
  }

  public TenantInfoRequest(String tenantName, String propertyName) {
    this.tenantName = tenantName;
    this.propertyName = propertyName;
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
