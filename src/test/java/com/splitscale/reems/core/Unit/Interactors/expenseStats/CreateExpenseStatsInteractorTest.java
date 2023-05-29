package com.splitscale.reems.core.Unit.Interactors.expenseStats;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.splitscale.reems.core.expenseStats.ExpenseStatsRequest;
import com.splitscale.reems.core.expenseStats.create.CreateExpenseStatsInteractor;
import com.splitscale.reems.core.expenses.ExpenseRequest;
import com.splitscale.reems.core.repositories.ExpenseRepository;
import com.splitscale.reems.core.repositories.ExpenseStatsRepository;

import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CreateExpenseStatsInteractorTest {

  @Mock
  private CreateExpenseStatsInteractor interactor;

  @Mock
  private ExpenseStatsRepository repository;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
    interactor = new CreateExpenseStatsInteractor(repository);
  }

  @Test
  public void testCreateExpense() throws IOException {
    // Arrange
    ExpenseStatsRequest expenseRequest = new ExpenseStatsRequest(/* provide necessary parameters */);
    String expectedExpenseId = "12345";
    when(repository.add(expenseRequest)).thenReturn(expectedExpenseId);

    // Act
    String actualExpenseId = interactor.createExpenseStats(expenseRequest);

    // Assert
    assertEquals(expectedExpenseId, actualExpenseId);
    verify(repository).add(expenseRequest);
  }
}
