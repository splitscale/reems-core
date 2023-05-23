package com.splitscale.reems.Unit.Interactors;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.energy.consumption.delete.DeleteEnergyConsumptionInteractor;
import com.splitscale.reems.repositories.EnergyConsumptionRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DeleteEnergyConsumptionInteractorTest {

  @Mock
  private EnergyConsumptionRepository repository;

  private DeleteEnergyConsumptionInteractor interactor;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.initMocks(this);
    interactor = new DeleteEnergyConsumptionInteractor(repository);
  }

  @Test
  @DisplayName("Test Delete EnergyConsumption Interactor")
  public void testDeleteEnergyConsumption() throws IOException {
    String id = "123456"; // ID to be deleted

    interactor.DeleteEnergyConsumption(id);

    verify(repository).delete(id);
  }
}
