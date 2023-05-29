package com.splitscale.reems.hazardStats.read;

import com.splitscale.reems.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.repositories.EnvironmentalHazardRepository;
import java.io.IOException;
import java.util.List;

public class ReadHazardStatsInteractor {

    EnvironmentalHazardRepository repository;

    public ReadHazardStatsInteractor(
            EnvironmentalHazardRepository repository) {
        this.repository = repository;
    }

    public List<EnvironmentalHazard> getAllEnvironmentalHazard() throws IOException {
        return repository.getAll();
    }

    public EnvironmentalHazard getEnvironmentalHazardById(String id) throws IOException {
        return repository.getById(id);
    }
}
