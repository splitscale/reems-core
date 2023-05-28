package com.splitscale.reems.hazard.environment;

import java.util.Date;

public class EnvironmentalHazardResponse {

  private String id;
  private String propertyId;
  private String title;
  private String category;
  private String description;
  private String propertyName;
  private String riskLevel;
  private String mitigationStatus;
  private Date created;
  private Date modified;

  public EnvironmentalHazardResponse() {
    //default
  }

  public EnvironmentalHazardResponse(
    String id,
    String propertyId,
    String title,
    String category,
    String description,
    String propertyName,
    String riskLevel,
    String mitigationStatus,
    Date created,
    Date modified
  ) {
    this.id = id;
    this.propertyId = propertyId;
    this.title = title;
    this.category = category;
    this.description = description;
    this.propertyName = propertyName;
    this.riskLevel = riskLevel;
    this.mitigationStatus = mitigationStatus;
    this.created = created;
    this.modified = modified;
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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public String getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(String riskLevel) {
    this.riskLevel = riskLevel;
  }

  public String getMitigationStatus() {
    return mitigationStatus;
  }

  public void setMitigationStatus(String mitigationStatus) {
    this.mitigationStatus = mitigationStatus;
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
}
