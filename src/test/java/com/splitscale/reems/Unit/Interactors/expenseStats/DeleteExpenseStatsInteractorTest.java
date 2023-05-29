package com.splitscale.reems.Unit.Interactors.expenseStats;

import com.splitscale.reems.expenseStats.delete.DeleteExpenseStatsInteractor;
import com.splitscale.reems.repositories.ExpenseStatsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class DeleteExpenseStatsInteractorTest {

    @Mock
    private ExpenseStatsRepository repository;

    private DeleteExpenseStatsInteractor interactor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        interactor = new DeleteExpenseStatsInteractor(repository);
    }

    @Test
    public void testDeleteExpenseStats() throws IOException {
        String id = "123";

        // Perform the delete operation
        interactor.deleteExpenseStats(id);

        // Verify that the deleteById method of the repository was called with the
        // correct id
        verify(repository, times(1)).deleteById(id);
    }
}
