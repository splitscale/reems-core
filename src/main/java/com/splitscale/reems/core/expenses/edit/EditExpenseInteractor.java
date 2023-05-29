package com.splitscale.reems.core.expenses.edit;

import com.splitscale.reems.core.expenses.Expense;
import com.splitscale.reems.core.repositories.ExpenseRepository;
import java.io.IOException;

public class EditExpenseInteractor {

  private ExpenseRepository repository;

  public EditExpenseInteractor(ExpenseRepository repository) {
    this.repository = repository;
  }

  public void editExpense(Expense expense) throws IOException {
    repository.update(expense);
  }
}
