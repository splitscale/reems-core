package com.splitscale.reems.properties.delete;

import com.splitscale.reems.repositories.PropertyRepository;
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
