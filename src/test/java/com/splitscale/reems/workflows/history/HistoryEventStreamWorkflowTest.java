package com.splitscale.reems.workflows.history;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.splitscale.reems.eventstream.EventPublisher;
import com.splitscale.reems.history.HistoryRequest;
import com.splitscale.reems.workflow.history.HistoryEventListener;
import com.splitscale.reems.workflow.history.HistoryEventStreamWorkflow;

public class HistoryEventStreamWorkflowTest {
  @Mock
  private EventPublisher<HistoryRequest> publisher;

  @Mock
  private HistoryEventListener listener;

  @InjectMocks
  private HistoryEventStreamWorkflow workflow;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    workflow = new HistoryEventStreamWorkflow(publisher, listener);
  }

  @Test
  void startListening_shouldSubscribeWorkflowToPublisher() {
    workflow.startListening();

    verify(publisher, times(1)).subscribe(listener);
  }

  @Test
  void addHistory_shouldPublishEvent() throws IOException {
    HistoryRequest request = new HistoryRequest("Test", "content");

    workflow.addHistory(request);

    verify(publisher, times(1)).publishEvent(request);
  }

  @Test
  void clearStream_shouldClearListeners() {
    workflow.clearStream();

    verify(publisher, times(1)).clearListeners();
  }
}
