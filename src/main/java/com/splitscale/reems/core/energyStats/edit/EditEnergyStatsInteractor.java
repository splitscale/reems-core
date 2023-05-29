package com.splitscale.reems.core.energyStats.edit;

import com.splitscale.reems.core.energyStats.EnergyStats;
import com.splitscale.reems.core.repositories.EnergyStatsRepository;
import java.io.IOException;

public class EditEnergyStatsInteractor {

    private EnergyStatsRepository repository;

    public EditEnergyStatsInteractor(
            EnergyStatsRepository repository) {
        this.repository = repository;
    }

    public void editEnvironmentalHazard(EnergyStats energyStats)
            throws IOException {
        repository.update(energyStats);
    }
}
