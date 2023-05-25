package com.splitscale.reems.Unit.Interactors.properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.splitscale.reems.properties.Property;
import com.splitscale.reems.properties.read.ReadPropertyInteractor;
import com.splitscale.reems.repositories.PropertyRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class ReadPropertyInteractorTest {
  @Mock
  private PropertyRepository repository;

  @InjectMocks
  private ReadPropertyInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void getAllProperty_shouldReturnListOfProperties() throws IOException {
    List<Property> expectedProperties = new ArrayList<>(); 
    when(repository.getAll()).thenReturn(expectedProperties);

    List<Property> actualProperties = interactor.getAllProperty();

    assertEquals(expectedProperties, actualProperties);
    verify(repository).getAll();
  }

  @Test
  void getPropertyById_shouldReturnPropertyById() throws IOException {
    String propertyId = "123";
    Property expectedProperty = new Property(
      propertyId,
      null,
      null,
      propertyId
    ); // Create a sample Property object for testing
    when(repository.getById(propertyId)).thenReturn(expectedProperty);

    Property actualProperty = interactor.getById(propertyId);

    assertEquals(expectedProperty, actualProperty);
    verify(repository).getById(propertyId);
  }
}
