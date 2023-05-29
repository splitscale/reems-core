package com.splitscale.reems.core.Unit.Interactors.expenseStats;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.splitscale.reems.core.expenseStats.create.CreateExpenseStatsInteractor;
import com.splitscale.reems.core.expenses.ExpenseRequest;
import com.splitscale.reems.core.repositories.ExpenseRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreateExpenseStatsInteractorTest {

    private CreateExpenseStatsInteractor interactor;
    private ExpenseRepository repository;

    @BeforeEach
    public void setUp() {
        repository = mock(ExpenseRepository.class);
        interactor = new CreateExpenseStatsInteractor(repository);
    }

    @Test
    public void testCreateExpense() throws IOException {
        // Arrange
        ExpenseRequest expenseRequest = new ExpenseRequest(/* provide necessary parameters */);
        String expectedExpenseId = "12345";
        when(repository.add(expenseRequest)).thenReturn(expectedExpenseId);

        // Act
        String actualExpenseId = interactor.createExpense(expenseRequest);

        // Assert
        assertEquals(expectedExpenseId, actualExpenseId);
        verify(repository).add(expenseRequest);
    }
}
