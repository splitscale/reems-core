package com.splitscale.reems.energy.consumption;

import java.util.Date;

public class EnergyConsumption {

  private String id;
  private String propertyId;
  private String propertyName;
  private String usage;
  private String consumed;
  private String amount;
  private Date created;
  private Date modified;

  public EnergyConsumption() {
    // default
  }
  
  public EnergyConsumption(
    String id,
    String propertyId,
    String propertyName,
    String usage,
    String consumed,
    String amount,
    Date created,
    Date modified
  ) {
    this.id = id;
    this.propertyId = propertyId;
    this.propertyName = propertyName;
    this.usage = usage;
    this.consumed = consumed;
    this.amount = amount;
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

  public String getConsumed() {
    return consumed;
  }

  public void setConsumed(String consumed) {
    this.consumed = consumed;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
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
