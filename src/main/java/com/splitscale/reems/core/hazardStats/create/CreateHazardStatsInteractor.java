package com.splitscale.reems.core.hazardStats.create;

import java.io.IOException;

import com.splitscale.reems.core.hazardStats.HazardStatsRequest;
import com.splitscale.reems.core.repositories.HazardStatsRepository;

public class CreateHazardStatsInteractor {
  private HazardStatsRepository repository;

  public CreateHazardStatsInteractor(HazardStatsRepository repository) {
    this.repository = repository;
  }

  public String createHazardStats(
      HazardStatsRequest hazardStatsRequest) throws IOException {
    return repository.add(hazardStatsRequest);
  }
}
