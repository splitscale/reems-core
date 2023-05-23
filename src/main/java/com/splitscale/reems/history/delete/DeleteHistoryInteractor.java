package com.splitscale.reems.history.delete;

import com.splitscale.reems.repositories.HistoryRepository;
import java.io.IOException;

public class DeleteHistoryInteractor {

  private HistoryRepository repository;

  public void deleteHistory(String id) throws IOException {
    repository.deleteById(id);
  }

  public void deleteAllHistory() throws IOException {
    repository.deleteAll();
  }
}
