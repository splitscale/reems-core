package com.splitscale.reems.expenses;

import java.util.Date;

public class Expense {

  private String id;
  private String expense;
  private Date created;
  private Date modified;

  public Expense() {
    //default
  }

  public Expense(String id, String expense, Date created, Date modified) {
    this.id = id;
    this.expense = expense;
    this.created = created;
    this.modified = modified;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getExpense() {
    return expense;
  }

  public void setExpense(String expense) {
    this.expense = expense;
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

public void setDescription(String string) {
}
}
