package com.splitscale.reems.core.energy.consumption.create;

import com.splitscale.reems.core.energy.consumption.EnergyConsumptionRequest;
import com.splitscale.reems.core.repositories.EnergyConsumptionRepository;
import java.io.IOException;

public class CreateEnergyConsumptionInteractor {

  private EnergyConsumptionRepository repository;

  public CreateEnergyConsumptionInteractor(
    EnergyConsumptionRepository repository
  ) {
    this.repository = repository;
  }

  public String createEnergyConsumption(
    EnergyConsumptionRequest energyConsumptionRequest
  ) throws IOException {
    return repository.add(energyConsumptionRequest);
  }
}
