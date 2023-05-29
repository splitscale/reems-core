package com.splitscale.reems.core.energyStats.read;

import com.splitscale.reems.core.energyStats.EnergyStats;
import com.splitscale.reems.core.repositories.EnergyStatsRepository;
import java.io.IOException;
import java.util.List;

public class ReadEnergyStatsInteractor {

    EnergyStatsRepository repository;

    public ReadEnergyStatsInteractor(
            EnergyStatsRepository repository) {
        this.repository = repository;
    }

    public List<EnergyStats> getAllEnergyStats() throws IOException {
        return repository.getAll();
    }

    public EnergyStats getAllEnergyStats(String id) throws IOException {
        return repository.getById(id);
    }
}
