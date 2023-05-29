package com.splitscale.reems.core.Unit.Interactors.hazardStats;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazardRequest;
import com.splitscale.reems.core.hazardStats.HazardStats;
import com.splitscale.reems.core.hazardStats.HazardStatsRequest;
import com.splitscale.reems.core.hazardStats.create.CreateHazardStatsInteractor;
import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import com.splitscale.reems.core.repositories.HazardStatsRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CreateHazardStatsInteractorTest {

  @Mock
  private HazardStatsRepository mockRepository;

  private CreateHazardStatsInteractor interactor;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
    interactor = new CreateHazardStatsInteractor(mockRepository);
  }

  @Test
  public void testCreateEnvironmentalHazard() throws IOException {
    // Arrange
    HazardStatsRequest request = new HazardStatsRequest();
    String expectedResult = "success";
    when(mockRepository.add(request)).thenReturn(expectedResult);

    // Act
    String result = interactor.createHazardStats(request);

    // Assert
    assertEquals(expectedResult, result);
    verify(mockRepository, times(1)).add(request);
  }
}
