package com.splitscale.reems.hazardStats.read;

import com.splitscale.reems.hazardStats.HazardStats;
import com.splitscale.reems.repositories.HazardStatsRepository;

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
