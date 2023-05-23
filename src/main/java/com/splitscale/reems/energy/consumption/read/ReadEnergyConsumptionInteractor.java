package com.splitscale.reems.energy.consumption.read;

import com.splitscale.reems.energy.consumption.EnergyConsumption;
import com.splitscale.reems.repositories.EnergyConsumptionRepository;
import java.io.IOException;
import java.util.List;

public class ReadEnergyConsumptionInteractor {

  EnergyConsumptionRepository repository;

  public ReadEnergyConsumptionInteractor(
    EnergyConsumptionRepository repository
  ) {
    this.repository = repository;
  }

  public List<EnergyConsumption> getAllEnergyConsumption() throws IOException {
    return repository.getAll();
  }

  public EnergyConsumption getEnergyConsumptionById(String id)
    throws IOException {
    return repository.getById(id);
  }
}
