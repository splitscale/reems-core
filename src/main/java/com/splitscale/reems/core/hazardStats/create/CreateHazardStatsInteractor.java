package com.splitscale.reems.core.hazardStats.create;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazardRequest;
import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import java.io.IOException;

public class CreateHazardStatsInteractor {

    private EnvironmentalHazardRepository repository;

    public CreateHazardStatsInteractor(
            EnvironmentalHazardRepository repository) {
        this.repository = repository;
    }

    public String createEnvironmentalHazard(
            EnvironmentalHazardRequest environmentalHazardRequest) throws IOException {
        return repository.add(environmentalHazardRequest);
    }
}
