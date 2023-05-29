package com.splitscale.reems.core.expenseStats.read;

import com.splitscale.reems.core.expenseStats.ExpenseStats;
import com.splitscale.reems.core.repositories.ExpenseStatsRepository;

import java.io.IOException;
import java.util.List;

public class ReadExpenseStatsInteractor {

    ExpenseStatsRepository repository;

    public ReadExpenseStatsInteractor(
        ExpenseStatsRepository repository) {
        this.repository = repository;
    }

    public List<ExpenseStats> getAllExpenseStats() throws IOException {
        return repository.getAll();
    }

    public ExpenseStats getAllExpenseStatsbyId(String id) throws IOException {
        return repository.getById(id);
    }
}
