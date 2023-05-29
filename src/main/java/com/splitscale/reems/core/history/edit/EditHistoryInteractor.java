package com.splitscale.reems.core.history.edit;

import com.splitscale.reems.core.history.History;
import com.splitscale.reems.core.repositories.HistoryRepository;
import java.io.IOException;

public class EditHistoryInteractor {

  private HistoryRepository repository;

  public EditHistoryInteractor(HistoryRepository repository) {
    this.repository = repository;
  }

  public void editHistory(History history) throws IOException {
    repository.update(history);
  }
}
