package com.splitscale.reems.properties;

import java.sql.Date;

public class PropertyRequest {

  private String id;
  private Date created;
  private Date modified;
  private String name;
  private String location;
  private String status;

  public PropertyRequest() {
    // default
  }

  public PropertyRequest(String id, Date created, Date modified, String name, String location, String status) {
    this.id = id;
    this.created = created;
    this.modified = modified;
    this.name = name;
    this.location = location;
    this.status = status;
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

  public Date getModified() {
    return modified;
  }

  public void setModified(Date modified) {
    this.modified = modified;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
