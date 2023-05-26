package com.splitscale.reems.Unit.Interactors.mitigation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.splitscale.reems.mitigation.Mitigation;
import com.splitscale.reems.mitigation.read.ReadMitigationInteractor;
import com.splitscale.reems.repositories.MitigationRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class ReadMitigationInteractorTest {

  @Mock
  private MitigationRepository repository;

  @InjectMocks
  private ReadMitigationInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void getAllMitigation_shouldReturnListOfMitigations() throws IOException {
    List<Mitigation> expectedMitigations = new ArrayList<>();
    when(repository.getAll()).thenReturn(expectedMitigations);

    List<Mitigation> actualMitigations = interactor.getAllMitigation();

    assertEquals(expectedMitigations, actualMitigations);
    verify(repository).getAll();
  }

  @Test
  void getMitigationById_shouldReturnMitigationById() throws IOException {
    String mitigationId = "123";
    Mitigation expectedMitigation = new Mitigation(
      mitigationId,
      "1233",
      "Mitigate hazard",
      "Sample description",
      "100",
      null,
      null
    ); // Create a sample Mitigation object for testing
    when(repository.getById(mitigationId)).thenReturn(expectedMitigation);

    Mitigation actualMitigation = interactor.getMitigationById(mitigationId);

    assertEquals(expectedMitigation, actualMitigation);
    verify(repository).getById(mitigationId);
  }
}
