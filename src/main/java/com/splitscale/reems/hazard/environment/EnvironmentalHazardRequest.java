package com.splitscale.reems.hazard.environment;

import java.sql.Date;

public class EnvironmentalHazardRequest {

  private String id;
  private String propertyId;
  private Date created;
  private Date modified;
  private String category;
  private String title;
  private String description;
  private String riskLevel;

  public EnvironmentalHazardRequest(String id, String propertyId, Date created, Date modified, String category,
      String title, String description, String riskLevel) {
    this.id = id;
    this.propertyId = propertyId;
    this.created = created;
    this.modified = modified;
    this.category = category;
    this.title = title;
    this.description = description;
    this.riskLevel = riskLevel;
  }

  public EnvironmentalHazardRequest() {
    // default
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPropertyId() {
    return propertyId;
  }

  public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
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

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
  }

}
