package com.splitscale.reems.Unit.Interactors.energyConsumption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.splitscale.reems.energy.consumption.EnergyConsumption;
import com.splitscale.reems.energy.consumption.read.ReadEnergyConsumptionInteractor;
import com.splitscale.reems.repositories.EnergyConsumptionRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ReadEnergyConsumptionInteractorTest {

  @Mock
  private EnergyConsumptionRepository repository;

  private ReadEnergyConsumptionInteractor interactor;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.initMocks(this);
    interactor = new ReadEnergyConsumptionInteractor(repository);
  }

  @Test
  @DisplayName("Test Get All EnergyConsumption")
  public void testGetAllEnergyConsumption() throws IOException {
    List<EnergyConsumption> expectedEnergyConsumptions = new ArrayList<>();

    when(repository.getAll()).thenReturn(expectedEnergyConsumptions);

    List<EnergyConsumption> result = interactor.getAllEnergyConsumption();

    assertEquals(expectedEnergyConsumptions, result);
  }

  @Test
  @DisplayName("Test Get EnergyConsumption by ID")
  public void testGetEnergyConsumptionById() throws IOException {
    String id = "123456"; // ID of the EnergyConsumption to retrieve
    EnergyConsumption expectedEnergyConsumption = new EnergyConsumption(
      "1",
      "2",
      "Building A",
      "400",
      "2000kws",
      "100",
      null,
      null
    );

    when(repository.getById(id)).thenReturn(expectedEnergyConsumption);

    EnergyConsumption result = interactor.getEnergyConsumptionById(id);

    assertEquals(expectedEnergyConsumption, result);
  }
}
