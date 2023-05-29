package com.splitscale.reems.core.Unit.Interactors.hazardStats;

import com.splitscale.reems.core.hazardStats.delete.DeleteHazardStatsInteractor;
import com.splitscale.reems.core.repositories.HazardStatsRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class DeleteHazardStatsInteractorTest {

  @Mock
  private HazardStatsRepository repository;

  private DeleteHazardStatsInteractor interactor;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
    interactor = new DeleteHazardStatsInteractor(repository);
  }

  @Test
  public void testDeleteEnvironmentalHazard() throws IOException {
    String hazardId = "123456";

    // Perform the delete operation
    interactor.deleteHazardStats(hazardId);

    // Verify that the delete method of the repository was called with the correct
    // hazard ID
    verify(repository, times(1)).deleteById(hazardId);
  }
}
