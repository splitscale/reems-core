package com.splitscale.reems.hazardStats.delete;

import com.splitscale.reems.repositories.EnvironmentalHazardRepository;
import java.io.IOException;

public class DeleteHazardStatsInteractor {

    private EnvironmentalHazardRepository repository;

    public DeleteHazardStatsInteractor(
            EnvironmentalHazardRepository repository) {
        this.repository = repository;
    }

    public void deleteEnvironmentalHazard(String id) throws IOException {
        repository.delete(id);
    }
}
