package com.splitscale.reems.Unit.Interactors.hazard;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.hazard.environment.delete.DeleteEnvironmentalHazardInteractor;
import com.splitscale.reems.repositories.EnvironmentalHazardRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class DeleteEnvironmentalHazardInteractorTest {
  @Mock
  private EnvironmentalHazardRepository repository;

  @InjectMocks
  private DeleteEnvironmentalHazardInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void deleteEnvironmentalHazard_shouldCallDeleteMethod() throws IOException {
    String hazardId = "123";

    interactor.deleteEnvironmentalHazard(hazardId);

    verify(repository).delete(hazardId);
  }
}
