package com.splitscale.reems.core.energy.consumption;

import java.sql.Date;

public class EnergyConsumptionRequest {

  private String id;
  private String expenseId;
  private String propertyId;
  private Date created;
  private Date edited;
  private String consumedValue;
  private String energyUnit;
  private String usageValue;
  private double costPerUnit;

  public EnergyConsumptionRequest() {
    // default
  }

  public EnergyConsumptionRequest(String id, String expenseId, String propertyId, Date created, Date edited,
      String consumedValue, String energyUnit, String usageValue, double costPerUnit) {
    this.id = id;
    this.expenseId = expenseId;
    this.propertyId = propertyId;
    this.created = created;
    this.edited = edited;
    this.consumedValue = consumedValue;
    this.energyUnit = energyUnit;
    this.usageValue = usageValue;
    this.costPerUnit = costPerUnit;
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

  public double getCostPerUnit() {
    return costPerUnit;
  }

  public void setCostPerUnit(double costPerUnit) {
    this.costPerUnit = costPerUnit;
  }
}
