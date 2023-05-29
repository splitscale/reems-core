package com.splitscale.reems.core.expenseStats.edit;

import java.io.IOException;

import com.splitscale.reems.core.expenseStats.ExpenseStats;
import com.splitscale.reems.core.repositories.ExpenseStatsRepository;

public class EditExpenseStatsInteractor {

  private ExpenseStatsRepository repository;

  public EditExpenseStatsInteractor(ExpenseStatsRepository repository) {
    this.repository = repository;
  }

  public void editExpense(ExpenseStats expenseStats) throws IOException {
    repository.update(expenseStats);
  }
}
