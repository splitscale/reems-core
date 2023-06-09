package com.splitscale.reems.core.Unit.Interactors.hazard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazardRequest;
import com.splitscale.reems.core.hazard.environment.create.CreateEnvironmentalHazardInteractor;
import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CreateEnvironmentalHazardInteractorTest {
  @Mock
  private EnvironmentalHazardRepository repository;

  @InjectMocks
  private CreateEnvironmentalHazardInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void createEnvironmentalHazard_shouldReturnAddedHazard() throws IOException {
    EnvironmentalHazardRequest hazardRequest = new EnvironmentalHazardRequest(
      "Hazard 1",
      "Chemical",
      null, null, "Description of a hazard",
      "Property A",
      "High",
      "InProgress"
    );
    String expectedHazardId = "123";

    when(repository.add(hazardRequest)).thenReturn(expectedHazardId);

    String actualHazardId = interactor.createEnvironmentalHazard(hazardRequest);

    assertEquals(expectedHazardId, actualHazardId);
    verify(repository).add(hazardRequest);
  }
}
