package com.splitscale.reems.core.Unit.Interactors.expenses;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.splitscale.reems.core.expenses.Expense;
import com.splitscale.reems.core.expenses.edit.EditExpenseInteractor;
import com.splitscale.reems.core.repositories.ExpenseRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class EditExpenseInteractorTest {
  @Mock
  private ExpenseRepository repository;

  @InjectMocks
  private EditExpenseInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void editExpense_shouldCallUpdateMethod() throws IOException {
    Expense expense = new Expense(null, null, null, null, null);
    expense.setId("213");

    interactor.editExpense(expense);

    verify(repository, times(1)).update(expense);
  }
}
