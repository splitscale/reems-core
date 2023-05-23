package com.splitscale.reems.history.edit;

import com.splitscale.reems.history.History;
import com.splitscale.reems.repositories.HistoryRepository;
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
