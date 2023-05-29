package com.splitscale.reems.core.Unit.Interactors.expenses;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.splitscale.reems.core.expenses.Expense;
import com.splitscale.reems.core.expenses.read.ReadExpenseInteractor;
import com.splitscale.reems.core.repositories.ExpenseRepository;
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
    expectedExpenses.add(new Expense());
    expectedExpenses.add(new Expense());

    when(repository.getAll()).thenReturn(expectedExpenses);

    List<Expense> actualExpenses = interactor.getAllExpense();

    assertEquals(expectedExpenses, actualExpenses);
  }

  @Test
  void getById_shouldReturnExpenseWithMatchingId() throws IOException {
    String expenseId = "214";
    Expense expectedExpense = new Expense();

    when(repository.getById(expenseId)).thenReturn(expectedExpense);

    Expense actualExpense = interactor.getExpenseById(expenseId);

    assertEquals(expectedExpense, actualExpense);
  }
}
