package com.splitscale.reems.core.expenseStats.delete;

import com.splitscale.reems.core.repositories.ExpenseStatsRepository;

import java.io.IOException;

public class DeleteExpenseStatsInteractor {
    private ExpenseStatsRepository repository;

    public DeleteExpenseStatsInteractor(
            ExpenseStatsRepository repository) {
        this.repository = repository;
    }

    public void deleteExpenseStats(String id) throws IOException {
        repository.deleteById(id);
    }
}
