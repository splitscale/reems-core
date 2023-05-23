package com.splitscale.reems.expenses.edit;

import com.splitscale.reems.expenses.Expense;
import com.splitscale.reems.repositories.ExpenseRepository;
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
