package com.splitscale.reems.core.Unit.Interactors.energyConsumption;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.core.energy.consumption.delete.DeleteEnergyConsumptionInteractor;
import com.splitscale.reems.core.repositories.EnergyConsumptionRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DeleteEnergyConsumptionInteractorTest {

  @Mock
  private EnergyConsumptionRepository repository;

  private DeleteEnergyConsumptionInteractor interactor;

  @BeforeEach
  public void setup() {
    interactor = new DeleteEnergyConsumptionInteractor(repository);
  }

  @Test
  @DisplayName("Test Delete EnergyConsumption Interactor")
  public void testDeleteEnergyConsumption() throws IOException {
    String id = "3456"; // ID to be deleted

    interactor.DeleteEnergyConsumption(id);

    verify(repository).delete(id);
  }
}
