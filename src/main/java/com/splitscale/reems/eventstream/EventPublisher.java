package com.splitscale.reems.eventstream;

import java.util.ArrayList;
import java.util.List;

class EventPublisher<T> {
  private List<EventListener<T>> listeners = new ArrayList<>();

  public void subscribe(EventListener<T> listener) {
    listeners.add(listener);
  }

  public void unsubscribe(EventListener<T> listener) {
    listeners.remove(listener);
  }

  public void publishEvent(T eventData) {
    Event<T> event = new Event<>(eventData);
    for (EventListener<T> listener : listeners) {
      listener.onEvent(event);
    }
  }
}