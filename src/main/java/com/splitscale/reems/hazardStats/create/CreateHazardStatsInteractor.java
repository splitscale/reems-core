package com.splitscale.reems.hazardStats.create;

import com.splitscale.reems.hazard.environment.EnvironmentalHazardRequest;
import com.splitscale.reems.repositories.EnvironmentalHazardRepository;
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
