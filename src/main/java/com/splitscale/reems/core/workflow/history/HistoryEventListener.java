package com.splitscale.reems.core.workflow.history;

import java.io.IOException;

import com.splitscale.reems.core.eventstream.Event;
import com.splitscale.reems.core.eventstream.EventListener;
import com.splitscale.reems.core.history.HistoryRequest;
import com.splitscale.reems.core.history.create.CreateHistoryInteractor;

public class HistoryEventListener implements EventListener<HistoryRequest> {

  CreateHistoryInteractor interactor;

  public HistoryEventListener(CreateHistoryInteractor interactor) {
    this.interactor = interactor;
  }

  @Override
  public void onEvent(Event<HistoryRequest> event) throws IOException {
    HistoryRequest request = event.getData();
    interactor.createHistory(request);
  }
}
