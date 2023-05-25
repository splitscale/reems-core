package com.splitscale.reems.Unit.Interactors.expenses;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.splitscale.reems.expenses.delete.DeleteExpenseInteractor;
import com.splitscale.reems.repositories.ExpenseRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class DeleteExpenseInteractorTest {
  @Mock
  private ExpenseRepository repository;

  @InjectMocks
  private DeleteExpenseInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void deleteExpense_shouldCallDeleteByIdMethod() throws IOException {
    String expenseId = "213";

    interactor.deleteExpense(expenseId);

    verify(repository, times(1)).deleteById(expenseId);
  }

  @Test
  void deleteAllExpense_shouldCallDeleteAllMethod() throws IOException {
    interactor.deleteAllExpense();

    verify(repository, times(1)).deleteAll();
  }
}
