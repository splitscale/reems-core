package com.splitscale.reems.expenseStats.create;

import com.splitscale.reems.expenseStats.ExpenseStatsRequest;

import com.splitscale.reems.repositories.ExpenseStatsRepository;

import java.io.IOException;

public class CreateExpenseStatsInteractor {

    private ExpenseStatsRepository repository;

    public CreateExpenseStatsInteractor(ExpenseStatsRepository repository) {
        this.repository = repository;
    }

    public String createExpenseStats(ExpenseStatsRequest expenseStatsRequest)
            throws IOException {
        return repository.add(expenseStatsRequest);
    }
}
