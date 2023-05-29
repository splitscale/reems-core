package com.splitscale.reems.core.Unit.Interactors.energyConsumption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.splitscale.reems.core.energy.consumption.EnergyConsumptionRequest;
import com.splitscale.reems.core.energy.consumption.create.CreateEnergyConsumptionInteractor;
import com.splitscale.reems.core.repositories.EnergyConsumptionRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CreateEnergyConsumptionInteractorTest {

  @Mock
  private EnergyConsumptionRepository repository;

  private CreateEnergyConsumptionInteractor interactor;

  @BeforeEach
  public void setup() {
    interactor = new CreateEnergyConsumptionInteractor(repository);
  }

  @Test
  @DisplayName("Test Create EnergyConsumption Interactor")
  public void testCreateEnergyConsumption() throws IOException {
    EnergyConsumptionRequest request = new EnergyConsumptionRequest(
      "Building A",
      "200", null, null, null, null, null, null, 0
    );
    String expectedUid = "234";

    when(repository.add(request)).thenReturn(expectedUid);

    String result = interactor.createEnergyConsumption(request);

    assertEquals(expectedUid, result);
  }
}
