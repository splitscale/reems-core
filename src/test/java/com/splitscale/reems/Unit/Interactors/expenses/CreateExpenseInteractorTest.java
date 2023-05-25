package com.splitscale.reems.Unit.Interactors.expenses;

import com.splitscale.reems.expenses.ExpenseRequest;
import com.splitscale.reems.expenses.create.CreateExpenseInteractor;
import com.splitscale.reems.repositories.ExpenseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class CreateExpenseInteractorTest {

    @Mock
    private ExpenseRepository mockRepository;

    private CreateExpenseInteractor createExpenseInteractor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        createExpenseInteractor = new CreateExpenseInteractor(mockRepository);
    }

    @Test
    void createExpense_ShouldReturnAddedExpense() throws IOException {
        ExpenseRequest expenseRequest = new ExpenseRequest(null);
        String expectedExpenseId = "213";
        when(mockRepository.add(expenseRequest)).thenReturn(expectedExpenseId);

        String actualExpenseId = createExpenseInteractor.createExpense(expenseRequest);

        assertEquals(expectedExpenseId, actualExpenseId);
        verify(mockRepository).add(expenseRequest);
    }
}
