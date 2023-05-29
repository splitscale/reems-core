package com.splitscale.reems.core.history.create;

import java.io.IOException;

import com.splitscale.reems.core.history.HistoryRequest;
import com.splitscale.reems.core.repositories.HistoryRepository;

public class CreateHistoryInteractor {
  private HistoryRepository repository;

  public CreateHistoryInteractor(HistoryRepository repository) {
    this.repository = repository;
  }

  public String createHistory(HistoryRequest request) throws IOException {
    return repository.create(request);
  }
}
