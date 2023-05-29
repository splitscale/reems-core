package com.splitscale.reems.Unit.Interactors.rentContract;

import com.splitscale.reems.rentContract.RentContract;
import com.splitscale.reems.rentContract.edit.EditRentContractInteractor;
import com.splitscale.reems.repositories.RentContractRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class EditRentContractInteractorTest {

    @Mock
    private RentContractRepository mockRepository;

    private EditRentContractInteractor interactor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        interactor = new EditRentContractInteractor(mockRepository);
    }

    @Test
    public void testEditRentContract() throws IOException {
        // Create a RentContract object
        RentContract rentContract = new RentContract("1", null, null);

        // Set up any necessary preconditions or stub any required behaviors

        interactor.editRentContract(rentContract);

        // Verify that the repository's update method was called with the correct
        // RentContract object
        verify(mockRepository).update(rentContract);

        // Add additional assertions or verifications as needed
    }
}
