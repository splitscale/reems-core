package com.splitscale.reems.core.expenseStats.create;

import com.splitscale.reems.core.expenseStats.ExpenseStatsRequest;
import com.splitscale.reems.core.repositories.ExpenseStatsRepository;

import java.io.IOException;

public class CreateExpenseStatsInteractor {

  private ExpenseStatsRepository repository;

  public CreateExpenseStatsInteractor(ExpenseStatsRepository repository) {
    this.repository = repository;
  }

  public String createExpenseStats(ExpenseStatsRequest expenseStatsRequest)
      throws IOException {
    return repository.add(expenseStatsRequest);
  }
}
