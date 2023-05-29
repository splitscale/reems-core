package com.splitscale.reems.rentContract.read;

import com.splitscale.reems.rentContract.RentContract;
import com.splitscale.reems.repositories.RentContractRepository;

import java.io.IOException;
import java.util.List;

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
