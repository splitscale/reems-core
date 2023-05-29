package com.splitscale.reems.core.expenseStats.edit;

import com.splitscale.reems.core.expenses.Expense;
import com.splitscale.reems.core.repositories.ExpenseRepository;
import java.io.IOException;

public class EditExpenseStatsInteractor {

    private ExpenseRepository repository;

    public EditExpenseStatsInteractor(ExpenseRepository repository) {
        this.repository = repository;
    }

    public void editExpense(Expense expense) throws IOException {
        repository.update(expense);
    }
}
