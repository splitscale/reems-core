package com.splitscale.reems.core.rentContract.delete;

import java.io.IOException;

import com.splitscale.reems.core.repositories.RentContractRepository;

public class DeleteRentContractInteractor {

  private RentContractRepository repository;

  public DeleteRentContractInteractor(RentContractRepository repository) {
    this.repository = repository;
  }

  public void deleteRentContract(String id) throws IOException {
    repository.delete(id);
  }
}
