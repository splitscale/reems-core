package com.splitscale.reems.Unit.Interactors.rentContract;

import com.splitscale.reems.rentContract.delete.DeleteRentContractInteractor;
import com.splitscale.reems.repositories.RentContractRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.mockito.Mockito.*;

class DeleteRentContractInteractorTest {

    @Mock
    private RentContractRepository repository;

    private DeleteRentContractInteractor interactor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        interactor = new DeleteRentContractInteractor(repository);
    }

    @Test
    void testDeleteProperty() throws IOException {
        // Arrange
        String id = "123";

        // Act
        interactor.deleteRentContract(id);;

        // Assert
        // Verify that the delete method of the repository was called exactly once with
        // the correct parameter
        verify(repository, times(1)).delete(id);
    }
}
