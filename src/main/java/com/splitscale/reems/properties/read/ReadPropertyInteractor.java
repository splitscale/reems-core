package com.splitscale.reems.properties.read;

import com.splitscale.reems.properties.Property;
import com.splitscale.reems.repositories.PropertyRepository;
import java.io.IOException;
import java.util.List;

public class ReadPropertyInteractor {

  PropertyRepository repository;

  public ReadPropertyInteractor(PropertyRepository repository) {
    this.repository = repository;
  }

  public List<Property> getAllProperty() throws IOException {
    return repository.getAll();
  }

  public Property getById(String id) throws IOException {
    return repository.getById(id);
  }
}
