package com.splitscale.reems.core.Unit.Interactors.energyConsumption;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.core.energy.consumption.EnergyConsumption;
import com.splitscale.reems.core.energy.consumption.edit.EditEnergyConsumptionInteractor;
import com.splitscale.reems.core.repositories.EnergyConsumptionRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EditEnergyConsumptionInteractorTest {

  @Mock
  private EnergyConsumptionRepository repository;

  private EditEnergyConsumptionInteractor interactor;

  @BeforeEach
  public void setup() {
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
        "100kwh",
        "500",
        null,
        null);

    interactor.editEnergyConsumption(energyConsumption);

    verify(repository).update(energyConsumption);
  }
}
