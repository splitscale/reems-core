package com.splitscale.reems.Unit.Interactors.energyStats;

import com.splitscale.reems.energyStats.EnergyStats;
import com.splitscale.reems.energyStats.read.ReadEnergyStatsInteractor;
import com.splitscale.reems.repositories.EnergyStatsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ReadEnergyStatsInteractorTest {

    private EnergyStatsRepository repository;
    private ReadEnergyStatsInteractor interactor;

    @BeforeEach
    public void setUp() {
        repository = mock(EnergyStatsRepository.class);
        interactor = new ReadEnergyStatsInteractor(repository);
    }

    @Test
    public void testGetAllEnergyStats() throws IOException {
        // Arrange
        List<EnergyStats> expectedStats = new ArrayList<>();
        when(repository.getAll()).thenReturn(expectedStats);

        // Act
        List<EnergyStats> actualStats = interactor.getAllEnergyStats();

        // Assert
        assertEquals(expectedStats, actualStats);
        verify(repository, times(1)).getAll();
    }

    @Test
    public void testGetAllEnergyStatsById() throws IOException {
        // Arrange
        String id = "123";
        EnergyStats expectedStats = new EnergyStats();
        when(repository.getById(id)).thenReturn(expectedStats);

        // Act
        EnergyStats actualStats = interactor.getAllEnergyStats(id);

        // Assert
        assertEquals(expectedStats, actualStats);
        verify(repository, times(1)).getById(id);
    }
}
