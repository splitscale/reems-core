package com.splitscale.reems.Unit.Interactors.hazard;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.hazard.environment.edit.EditEnvironmentalHazardInteractor;
import com.splitscale.reems.repositories.EnvironmentalHazardRepository;
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
      "01",
      "1242",
      "Hazard",
      "Chemical",
      "Sample Hazard Description",
      "Property A",
      "High",
      "InProgress",
      null,
      null
    );
    hazard.setId("123");
    hazard.setDescription("Updated hazard");

    interactor.editEnvironmentalHazard(hazard);

    verify(repository).update(hazard);
  }
}
