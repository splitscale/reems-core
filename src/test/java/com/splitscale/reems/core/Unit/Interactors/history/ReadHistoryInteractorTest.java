package com.splitscale.reems.core.Unit.Interactors.history;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.splitscale.reems.core.history.History;
import com.splitscale.reems.core.history.read.ReadHistoryInteractor;
import com.splitscale.reems.core.repositories.HistoryRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class ReadHistoryInteractorTest {

  @Mock
  private HistoryRepository repository;

  @InjectMocks
  private ReadHistoryInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void getAllHistory_shouldReturnListOfHistories() throws IOException {
    List<History> expectedHistories = new ArrayList<>(); // Create a sample list of histories for testing
    when(repository.getAll()).thenReturn(expectedHistories);

    List<History> actualHistories = interactor.getAllHistory();

    assertEquals(expectedHistories, actualHistories);
    verify(repository).getAll();
  }

  @Test
  void getById_shouldReturnHistoryById() throws IOException {
    String historyId = "123";
    History expectedHistory = new History(
      historyId,
      "Sample header",
      "Sample body",
      null
    ); // Create a sample History object for testing
    when(repository.getById(historyId)).thenReturn(expectedHistory);

    History actualHistory = interactor.getById(historyId);

    assertEquals(expectedHistory, actualHistory);
    verify(repository).getById(historyId);
  }
}
