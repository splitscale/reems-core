package com.splitscale.reems.core.Unit.Interactors.expenseStats;

import com.splitscale.reems.core.expenseStats.ExpenseStats;
import com.splitscale.reems.core.expenseStats.edit.EditExpenseStatsInteractor;
import com.splitscale.reems.core.expenses.Expense;
import com.splitscale.reems.core.repositories.ExpenseRepository;
import com.splitscale.reems.core.repositories.ExpenseStatsRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EditExpenseStatsInteractorTest {

  @Mock
  private ExpenseStatsRepository mockRepository;

  private EditExpenseStatsInteractor interactor;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
    interactor = new EditExpenseStatsInteractor(mockRepository);
  }

  @Test
  public void editExpense_Success() throws IOException {
    ExpenseStats expense = new ExpenseStats();

    interactor.editExpense(expense);

    Mockito.verify(mockRepository).update(expense);
  }

  @Test
  public void editExpense_ExceptionThrown() throws IOException {
    ExpenseStats expense = new ExpenseStats();
    IOException exception = new IOException("Update failed.");

    Mockito.doThrow(exception).when(mockRepository).update(expense);

    assertThrows(IOException.class, () -> interactor.editExpense(expense));
  }
}
