package com.splitscale.reems.core.energyStats.create;

import com.splitscale.reems.core.energyStats.EnergyStatsRequest;
import com.splitscale.reems.core.repositories.EnergyStatsRepository;
import java.io.IOException;

public class CreateEnergyStatsInteractor {

    private EnergyStatsRepository repository;

    public CreateEnergyStatsInteractor(EnergyStatsRepository repository) {
        this.repository = repository;
    }

    public String createEnergyStats(EnergyStatsRequest energyStatsRequest)
            throws IOException {
        return repository.add(energyStatsRequest);
    }
}
