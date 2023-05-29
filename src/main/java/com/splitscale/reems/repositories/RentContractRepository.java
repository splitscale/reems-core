package com.splitscale.reems.repositories;

import java.io.IOException;
import java.util.List;

import com.splitscale.reems.rentContract.RentContract;
import com.splitscale.reems.rentContract.RentContractRequest;

public interface RentContractRepository {
    public List<RentContract> getAll() throws IOException;

    public RentContract getById(String id) throws IOException;

    public String add(RentContractRequest rentContractRequest) throws IOException;

    public void update(RentContract rentContract) throws IOException;

    public void delete(String id) throws IOException;
}
