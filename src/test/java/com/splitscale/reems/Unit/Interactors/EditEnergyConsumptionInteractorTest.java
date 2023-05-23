package com.splitscale.reems.Unit.Interactors;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.energy.consumption.EnergyConsumption;
import com.splitscale.reems.energy.consumption.edit.EditEnergyConsumptionInteractor;
import com.splitscale.reems.repositories.EnergyConsumptionRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class EditEnergyConsumptionInteractorTest {

  @Mock
  private EnergyConsumptionRepository repository;

  private EditEnergyConsumptionInteractor interactor;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.initMocks(this);
    interactor = new EditEnergyConsumptionInteractor(repository);
  }

  @Test
  @DisplayName("Test Edit EnergyConsumption Interactor")
  public void testEditEnergyConsumption() throws IOException {
    EnergyConsumption energyConsumption = new EnergyConsumption(
      "123",
      "246",
      "REEMS",
      "204",
      "1000",
      "500",
      null,
      null
    );

    interactor.editEnergyConsumption(energyConsumption);

    verify(repository).update(energyConsumption);
  }
}
