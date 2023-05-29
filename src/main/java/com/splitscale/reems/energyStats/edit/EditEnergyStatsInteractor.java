package com.splitscale.reems.energyStats.edit;

import com.splitscale.reems.energyStats.EnergyStats;
import com.splitscale.reems.repositories.EnergyStatsRepository;
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
