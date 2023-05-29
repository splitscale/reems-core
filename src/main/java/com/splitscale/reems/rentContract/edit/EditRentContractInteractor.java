package com.splitscale.reems.rentContract.edit;

import com.splitscale.reems.properties.Property;
import com.splitscale.reems.repositories.PropertyRepository;
import java.io.IOException;

public class EditRentContractInteractor {

    private PropertyRepository repository;

    public EditRentContractInteractor(PropertyRepository repository) {
        this.repository = repository;
    }

    public void editProperty(Property property) throws IOException {
        repository.update(property);
    }
}
