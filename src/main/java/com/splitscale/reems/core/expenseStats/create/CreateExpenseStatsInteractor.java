package com.splitscale.reems.core.expenseStats.create;

import com.splitscale.reems.core.expenses.ExpenseRequest;
import com.splitscale.reems.core.repositories.ExpenseRepository;
import java.io.IOException;

public class CreateExpenseStatsInteractor {

    private ExpenseRepository repository;

    public CreateExpenseStatsInteractor(ExpenseRepository repository) {
        this.repository = repository;
    }

    public String createExpense(ExpenseRequest expenseRequest)
            throws IOException {
        return repository.add(expenseRequest);
    }
}
