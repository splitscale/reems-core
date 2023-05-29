package com.splitscale.reems.Unit.Interactors.rentContract;

import com.splitscale.reems.properties.Property;
import com.splitscale.reems.rentContract.read.ReadRentContractInteractor;
import com.splitscale.reems.repositories.PropertyRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ReadRentContractInteractorTest {

    @Mock
    private PropertyRepository mockRepository;

    private ReadRentContractInteractor interactor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        interactor = new ReadRentContractInteractor(mockRepository);
    }

    @Test
    public void testGetAllProperty() throws IOException {
        List<Property> expectedProperties = new ArrayList<>();
        // Add some test properties to the expectedProperties list

        when(mockRepository.getAll()).thenReturn(expectedProperties);

        List<Property> actualProperties = interactor.getAllProperty();

        assertEquals(expectedProperties, actualProperties);
        // Verify that the repository's getAll() method was called
        verify(mockRepository).getAll();
    }

    @Test
    public void testGetById() throws IOException {
        String propertyId = "123";
        Property expectedProperty = new Property();
        // Set up any necessary preconditions or stub any required behaviors

        when(mockRepository.getById(propertyId)).thenReturn(expectedProperty);

        Property actualProperty = interactor.getById(propertyId);

        assertEquals(expectedProperty, actualProperty);
        // Verify that the repository's getById() method was called with the correct
        // propertyId
        verify(mockRepository).getById(propertyId);
    }
}
