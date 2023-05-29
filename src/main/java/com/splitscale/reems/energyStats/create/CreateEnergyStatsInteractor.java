package com.splitscale.reems.energyStats.create;

import com.splitscale.reems.energyStats.EnergyStatsRequest;
import com.splitscale.reems.repositories.EnergyStatsRepository;
import java.io.IOException;

public class CreateEnergyStatsInteractor {

    private EnergyStatsRepository repository;

    public CreateEnergyStatsInteractor(EnergyStatsRepository repository) {
        this.repository = repository;
    }

    public String createExpense(EnergyStatsRequest energyStatsRquest)
            throws IOException {
        return repository.add(energyStatsRquest);
    }
}
