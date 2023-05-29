package com.splitscale.reems.core.properties.delete;

import com.splitscale.reems.core.repositories.PropertyRepository;
import java.io.IOException;

public class DeletePropertyInteractor {

  private PropertyRepository repository;

  public DeletePropertyInteractor(PropertyRepository repository) {
    this.repository = repository;
  }

  public void deleteProperty(String id) throws IOException {
    repository.delete(id);
  }
}
