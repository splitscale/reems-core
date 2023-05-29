package com.splitscale.reems.core.Unit.Interactors.energyStats;

import com.splitscale.reems.core.energyStats.EnergyStats;
import com.splitscale.reems.core.energyStats.edit.EditEnergyStatsInteractor;
import com.splitscale.reems.core.repositories.EnergyStatsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.mockito.Mockito.*;

class EditEnergyStatsInteractorTest {

  @Mock
  private EnergyStatsRepository repository;

  private EditEnergyStatsInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    interactor = new EditEnergyStatsInteractor(repository);
  }

  @Test
  void testEditEnergyStats() throws IOException {
    // Arrange
    EnergyStats energyStats = new EnergyStats(); // Create a sample EnergyStats object

    // Act
    interactor.editEnergyStats(energyStats);

    // Assert
    verify(repository, times(1)).update(energyStats);
    // You can add more assertions if necessary
  }
}
