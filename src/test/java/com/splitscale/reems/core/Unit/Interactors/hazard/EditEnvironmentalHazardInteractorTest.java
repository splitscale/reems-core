package com.splitscale.reems.core.Unit.Interactors.hazard;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.core.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.core.hazard.environment.edit.EditEnvironmentalHazardInteractor;
import com.splitscale.reems.core.repositories.EnvironmentalHazardRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class EditEnvironmentalHazardInteractorTest {

  @Mock
  private EnvironmentalHazardRepository repository;

  @InjectMocks
  private EditEnvironmentalHazardInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void editEnvironmentalHazard_shouldCallUpdateMethod() throws IOException {
    EnvironmentalHazard hazard = new EnvironmentalHazard(
    );
    hazard.setId("123");
    hazard.setDescription("Updated hazard");

    interactor.editEnvironmentalHazard(hazard);

    verify(repository).update(hazard);
  }
}
