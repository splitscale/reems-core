package com.splitscale.reems.expenses.read;

import com.splitscale.reems.expenses.Expense;
import com.splitscale.reems.repositories.ExpenseRepository;
import java.io.IOException;
import java.util.List;

public class ReadExpenseInteractor {

  ExpenseRepository repository;

  public ReadExpenseInteractor(ExpenseRepository repository) {
    this.repository = repository;
  }

  public List<Expense> getAllProperty() throws IOException {
    return repository.getAll();
  }

  public Expense getById(String id) throws IOException {
    return repository.getById(id);
  }
}
