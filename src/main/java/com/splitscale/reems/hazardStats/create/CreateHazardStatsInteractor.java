package com.splitscale.reems.hazardStats.create;

import com.splitscale.reems.hazardStats.HazardStatsRequest;
import com.splitscale.reems.repositories.HazardStatsRepository;

import java.io.IOException;

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
