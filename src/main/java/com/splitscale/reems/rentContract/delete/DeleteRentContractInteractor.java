package com.splitscale.reems.rentContract.delete;

import com.splitscale.reems.repositories.RentContractRepository;

import java.io.IOException;

public class DeleteRentContractInteractor {

  private RentContractRepository repository;

  public DeleteRentContractInteractor(RentContractRepository repository) {
    this.repository = repository;
  }

  public void deleteRentContract(String id) throws IOException {
    repository.delete(id);
  }
}
