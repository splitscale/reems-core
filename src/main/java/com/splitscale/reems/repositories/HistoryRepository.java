package com.splitscale.reems.repositories;

import com.splitscale.reems.history.History;
import com.splitscale.reems.history.HistoryRequest;

import java.io.IOException;
import java.util.List;

public interface HistoryRepository {
  public String create(HistoryRequest request) throws IOException;

  public List<History> getAll() throws IOException;

  public History getById(String id) throws IOException;

  public void update(History history) throws IOException;

  public void deleteById(String id) throws IOException;

  public void deleteAll() throws IOException;
}
