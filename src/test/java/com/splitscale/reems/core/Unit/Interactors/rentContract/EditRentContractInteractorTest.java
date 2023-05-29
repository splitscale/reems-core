package com.splitscale.reems.core.Unit.Interactors.rentContract;

import com.splitscale.reems.core.properties.Property;
import com.splitscale.reems.core.rentContract.edit.EditRentContractInteractor;
import com.splitscale.reems.core.repositories.PropertyRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class EditRentContractInteractorTest {

    @Mock
    private PropertyRepository mockRepository;

    private EditRentContractInteractor interactor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        interactor = new EditRentContractInteractor(mockRepository);
    }

    @Test
    public void testEditProperty() throws IOException {
        Property property = new Property();
        // Set up any necessary preconditions or stub any required behaviors

        interactor.editProperty(property);

        // Verify that the repository's update method was called with the correct
        // property
        verify(mockRepository).update(property);

        // Add additional assertions or verifications as needed
    }
}
