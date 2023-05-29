package com.splitscale.reems.core.Unit.Interactors.energyStats;

import com.splitscale.reems.core.expenseStats.create.CreateExpenseStatsInteractor;
import com.splitscale.reems.core.expenses.ExpenseRequest;
import com.splitscale.reems.core.repositories.ExpenseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CreateEnergyStatsInteractorTest {

    @Mock
    private ExpenseRepository mockRepository;

    private CreateExpenseStatsInteractor interactor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        interactor = new CreateExpenseStatsInteractor(mockRepository);
    }

    @Test
    public void testCreateExpense() throws IOException {
        // Mock repository behavior
        ExpenseRequest expenseRequest = new ExpenseRequest(/* provide necessary data */);
        String expectedId = "12345";
        when(mockRepository.add(any(ExpenseRequest.class))).thenReturn(expectedId);

        // Perform the test
        String result = interactor.createExpense(expenseRequest);

        // Verify the repository method was called with the correct arguments
        Mockito.verify(mockRepository).add(expenseRequest);

        // Verify the result
        assertEquals(expectedId, result);
    }
}
