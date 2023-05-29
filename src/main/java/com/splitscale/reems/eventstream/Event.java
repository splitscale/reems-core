package com.splitscale.reems.eventstream;

public class Event<T> {
  private T data;

  public Event(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }
}