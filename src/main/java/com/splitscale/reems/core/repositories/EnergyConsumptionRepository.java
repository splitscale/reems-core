package com.splitscale.reems.core.repositories;

import java.io.IOException;
import java.util.List;

import com.splitscale.reems.core.energy.consumption.EnergyConsumption;
import com.splitscale.reems.core.energy.consumption.EnergyConsumptionRequest;

public interface EnergyConsumptionRepository {
  public List<EnergyConsumption> getAll() throws IOException;

  public EnergyConsumption getById(String id) throws IOException;

  public String add(EnergyConsumptionRequest energyConsumptionRequest) throws IOException;

  public void update(EnergyConsumption energyConsumption) throws IOException;

  public void delete(String id) throws IOException;
}
