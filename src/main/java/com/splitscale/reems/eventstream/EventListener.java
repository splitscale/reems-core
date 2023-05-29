package com.splitscale.reems.eventstream;

import java.io.IOException;

public interface EventListener<T> {
  void onEvent(Event<T> event) throws IOException;
}
