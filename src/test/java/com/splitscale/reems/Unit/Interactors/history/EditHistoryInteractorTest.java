package com.splitscale.reems.Unit.Interactors.history;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.history.History;
import com.splitscale.reems.history.edit.EditHistoryInteractor;
import com.splitscale.reems.repositories.HistoryRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class EditHistoryInteractorTest {

  @Mock
  private HistoryRepository repository;

  @InjectMocks
  private EditHistoryInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void editHistory_shouldInvokeRepositoryUpdate() throws IOException {
    History history = new History("01", "Sample header", "Sample body", null); // Create a sample History object for testing

    interactor.editHistory(history);

    verify(repository).update(history);
  }
}
