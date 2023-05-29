package com.splitscale.reems.core.energy.consumption.edit;

import com.splitscale.reems.core.energy.consumption.EnergyConsumption;
import com.splitscale.reems.core.repositories.EnergyConsumptionRepository;
import java.io.IOException;

public class EditEnergyConsumptionInteractor {

  private EnergyConsumptionRepository repository;

  public EditEnergyConsumptionInteractor(
    EnergyConsumptionRepository repository
  ) {
    this.repository = repository;
  }

  public void editEnergyConsumption(EnergyConsumption energyConsumption)
    throws IOException {
    repository.update(energyConsumption);
  }
}
