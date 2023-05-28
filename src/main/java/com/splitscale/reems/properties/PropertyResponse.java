package com.splitscale.reems.properties;

public class PropertyResponse {

  private String id;
  private String name;
  private String location;
  private String status;

  public PropertyResponse() {
    //default
  }

  public PropertyResponse(
    String id,
    String name,
    String location,
    String status
  ) {
    this.id = id;
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
