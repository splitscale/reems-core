package com.splitscale.reems.expenseStats.edit;

import com.splitscale.reems.expenses.Expense;
import com.splitscale.reems.repositories.ExpenseRepository;
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
