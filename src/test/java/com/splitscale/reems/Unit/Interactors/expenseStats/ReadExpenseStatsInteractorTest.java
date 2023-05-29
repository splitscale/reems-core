package com.splitscale.reems.Unit.Interactors.expenseStats;

import com.splitscale.reems.expenseStats.read.ReadExpenseStatsInteractor;
import com.splitscale.reems.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.repositories.EnvironmentalHazardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ReadExpenseStatsInteractorTest {

    @Mock
    private EnvironmentalHazardRepository mockRepository;

    private ReadExpenseStatsInteractor interactor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        interactor = new ReadExpenseStatsInteractor(mockRepository);
    }

    @Test
    public void testGetAllEnvironmentalHazard() throws IOException {
        // Arrange
        List<EnvironmentalHazard> expectedHazards = new ArrayList<>();
        expectedHazards.add(new EnvironmentalHazard("1", "Hazard 1", null, null, null, null, null, null));
        expectedHazards.add(new EnvironmentalHazard("2", "Hazard 2", null, null, null, null, null, null));

        when(mockRepository.getAll()).thenReturn(expectedHazards);

        // Act
        List<EnvironmentalHazard> actualHazards = interactor.getAllEnvironmentalHazard();

        // Assert
        assertEquals(expectedHazards, actualHazards);
        verify(mockRepository, times(1)).getAll();
    }

    @Test
    public void testGetEnvironmentalHazardById() throws IOException {
        // Arrange
        String hazardId = "1";
        EnvironmentalHazard expectedHazard = new EnvironmentalHazard(hazardId, "Hazard 1", null, null, hazardId,
                hazardId, hazardId, hazardId);

        when(mockRepository.getById(hazardId)).thenReturn(expectedHazard);

        // Act
        EnvironmentalHazard actualHazard = interactor.getEnvironmentalHazardById(hazardId);

        // Assert
        assertEquals(expectedHazard, actualHazard);
        verify(mockRepository, times(1)).getById(hazardId);
    }
}
