package com.splitscale.reems.core.Unit.Interactors.mitigation;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.core.mitigation.delete.DeleteMitigationInteractor;
import com.splitscale.reems.core.repositories.MitigationRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class DeleteMitigationInteractorTest {
  @Mock
  private MitigationRepository repository;

  @InjectMocks
  private DeleteMitigationInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void deleteMitigation_shouldInvokeRepositoryDelete() throws IOException {
    String mitigationId = "123";

    interactor.deleteMitigation(mitigationId);

    verify(repository).delete(mitigationId);
  }
}
