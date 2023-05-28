package com.splitscale.reems.eventstream;

interface EventListener<T> {
  void onEvent(Event<T> event);
}
