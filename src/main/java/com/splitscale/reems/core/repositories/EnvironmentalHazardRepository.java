package com.splitscale.reems.core.repositories;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.core.hazard.environment.EnvironmentalHazardRequest;

import java.io.IOException;
import java.util.List;

public interface EnvironmentalHazardRepository {
  public List<EnvironmentalHazard> getAll() throws IOException;

  public EnvironmentalHazard getById(String id) throws IOException;

  public String add(EnvironmentalHazardRequest environmentalHazardRequest) throws IOException;

  public void update(EnvironmentalHazard environmentalHazard)
    throws IOException;

  public void delete(String id) throws IOException;
}
