package com.splitscale.reems.Unit.Interactors.history;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.history.delete.DeleteHistoryInteractor;
import com.splitscale.reems.repositories.HistoryRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class DeleteHistoryInteractorTest {

  @Mock
  private HistoryRepository repository;

  @InjectMocks
  private DeleteHistoryInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void deleteHistory_shouldInvokeRepositoryDeleteById() throws IOException {
    String historyId = "123";

    interactor.deleteHistoryById(historyId);

    verify(repository).deleteById(historyId);
  }

  @Test
  void deleteAllHistory_shouldInvokeRepositoryDeleteAll() throws IOException {
    interactor.deleteAllHistory();

    verify(repository).deleteAll();
  }
}
