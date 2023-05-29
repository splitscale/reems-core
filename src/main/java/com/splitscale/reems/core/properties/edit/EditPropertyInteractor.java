package com.splitscale.reems.core.properties.edit;

import com.splitscale.reems.core.properties.Property;
import com.splitscale.reems.core.repositories.PropertyRepository;
import java.io.IOException;

public class EditPropertyInteractor {

  private PropertyRepository repository;

  public EditPropertyInteractor(PropertyRepository repository) {
    this.repository = repository;
  }

  public void editProperty(Property property) throws IOException {
    repository.update(property);
  }
}
