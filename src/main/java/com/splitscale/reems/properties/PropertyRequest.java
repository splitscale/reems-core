package com.splitscale.reems.properties;

public class PropertyRequest {

  private String name;
  private String location;
  private String status;

  public PropertyRequest(String name, String location, String status) {
    this.name = name;
    this.location = location;
    this.status = status;
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
