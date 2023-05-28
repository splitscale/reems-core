package com.splitscale.reems.tenantinfo;

public class TenantInfoResponse {

  private String id;
  private String tenantName;

  public TenantInfoResponse(String id, String tenantName) {
    this.id = id;
    this.tenantName = tenantName;
  }

  public TenantInfoResponse() {
    //default
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
}
