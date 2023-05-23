package com.splitscale.reems.hazard.environment.edit;

import com.splitscale.reems.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.repositories.EnvironmentalHazardRepository;
import java.io.IOException;

public class EditEnvironmentalHazardInteractor {

  private EnvironmentalHazardRepository repository;

  public EditEnvironmentalHazardInteractor(
    EnvironmentalHazardRepository repository
  ) {
    this.repository = repository;
  }

  public void editEnvironmentalHazard(EnvironmentalHazard environmentalHazard)
    throws IOException {
    repository.update(environmentalHazard);
  }
}
