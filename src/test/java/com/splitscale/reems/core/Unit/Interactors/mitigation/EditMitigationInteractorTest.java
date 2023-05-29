package com.splitscale.reems.core.Unit.Interactors.mitigation;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.core.mitigation.Mitigation;
import com.splitscale.reems.core.mitigation.edit.EditMitigationInteractor;
import com.splitscale.reems.core.repositories.MitigationRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class EditMitigationInteractorTest {

  @Mock
  private MitigationRepository repository;

  @InjectMocks
  private EditMitigationInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void editMitigation_shouldInvokeRepositoryUpdate() throws IOException {
    Mitigation mitigation = new Mitigation(
    );

    interactor.editMitigation(mitigation);

    verify(repository).update(mitigation);
  }
}
