package com.splitscale.reems.workflow.history;

import java.io.IOException;

import com.splitscale.reems.eventstream.EventPublisher;
import com.splitscale.reems.history.HistoryRequest;

/*
 * this should go to the REST controllers
 * this should add a history on every successful response when modifying the entities
 */
public class HistoryEventStreamWorkflow {
  // Create the event publisher and workflow
  private EventPublisher<HistoryRequest> publisher;
  private HistoryEventListener listener;

  public HistoryEventStreamWorkflow(EventPublisher<HistoryRequest> publisher, HistoryEventListener listener) {
    this.publisher = publisher;
    this.listener = listener;
  }

  public void startListening() {
    // Subscribe the workflow to the event publisher
    publisher.subscribe(listener);
  }

  public void addHistory(HistoryRequest request) throws IOException {
    publisher.publishEvent(request);
  }

  public void clearStream() {
    publisher.clearListeners();
  }
}
