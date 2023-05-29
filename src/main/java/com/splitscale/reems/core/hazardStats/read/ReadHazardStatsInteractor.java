package com.splitscale.reems.core.hazardStats.read;

import com.splitscale.reems.core.hazardStats.HazardStats;
import com.splitscale.reems.core.repositories.HazardStatsRepository;

import java.io.IOException;
import java.util.List;

public class ReadHazardStatsInteractor {

  HazardStatsRepository repository;

  public List<HazardStats> getAllHazardStats() throws IOException {
    return repository.getAll();
  }

  public HazardStats getHazardStatsById(String id) throws IOException {
    return repository.getById(id);
  }
}
