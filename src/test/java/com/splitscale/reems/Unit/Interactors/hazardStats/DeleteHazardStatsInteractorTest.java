package com.splitscale.reems.Unit.Interactors.hazardStats;

import com.splitscale.reems.hazardStats.delete.DeleteHazardStatsInteractor;
import com.splitscale.reems.repositories.EnvironmentalHazardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class DeleteHazardStatsInteractorTest {

    @Mock
    private EnvironmentalHazardRepository repository;

    private DeleteHazardStatsInteractor interactor;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        interactor = new DeleteHazardStatsInteractor(repository);
    }

    @Test
    public void testDeleteEnvironmentalHazard() throws IOException {
        String hazardId = "123456";

        // Perform the delete operation
        interactor.deleteEnvironmentalHazard(hazardId);

        // Verify that the delete method of the repository was called with the correct
        // hazard ID
        verify(repository, times(1)).delete(hazardId);
    }
}
