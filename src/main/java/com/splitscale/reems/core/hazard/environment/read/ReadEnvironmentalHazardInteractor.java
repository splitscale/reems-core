package com.splitscale.reems.core.hazard.environment.read;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import java.io.IOException;
import java.util.List;

public class ReadEnvironmentalHazardInteractor {

  EnvironmentalHazardRepository repository;

  public ReadEnvironmentalHazardInteractor(
    EnvironmentalHazardRepository repository
  ) {
    this.repository = repository;
  }

  public List<EnvironmentalHazard> getAllEnvironmentalHazard() throws IOException {
    return repository.getAll();
  }

  public EnvironmentalHazard getEnvironmentalHazardById(String id) throws IOException {
    return repository.getById(id);
  }
}
