package com.splitscale.reems.Unit.Interactors.expenseStats;

import com.splitscale.reems.expenseStats.ExpenseStats;
import com.splitscale.reems.expenseStats.read.ReadExpenseStatsInteractor;
import com.splitscale.reems.repositories.ExpenseStatsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ReadExpenseStatsInteractorTest {

    private ReadExpenseStatsInteractor interactor;
    private ExpenseStatsRepository repository;

    @BeforeEach
    void setUp() {
        repository = mock(ExpenseStatsRepository.class);
        interactor = new ReadExpenseStatsInteractor(repository);
    }

    @Test
    void testGetAllExpenseStats() throws IOException {
        // Arrange
        List<ExpenseStats> expectedStats = new ArrayList<>();
        expectedStats.add(new ExpenseStats("1", null, null, "Expense 1", null, null));
        expectedStats.add(new ExpenseStats("2", null, null, "Expense 2", null, null));

        when(repository.getAll()).thenReturn(expectedStats);

        // Act
        List<ExpenseStats> actualStats = interactor.getAllExpenseStats();

        // Assert
        assertEquals(expectedStats, actualStats);
        verify(repository, times(1)).getAll();
    }

    @Test
    void testGetAllExpenseStatsById() throws IOException {
        // Arrange
        String expectedId = "1";
        ExpenseStats expectedStats = new ExpenseStats(expectedId, null, null, "Expense 1", expectedId, expectedId);

        when(repository.getById(expectedId)).thenReturn(expectedStats);

        // Act
        ExpenseStats actualStats = interactor.getAllExpenseStatsbyId(expectedId);

        // Assert
        assertEquals(expectedStats, actualStats);
        verify(repository, times(1)).getById(expectedId);
    }
}
