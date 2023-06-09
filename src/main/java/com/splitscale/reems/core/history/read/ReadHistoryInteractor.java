package com.splitscale.reems.core.history.read;

import com.splitscale.reems.core.history.History;
import com.splitscale.reems.core.repositories.HistoryRepository;
import java.io.IOException;
import java.util.List;

public class ReadHistoryInteractor {

  private HistoryRepository repository;

  public ReadHistoryInteractor(HistoryRepository repository) {
    this.repository = repository;
  }

  public List<History> getAllHistory() throws IOException {
    return repository.getAll();
  }

  public History getById(String id) throws IOException {
    return repository.getById(id);
  }
}
