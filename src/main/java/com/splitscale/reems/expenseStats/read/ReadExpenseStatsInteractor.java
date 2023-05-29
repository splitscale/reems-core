package com.splitscale.reems.expenseStats.read;

import com.splitscale.reems.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.repositories.EnvironmentalHazardRepository;
import java.io.IOException;
import java.util.List;

public class ReadExpenseStatsInteractor {

    EnvironmentalHazardRepository repository;

    public ReadExpenseStatsInteractor(
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
