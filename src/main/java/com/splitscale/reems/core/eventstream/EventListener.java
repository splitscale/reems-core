package com.splitscale.reems.core.eventstream;

import java.io.IOException;

public interface EventListener<T> {
  void onEvent(Event<T> event) throws IOException;
}
