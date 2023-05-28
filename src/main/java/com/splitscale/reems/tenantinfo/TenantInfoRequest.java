package com.splitscale.reems.tenantinfo;

import java.sql.Date;

public class TenantInfoRequest {
  private String id;
  private String tenantName;
  private Date created;
  private Date edited;

  public TenantInfoRequest(String id, String tenantName) {
    this.id = id;
    this.tenantName = tenantName;
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
