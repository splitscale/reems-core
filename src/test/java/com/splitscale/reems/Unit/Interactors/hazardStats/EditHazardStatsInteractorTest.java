package com.splitscale.reems.Unit.Interactors.hazardStats;

import com.splitscale.reems.hazard.environment.EnvironmentalHazard;
import com.splitscale.reems.hazardStats.edit.EditHazardStatsInteractor;
import com.splitscale.reems.repositories.EnvironmentalHazardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.mockito.Mockito.verify;

public class EditHazardStatsInteractorTest {

    @Mock
    private EnvironmentalHazardRepository mockRepository;

    private EditHazardStatsInteractor interactor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        interactor = new EditHazardStatsInteractor(mockRepository);
    }

    @Test
    public void testEditEnvironmentalHazard() throws IOException {
        // Create a mock EnvironmentalHazard object for testing
        EnvironmentalHazard hazard = new EnvironmentalHazard();

        // Call the method to be tested
        interactor.editEnvironmentalHazard(hazard);

        // Verify that the repository's update method is called with the same hazard
        verify(mockRepository).update(hazard);
    }
}
