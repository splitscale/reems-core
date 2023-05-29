package com.splitscale.reems.rentContract.delete;

import com.splitscale.reems.repositories.PropertyRepository;
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
