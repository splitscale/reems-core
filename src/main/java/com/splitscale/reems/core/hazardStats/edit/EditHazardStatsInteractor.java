package com.splitscale.reems.core.hazardStats.edit;

import java.io.IOException;

import com.splitscale.reems.core.hazardStats.HazardStats;
import com.splitscale.reems.core.repositories.HazardStatsRepository;

public class EditHazardStatsInteractor {

  private HazardStatsRepository repository;

  public EditHazardStatsInteractor(HazardStatsRepository repository) {
    this.repository = repository;
  }

  public void EditHazardStats(HazardStats hazardStats)
      throws IOException {
    repository.update(hazardStats);
  }
}
