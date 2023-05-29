package com.splitscale.reems.core.repositories;

import com.splitscale.reems.core.expenses.Expense;
import com.splitscale.reems.core.expenses.ExpenseRequest;

import java.io.IOException;
import java.util.List;

public interface ExpenseRepository {
  public List<Expense> getAll() throws IOException;

  public Expense getById(String id) throws IOException;

  public String add(ExpenseRequest expenseRequest) throws IOException;

  public void update(Expense history) throws IOException;

  public void deleteById(String id) throws IOException;

  public void deleteAll() throws IOException;
}
