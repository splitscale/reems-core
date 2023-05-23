package com.splitscale.reems.properties.create;

import com.splitscale.reems.properties.PropertyRequest;
import com.splitscale.reems.repositories.PropertyRepository;
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
