package com.splitscale.reems.core.rentContract.create;

import java.io.IOException;

import com.splitscale.reems.core.rentContract.RentContractRequest;
import com.splitscale.reems.core.repositories.RentContractRepository;

public class CreateRentContractInteractor {
    private RentContractRepository repository;

    public CreateRentContractInteractor(RentContractRepository repository) {
        this.repository = repository;
    }

    public String createRentContract(RentContractRequest rentContractRequest)
            throws IOException {
        return repository.add(rentContractRequest);
    }
}
