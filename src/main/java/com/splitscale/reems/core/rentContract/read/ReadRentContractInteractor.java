package com.splitscale.reems.core.rentContract.read;

import java.io.IOException;
import java.util.List;

import com.splitscale.reems.core.rentContract.RentContract;
import com.splitscale.reems.core.repositories.RentContractRepository;

public class ReadRentContractInteractor {

  RentContractRepository repository;

  public ReadRentContractInteractor(RentContractRepository repository) {
    this.repository = repository;
  }

  public List<RentContract> getAllRentContract() throws IOException {
    return repository.getAll();
  }

  public RentContract getById(String id) throws IOException {
    return repository.getById(id);
  }
}
