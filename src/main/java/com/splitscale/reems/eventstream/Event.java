package com.splitscale.reems.eventstream;

class Event<T> {
  private T data;

  public Event(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }
}