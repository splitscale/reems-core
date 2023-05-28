package com.splitscale.reems.Unit.Entities;

import org.junit.jupiter.api.Test;

import com.splitscale.reems.hazard.environment.EnvironmentalHazard;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnvironmentalHazardTest {

    @Test
    void testGettersAndSetters() {
        // Arrange
        String id = "1";
        String propertyId = "property1";
        Date created = new Date();
        Date modified = new Date();
        String category = "Category";
        String title = "Title";
        String description = "Description";
        String riskLevel = "High";

        EnvironmentalHazard hazard = new EnvironmentalHazard();

        // Act
        hazard.setId(id);
        hazard.setPropertyId(propertyId);
        hazard.setCreated(created);
        hazard.setModified(modified);
        hazard.setCategory(category);
        hazard.setTitle(title);
        hazard.setDescription(description);
        hazard.setRiskLevel(riskLevel);

        // Assert
        assertEquals(id, hazard.getId());
        assertEquals(propertyId, hazard.getPropertyId());
        assertEquals(created, hazard.getCreated());
        assertEquals(modified, hazard.getModified());
        assertEquals(category, hazard.getCategory());
        assertEquals(title, hazard.getTitle());
        assertEquals(description, hazard.getDescription());
        assertEquals(riskLevel, hazard.getRiskLevel());
    }
}
