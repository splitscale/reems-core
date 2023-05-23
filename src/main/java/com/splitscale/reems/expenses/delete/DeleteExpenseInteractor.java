package com.splitscale.reems.expenses.delete;

import com.splitscale.reems.repositories.ExpenseRepository;
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
