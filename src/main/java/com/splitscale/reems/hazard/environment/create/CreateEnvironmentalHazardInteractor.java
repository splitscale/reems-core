package com.splitscale.reems.hazard.environment.create;

import com.splitscale.reems.hazard.environment.EnvironmentalHazardRequest;
import com.splitscale.reems.repositories.EnvironmentalHazardRepository;
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
