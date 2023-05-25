package com.splitscale.reems.Unit.Interactors.expenses;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.splitscale.reems.expenses.Expense;
import com.splitscale.reems.expenses.read.ReadExpenseInteractor;
import com.splitscale.reems.repositories.ExpenseRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class ReadExpenseInteractorTest {
  @Mock
  private ExpenseRepository repository;

  @InjectMocks
  private ReadExpenseInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void getAllProperty_shouldReturnListOfExpenses() throws IOException {
    List<Expense> expectedExpenses = new ArrayList<>();
    expectedExpenses.add(new Expense("215", "Expense 1", null, null));
    expectedExpenses.add(new Expense("216", "Expense 2", null, null));

    when(repository.getAll()).thenReturn(expectedExpenses);

    List<Expense> actualExpenses = interactor.getAllProperty();

    assertEquals(expectedExpenses, actualExpenses);
  }

  @Test
  void getById_shouldReturnExpenseWithMatchingId() throws IOException {
    String expenseId = "214";
    Expense expectedExpense = new Expense(expenseId, "New Expense", null, null);

    when(repository.getById(expenseId)).thenReturn(expectedExpense);

    Expense actualExpense = interactor.getById(expenseId);

    assertEquals(expectedExpense, actualExpense);
  }
}
