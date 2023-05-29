package com.splitscale.reems.core.repositories;

import java.io.IOException;
import java.util.List;

import com.splitscale.reems.core.rentContract.RentContract;
import com.splitscale.reems.core.rentContract.RentContractRequest;

public interface RentContractRepository {
    public List<RentContract> getAll() throws IOException;

    public RentContract getById(String id) throws IOException;

    public String add(RentContractRequest rentContractRequest) throws IOException;

    public void update(RentContract rentContract) throws IOException;

    public void delete(String id) throws IOException;
}
