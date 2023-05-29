package com.splitscale.reems.core.Unit.Interactors.hazard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.core.hazard.environment.read.ReadEnvironmentalHazardInteractor;
import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class ReadEnvironmentalHazardInteractorTest {

  @Mock
  private EnvironmentalHazardRepository repository;

  @InjectMocks
  private ReadEnvironmentalHazardInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void getAllEnvironmentalHazard_shouldReturnAllHazards() throws IOException {
    List<EnvironmentalHazard> expectedHazards = new ArrayList<>();
    expectedHazards.add(
      new EnvironmentalHazard(
      )
    );
    expectedHazards.add(
      new EnvironmentalHazard(
      )
    );

    when(repository.getAll()).thenReturn(expectedHazards);

    List<EnvironmentalHazard> actualHazards = interactor.getAllEnvironmentalHazard();

    assertEquals(expectedHazards, actualHazards);
  }

  @Test
  void getEnvironmentalHazardById_shouldReturnHazardById() throws IOException {
    EnvironmentalHazard expectedHazard = new EnvironmentalHazard(
    );
    String hazardId = "hazard-1";

    when(repository.getById(hazardId)).thenReturn(expectedHazard);

    EnvironmentalHazard actualHazard = interactor.getEnvironmentalHazardById(
      hazardId
    );

    assertEquals(expectedHazard, actualHazard);
  }
}
