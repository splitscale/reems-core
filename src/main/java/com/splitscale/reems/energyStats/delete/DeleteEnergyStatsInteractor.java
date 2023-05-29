package com.splitscale.reems.energyStats.delete;

import com.splitscale.reems.repositories.EnergyStatsRepository;
import java.io.IOException;

public class DeleteEnergyStatsInteractor {

    private EnergyStatsRepository repository;

    public DeleteEnergyStatsInteractor(
            EnergyStatsRepository repository) {
        this.repository = repository;
    }

    public void deleteEnergyStats(String id) throws IOException {
        repository.deleteById(id);
    }
}
