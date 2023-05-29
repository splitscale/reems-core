package com.splitscale.reems.core.history;

import java.util.Date;

public class HistoryResponse {

  private String id;
  private String header;
  private String body;
  private Date created;

  public HistoryResponse() {
    //default
  }

  public HistoryResponse(String id, String header, String body, Date created) {
    this.id = id;
    this.header = header;
    this.body = body;
    this.created = created;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }
}
