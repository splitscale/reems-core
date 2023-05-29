package com.splitscale.reems.Unit.Interactors.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.splitscale.reems.properties.PropertyRequest;
import com.splitscale.reems.properties.create.CreatePropertyInteractor;
import com.splitscale.reems.repositories.PropertyRepository;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CreatePropertyInteractorTest {
  @Mock
  private PropertyRepository repository;

  @InjectMocks
  private CreatePropertyInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void createProperty_shouldReturnAddedProperty() throws IOException {
    PropertyRequest propertyRequest = new PropertyRequest(null, null, null, null, null, null);
    String expectedPropertyId = "123";

    when(repository.add(propertyRequest)).thenReturn(expectedPropertyId);

    String actualPropertyId = interactor.createProperty(propertyRequest);

    assertEquals(expectedPropertyId, actualPropertyId);
    verify(repository).add(propertyRequest);
  }
}
