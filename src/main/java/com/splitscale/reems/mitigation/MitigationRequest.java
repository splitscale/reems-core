package com.splitscale.reems.mitigation;

import java.sql.Date;

public class MitigationRequest {

  private String id;
  private String expenseId;
  private Date created;
  private Date edited;
  private String title;
  private String description;
  private String cost;
  private String status;

  public MitigationRequest() {
    // default
  }

  public MitigationRequest(String id, String expenseId, Date created, Date edited, String title, String description,
      String cost, String status) {
    this.id = id;
    this.expenseId = expenseId;
    this.created = created;
    this.edited = edited;
    this.title = title;
    this.description = description;
    this.cost = cost;
    this.status = status;
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

  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
