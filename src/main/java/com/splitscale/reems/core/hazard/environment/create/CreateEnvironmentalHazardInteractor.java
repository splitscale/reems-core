package com.splitscale.reems.core.hazard.environment.create;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazardRequest;
import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import java.io.IOException;

public class CreateEnvironmentalHazardInteractor {

  private EnvironmentalHazardRepository repository;

  public CreateEnvironmentalHazardInteractor(
    EnvironmentalHazardRepository repository
  ) {
    this.repository = repository;
  }

  public String createEnvironmentalHazard(
    EnvironmentalHazardRequest environmentalHazardRequest
  ) throws IOException {
    return repository.add(environmentalHazardRequest);
  }
}
