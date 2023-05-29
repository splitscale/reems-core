package com.splitscale.reems.Unit.Interactors.properties;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.properties.Property;
import com.splitscale.reems.properties.edit.EditPropertyInteractor;
import com.splitscale.reems.repositories.PropertyRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class EditPropertyInteractorTest {

  @Mock
  private PropertyRepository repository;

  @InjectMocks
  private EditPropertyInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void editProperty_shouldInvokeRepositoryUpdate() throws IOException {
    Property property = new Property(null, null, null, null, null, null);

    interactor.editProperty(property);

    verify(repository).update(property);
  }
}
