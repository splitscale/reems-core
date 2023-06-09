package com.splitscale.reems.core.Unit.Interactors.mitigation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.splitscale.reems.core.mitigation.MitigationRequest;
import com.splitscale.reems.core.mitigation.create.CreateMitigationInteractor;
import com.splitscale.reems.core.repositories.MitigationRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CreateMitigationInteractorTest {

  @Mock
  private MitigationRepository repository;

  @InjectMocks
  private CreateMitigationInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void createMitigation_shouldReturnAddedMitigation() throws IOException {
    MitigationRequest mitigationRequest = new MitigationRequest(
      "Mitigation 1",
      "Sample mitigation desicription",
      null, null, "100", null, null, null
    );
    String expectedMitigationId = "123";

    when(repository.add(mitigationRequest)).thenReturn(expectedMitigationId);

    String actualMitigationId = interactor.createMitigation(mitigationRequest);

    assertEquals(expectedMitigationId, actualMitigationId);
    verify(repository).add(mitigationRequest);
  }
}
