package com.splitscale.reems.core.hazardStats.edit;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import java.io.IOException;

public class EditHazardStatsInteractor {

    private EnvironmentalHazardRepository repository;

    public EditHazardStatsInteractor(
            EnvironmentalHazardRepository repository) {
        this.repository = repository;
    }

    public void editEnvironmentalHazard(EnvironmentalHazard environmentalHazard)
            throws IOException {
        repository.update(environmentalHazard);
    }
}
