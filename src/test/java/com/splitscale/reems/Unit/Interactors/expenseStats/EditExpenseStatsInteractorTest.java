package com.splitscale.reems.Unit.Interactors.expenseStats;

import com.splitscale.reems.expenseStats.edit.EditExpenseStatsInteractor;
import com.splitscale.reems.expenses.Expense;
import com.splitscale.reems.repositories.ExpenseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EditExpenseStatsInteractorTest {

    @Mock
    private ExpenseRepository mockRepository;
    private EditExpenseStatsInteractor interactor;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        interactor = new EditExpenseStatsInteractor(mockRepository);
    }

    @Test
    public void editExpense_Success() throws IOException {
        Expense expense = new Expense(/* initialize with necessary values */);

        interactor.editExpense(expense);

        Mockito.verify(mockRepository).update(expense);
    }

    @Test
    public void editExpense_ExceptionThrown() throws IOException {
        Expense expense = new Expense(/* initialize with necessary values */);
        IOException exception = new IOException("Update failed.");

        Mockito.doThrow(exception).when(mockRepository).update(expense);

        assertThrows(IOException.class, () -> interactor.editExpense(expense));
    }
}
