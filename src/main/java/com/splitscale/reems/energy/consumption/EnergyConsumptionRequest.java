package com.splitscale.reems.energy.consumption;

public class EnergyConsumptionRequest {

  private String propertyName;
  private String usage;

  public EnergyConsumptionRequest(String propertyName, String usage) {
    this.propertyName = propertyName;
    this.usage = usage;
  }

  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public String getUsage() {
    return usage;
  }

  public void setUsage(String usage) {
    this.usage = usage;
  }
}
