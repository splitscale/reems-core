package com.splitscale.reems.workflows.history;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.splitscale.reems.eventstream.Event;
import com.splitscale.reems.history.HistoryRequest;
import com.splitscale.reems.history.create.CreateHistoryInteractor;
import com.splitscale.reems.workflow.history.HistoryEventListener;

@ExtendWith(value = { MockitoExtension.class })
public class HistoryEventListenerTest {
  @Mock
  private CreateHistoryInteractor interactor;

  @InjectMocks
  private HistoryEventListener listener;

  @BeforeEach
  void setUp() {
    listener = new HistoryEventListener(interactor);
  }

  @Test
  void onEvent_shouldCallCreateHistory() throws IOException {
    // Arrange
    HistoryRequest request = new HistoryRequest("Test", "contents");
    Event<HistoryRequest> event = new Event<>(request);

    // Act
    listener.onEvent(event);

    // Assert
    verify(interactor, times(1)).createHistory(request);
  }
}
