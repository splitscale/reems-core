package com.splitscale.reems.rentContract.create;

import java.io.IOException;

import com.splitscale.reems.rentContract.RentContractRequest;
import com.splitscale.reems.repositories.RentContractRepository;

public class CreateRentContractInteractor {
    private RentContractRepository repository;

    public CreateRentContractInteractor(RentContractRepository repository) {
        this.repository = repository;
    }

    public String createProperty(RentContractRequest rentContractRequest)
            throws IOException {
        return repository.add(rentContractRequest);
    }
}
