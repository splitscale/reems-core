package com.splitscale.reems.core.Unit.Interactors.hazardStats;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.core.hazardStats.HazardStats;
import com.splitscale.reems.core.hazardStats.read.ReadHazardStatsInteractor;
import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import com.splitscale.reems.core.repositories.HazardStatsRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ReadHazardStatsInteractorTest {

  private ReadHazardStatsInteractor interactor;
  private HazardStatsRepository repository;

  @BeforeEach
  public void setUp() {
    repository = mock(HazardStatsRepository.class);
    interactor = new ReadHazardStatsInteractor(repository);
  }

  @Test
  public void testGetAllEnvironmentalHazard() throws IOException {
    // Arrange
    List<HazardStats> expectedHazards = new ArrayList<>();
    when(repository.getAll()).thenReturn(expectedHazards);

    // Act
    List<HazardStats> result = interactor.getAllHazardStats();

    // Assert
    assertEquals(expectedHazards, result);
    verify(repository, times(1)).getAll();
  }

  @Test
  public void testGetEnvironmentalHazardById() throws IOException {
    // Arrange
    String id = "123";
    HazardStats expectedHazard = new HazardStats();
    when(repository.getById(id)).thenReturn(expectedHazard);

    // Act
    HazardStats result = interactor.getHazardStatsById(id);

    // Assert
    assertEquals(expectedHazard, result);
    verify(repository, times(1)).getById(id);
  }
}
