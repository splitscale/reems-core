package com.splitscale.reems.hazardStats.delete;

import com.splitscale.reems.repositories.HazardStatsRepository;

import java.io.IOException;

public class DeleteHazardStatsInteractor {

    private HazardStatsRepository repository;

    public DeleteHazardStatsInteractor(HazardStatsRepository repository) {
        this.repository = repository;
    }

    public void deleteHazardStats(String id) throws IOException {
        repository.deleteById(id);
    }
}
