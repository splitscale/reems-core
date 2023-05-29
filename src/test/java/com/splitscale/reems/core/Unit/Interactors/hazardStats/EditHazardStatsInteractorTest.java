package com.splitscale.reems.core.Unit.Interactors.hazardStats;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.core.hazardStats.HazardStats;
import com.splitscale.reems.core.hazardStats.edit.EditHazardStatsInteractor;
import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import com.splitscale.reems.core.repositories.HazardStatsRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.mockito.Mockito.verify;

public class EditHazardStatsInteractorTest {

  @Mock
  private HazardStatsRepository mockRepository;

  private EditHazardStatsInteractor interactor;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
    interactor = new EditHazardStatsInteractor(mockRepository);
  }

  @Test
  public void testEditEnvironmentalHazard() throws IOException {
    // Create a mock EnvironmentalHazard object for testing
    HazardStats hazard = new HazardStats();

    // Call the method to be tested
    interactor.EditHazardStats(hazard);

    // Verify that the repository's update method is called with the same hazard
    verify(mockRepository).update(hazard);
  }
}
