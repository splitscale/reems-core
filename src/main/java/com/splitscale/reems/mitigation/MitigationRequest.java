package com.splitscale.reems.mitigation;

public class MitigationRequest {

  private String task;
  private String description;
  private String cost;

  public MitigationRequest() {
    //default
  }

  public MitigationRequest(String task, String description, String cost) {
    this.task = task;
    this.description = description;
    this.cost = cost;
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
}
