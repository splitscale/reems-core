package com.splitscale.reems.hazardStats.edit;

import com.splitscale.reems.hazardStats.HazardStats;
import com.splitscale.reems.repositories.HazardStatsRepository;

import java.io.IOException;

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
