package com.splitscale.reems.core.rentContract.edit;

import java.io.IOException;

import com.splitscale.reems.core.rentContract.RentContract;
import com.splitscale.reems.core.repositories.RentContractRepository;

public class EditRentContractInteractor {

  private RentContractRepository repository;

  public EditRentContractInteractor(RentContractRepository repository) {
    this.repository = repository;
  }

  public void editRentContract(RentContract rentContract) throws IOException {
    repository.update(rentContract);
  }
}
