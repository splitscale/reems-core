package com.splitscale.reems.core.expenses.create;

import com.splitscale.reems.core.expenses.ExpenseRequest;
import com.splitscale.reems.core.repositories.ExpenseRepository;
import java.io.IOException;

public class CreateExpenseInteractor {

  private ExpenseRepository repository;

  public CreateExpenseInteractor(ExpenseRepository repository) {
    this.repository = repository;
  }

  public String createExpense(ExpenseRequest expenseRequest)
    throws IOException {
    return repository.add(expenseRequest);
  }
}
