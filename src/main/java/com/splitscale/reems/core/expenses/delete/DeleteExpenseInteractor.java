package com.splitscale.reems.core.expenses.delete;

import com.splitscale.reems.core.repositories.ExpenseRepository;
import java.io.IOException;

public class DeleteExpenseInteractor {

  private ExpenseRepository repository;

  public void deleteExpense(String id) throws IOException {
    repository.deleteById(id);
  }

  public void deleteAllExpense() throws IOException {
    repository.deleteAll();
  }
}
