package com.splitscale.reems.tenantinfo;

import java.sql.Date;

public class TenantInfoRequest {
  private String id;
  private String tenantName;
  private Date created;
  private Date edited;

  public TenantInfoRequest(String id, String tenantName, Date created, Date edited) {
    this.id = id;
    this.tenantName = tenantName;
    this.created = created;
    this.edited = edited;
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

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getEdited() {
    return edited;
  }

  public void setEdited(Date edited) {
    this.edited = edited;
  }
}
