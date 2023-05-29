package com.splitscale.reems.expenseStats.edit;

import com.splitscale.reems.expenseStats.ExpenseStats;
import com.splitscale.reems.repositories.ExpenseStatsRepository;

import java.io.IOException;

public class EditExpenseStatsInteractor {

    private ExpenseStatsRepository repository;

    public EditExpenseStatsInteractor(ExpenseStatsRepository repository) {
        this.repository = repository;
    }

    public void editExpense(ExpenseStats expenseStats) throws IOException {
        repository.update(expenseStats);
    }
}
