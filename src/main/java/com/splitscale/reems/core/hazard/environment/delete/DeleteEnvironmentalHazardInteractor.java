package com.splitscale.reems.core.hazard.environment.delete;

import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import java.io.IOException;

public class DeleteEnvironmentalHazardInteractor {

  private EnvironmentalHazardRepository repository;

  public DeleteEnvironmentalHazardInteractor(
    EnvironmentalHazardRepository repository
  ) {
    this.repository = repository;
  }

  public void deleteEnvironmentalHazard(String id) throws IOException {
    repository.delete(id);
  }
}
