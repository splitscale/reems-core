package com.splitscale.reems.energy.consumption.delete;

import com.splitscale.reems.repositories.EnergyConsumptionRepository;
import java.io.IOException;

public class DeleteEnergyConsumptionInteractor {

  private EnergyConsumptionRepository repository;

  public DeleteEnergyConsumptionInteractor(
    EnergyConsumptionRepository repository
  ) {
    this.repository = repository;
  }

  public void DeleteEnergyConsumption(String id) throws IOException {
    repository.delete(id);
  }
}
