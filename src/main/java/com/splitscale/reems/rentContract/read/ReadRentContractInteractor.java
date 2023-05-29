package com.splitscale.reems.rentContract.read;

import com.splitscale.reems.properties.Property;
import com.splitscale.reems.repositories.PropertyRepository;
import java.io.IOException;
import java.util.List;

public class ReadRentContractInteractor {

    PropertyRepository repository;

    public ReadRentContractInteractor(PropertyRepository repository) {
        this.repository = repository;
    }

    public List<Property> getAllProperty() throws IOException {
        return repository.getAll();
    }

    public Property getById(String id) throws IOException {
        return repository.getById(id);
    }
}
