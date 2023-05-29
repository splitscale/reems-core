package com.splitscale.reems.core.Unit.Interactors.rentContract;

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

import com.splitscale.reems.core.rentContract.RentContract;
import com.splitscale.reems.core.rentContract.read.ReadRentContractInteractor;
import com.splitscale.reems.core.repositories.RentContractRepository;

public class ReadRentContractInteractorTest {

  @Mock
  private RentContractRepository mockRepository;

  private ReadRentContractInteractor interactor;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
    interactor = new ReadRentContractInteractor(mockRepository);
  }

  @Test
  public void testGetAllRentContract() throws IOException {
    List<RentContract> expectedRentContracts = new ArrayList<>();
    // Add some test rent contracts to the expectedRentContracts list

    when(mockRepository.getAll()).thenReturn(expectedRentContracts);

    List<RentContract> actualRentContracts = interactor.getAllRentContract();

    assertEquals(expectedRentContracts, actualRentContracts);
    // Verify that the repository's getAll() method was called
    verify(mockRepository).getAll();
  }

  @Test
  public void testGetById() throws IOException {
    String rentContractId = "123";
    RentContract expectedRentContract = new RentContract();
    // Set up any necessary preconditions or stub any required behaviors

    when(mockRepository.getById(rentContractId)).thenReturn(expectedRentContract);

    RentContract actualRentContract = interactor.getById(rentContractId);

    assertEquals(expectedRentContract, actualRentContract);
    // Verify that the repository's getById() method was called with the correct
    // rentContractId
    verify(mockRepository).getById(rentContractId);
  }
}
