package com.splitscale.reems.core.history.delete;

import com.splitscale.reems.core.repositories.HistoryRepository;
import java.io.IOException;

public class DeleteHistoryInteractor {

  private HistoryRepository repository;

  public void deleteHistoryById(String id) throws IOException {
    repository.deleteById(id);
  }

  public void deleteAllHistory() throws IOException {
    repository.deleteAll();
  }
}
