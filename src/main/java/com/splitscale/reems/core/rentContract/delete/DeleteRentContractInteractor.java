package com.splitscale.reems.core.rentContract.delete;

import com.splitscale.reems.core.repositories.PropertyRepository;
import java.io.IOException;

public class DeleteRentContractInteractor {

  private PropertyRepository repository;

  public DeleteRentContractInteractor(PropertyRepository repository) {
    this.repository = repository;
  }

  public void deleteProperty(String id) throws IOException {
    repository.delete(id);
  }
}
