package com.splitscale.reems.core.Unit.Interactors.hazardStats;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.core.hazardStats.read.ReadHazardStatsInteractor;
import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ReadHazardStatsInteractorTest {

    private ReadHazardStatsInteractor interactor;
    private EnvironmentalHazardRepository repository;

    @BeforeEach
    public void setUp() {
        repository = mock(EnvironmentalHazardRepository.class);
        interactor = new ReadHazardStatsInteractor(repository);
    }

    @Test
    public void testGetAllEnvironmentalHazard() throws IOException {
        // Arrange
        List<EnvironmentalHazard> expectedHazards = new ArrayList<>();
        when(repository.getAll()).thenReturn(expectedHazards);

        // Act
        List<EnvironmentalHazard> result = interactor.getAllEnvironmentalHazard();

        // Assert
        assertEquals(expectedHazards, result);
        verify(repository, times(1)).getAll();
    }

    @Test
    public void testGetEnvironmentalHazardById() throws IOException {
        // Arrange
        String id = "123";
        EnvironmentalHazard expectedHazard = new EnvironmentalHazard();
        when(repository.getById(id)).thenReturn(expectedHazard);

        // Act
        EnvironmentalHazard result = interactor.getEnvironmentalHazardById(id);

        // Assert
        assertEquals(expectedHazard, result);
        verify(repository, times(1)).getById(id);
    }
}
