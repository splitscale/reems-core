package com.splitscale.reems.Unit.Interactors.properties;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.properties.delete.DeletePropertyInteractor;
import com.splitscale.reems.repositories.PropertyRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class DeletePropertyInteractorTest {
  @Mock
  private PropertyRepository repository;

  @InjectMocks
  private DeletePropertyInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void deleteProperty_shouldInvokeRepositoryDelete() throws IOException {
    String id = "123";

    interactor.deleteProperty(id);

    verify(repository).delete(id);
  }
}
