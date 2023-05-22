package com.splitscale.reems.mitigation;

import java.util.Date;

public class Mitigation {

  private String id;
  private String hazardId;
  private String task;
  private String description;
  private String cost;
  private Date created;
  private Date modified;

  public Mitigation(
    String id,
    String hazardId,
    String task,
    String description,
    String cost,
    Date created,
    Date modified
  ) {
    this.id = id;
    this.hazardId = hazardId;
    this.task = task;
    this.description = description;
    this.cost = cost;
    this.created = created;
    this.modified = modified;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getHazardId() {
    return hazardId;
  }

  public void setHazardId(String hazardId) {
    this.hazardId = hazardId;
  }

  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
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
