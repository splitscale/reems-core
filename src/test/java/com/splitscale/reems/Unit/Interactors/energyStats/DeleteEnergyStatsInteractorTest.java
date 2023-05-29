package com.splitscale.reems.Unit.Interactors.energyStats;

import com.splitscale.reems.energyStats.delete.DeleteEnergyStatsInteractor;
import com.splitscale.reems.repositories.EnergyStatsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeleteEnergyStatsInteractorTest {

    private DeleteEnergyStatsInteractor deleteEnergyStatsInteractor;

    @Mock
    private EnergyStatsRepository repository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        deleteEnergyStatsInteractor = new DeleteEnergyStatsInteractor(repository);
    }

    @Test
    public void testDeleteEnergyStats() throws IOException {
        String id = "12345";

        // Perform the delete operation
        deleteEnergyStatsInteractor.deleteEnergyStats(id);

        // Verify that the deleteById method was called with the correct ID
        Mockito.verify(repository).deleteById(id);
    }

    @Test
    public void testDeleteEnergyStats_withIOException() throws IOException {
        String id = "12345";

        // Mock the repository to throw an IOException when deleteById is called
        Mockito.doThrow(IOException.class).when(repository).deleteById(id);

        // Verify that an IOException is thrown when deleteEnergyStats is called
        assertThrows(IOException.class, () -> deleteEnergyStatsInteractor.deleteEnergyStats(id));
    }
}
