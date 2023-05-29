package com.splitscale.reems.rentContract.edit;

import com.splitscale.reems.rentContract.RentContract;
import com.splitscale.reems.repositories.RentContractRepository;

import java.io.IOException;

public class EditRentContractInteractor {

    private RentContractRepository repository;

    public EditRentContractInteractor(RentContractRepository repository) {
        this.repository = repository;
    }

    public void editRentContract(RentContract rentContract) throws IOException {
        repository.update(rentContract);
    }
}
