package com.splitscale.reems.hazard.environment;

public class EnvironmentalHazardRequest {

  private String title;
  private String category;
  private String description;
  private String propertyName;
  private String riskLevel;
  private String mitigationStatus;

  public EnvironmentalHazardRequest() {
    //default
  }

  public EnvironmentalHazardRequest(
    String title,
    String category,
    String description,
    String propertyName,
    String riskLevel,
    String mitigationStatus
  ) {
    this.title = title;
    this.category = category;
    this.description = description;
    this.propertyName = propertyName;
    this.riskLevel = riskLevel;
    this.mitigationStatus = mitigationStatus;
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
}
