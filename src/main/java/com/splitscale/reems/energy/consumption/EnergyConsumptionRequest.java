package com.splitscale.reems.energy.consumption;

public class EnergyConsumptionRequest {

  private String id;
  private String expenseId;
  private String propertyId;
  private String consumedValue;
  private String energyUnit;
  private String usageValue;
  private double constPerUnit;

  public EnergyConsumptionRequest(String id, String expenseId, String propertyId, String consumedValue,
      String energyUnit, String usageValue, double constPerUnit) {
    this.id = id;
    this.expenseId = expenseId;
    this.propertyId = propertyId;
    this.consumedValue = consumedValue;
    this.energyUnit = energyUnit;
    this.usageValue = usageValue;
    this.constPerUnit = constPerUnit;
  }

  public EnergyConsumptionRequest() {
    // default
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getExpenseId() {
    return expenseId;
  }

  public void setExpenseId(String expenseId) {
    this.expenseId = expenseId;
  }

  public String getPropertyId() {
    return propertyId;
  }

  public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
  }

  public String getConsumedValue() {
    return consumedValue;
  }

  public void setConsumedValue(String consumedValue) {
    this.consumedValue = consumedValue;
  }

  public String getEnergyUnit() {
    return energyUnit;
  }

  public void setEnergyUnit(String energyUnit) {
    this.energyUnit = energyUnit;
  }

  public String getUsageValue() {
    return usageValue;
  }

  public void setUsageValue(String usageValue) {
    this.usageValue = usageValue;
  }

  public double getConstPerUnit() {
    return constPerUnit;
  }

  public void setConstPerUnit(double constPerUnit) {
    this.constPerUnit = constPerUnit;
  }

}
