package com.splitscale.reems.core.properties.create;

import com.splitscale.reems.core.properties.PropertyRequest;
import com.splitscale.reems.core.repositories.PropertyRepository;
import java.io.IOException;

public class CreatePropertyInteractor {

  private PropertyRepository repository;

  public CreatePropertyInteractor(PropertyRepository repository) {
    this.repository = repository;
  }

  public String createProperty(PropertyRequest propertyRequest)
    throws IOException {
    return repository.add(propertyRequest);
  }
}
