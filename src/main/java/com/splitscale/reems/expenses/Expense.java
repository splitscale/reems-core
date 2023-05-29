package com.splitscale.reems.expenses;

import java.util.Date;

public class Expense {

  private String id;
  private Date created;
  private Date modified;
  private String value;
  private String unit;

  public Expense() {
    // default
  }

  public Expense(String id, Date created, Date modified, String value, String unit) {
    this.id = id;
    this.created = created;
    this.modified = modified;
    this.value = value;
    this.unit = unit;
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

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

}
