package com.splitscale.reems.expenseStats.create;

import com.splitscale.reems.expenses.ExpenseRequest;
import com.splitscale.reems.repositories.ExpenseRepository;
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
