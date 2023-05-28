package com.splitscale.reems.tenantinfo;

public class TenantInfoRequest {

  private String id;
  private String tenantName;

  public TenantInfoRequest(String id, String tenantName) {
    this.id = id;
    this.tenantName = tenantName;
  }

  public TenantInfoRequest() {
    // default
  }

  public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
