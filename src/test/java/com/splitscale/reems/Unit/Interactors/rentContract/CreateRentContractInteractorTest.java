package com.splitscale.reems.Unit.Interactors.rentContract;

import com.splitscale.reems.rentContract.RentContractRequest;
import com.splitscale.reems.rentContract.create.CreateRentContractInteractor;
import com.splitscale.reems.repositories.RentContractRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.mockito.Mockito.*;

class CreateRentContractInteractorTest {

    @Mock
    private RentContractRepository repository;

    private CreateRentContractInteractor interactor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        interactor = new CreateRentContractInteractor(repository);
    }

    @Test
    void testCreateProperty() throws IOException {
        // Arrange
        RentContractRequest request = new RentContractRequest("123", "456", "789");
        String expectedResult = "success";

        // Mocking the behavior of the repository's add method
        when(repository.add(request)).thenReturn(expectedResult);

        // Act
        String result = interactor.createRentContract(request);

        // Assert
        Assertions.assertEquals(expectedResult, result);

        // Verify that the add method of the repository was called exactly once with the
        // correct parameter
        verify(repository, times(1)).add(request);
    }
}
