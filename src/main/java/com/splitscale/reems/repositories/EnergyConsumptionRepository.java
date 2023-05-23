package com.splitscale.reems.repositories;

import com.splitscale.reems.energy.consumption.EnergyConsumption;
import com.splitscale.reems.energy.consumption.EnergyConsumptionRequest;

import java.io.IOException;
import java.util.List;

public interface EnergyConsumptionRepository {
  public List<EnergyConsumption> getAll() throws IOException;

  public EnergyConsumption getById(String id) throws IOException;

  public String add(EnergyConsumptionRequest energyConsumptionRequest) throws IOException;

  public void update(EnergyConsumption energyConsumption) throws IOException;

  public void delete(String id) throws IOException;
}
