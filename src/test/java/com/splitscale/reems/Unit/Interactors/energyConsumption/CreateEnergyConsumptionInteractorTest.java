package com.splitscale.reems.Unit.Interactors.energyConsumption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.splitscale.reems.energy.consumption.EnergyConsumptionRequest;
import com.splitscale.reems.energy.consumption.create.CreateEnergyConsumptionInteractor;
import com.splitscale.reems.repositories.EnergyConsumptionRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

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
      "200"
    );
    String expectedUid = "abcd1234";

    when(repository.add(request)).thenReturn(expectedUid);

    String result = interactor.createEnergyConsumption(request);

    assertEquals(expectedUid, result);
  }
}
