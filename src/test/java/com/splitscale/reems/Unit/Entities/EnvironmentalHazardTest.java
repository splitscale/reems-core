package com.splitscale.reems.Unit.Entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.splitscale.reems.hazard.environment.EnvironmentalHazard;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class EnvironmentalHazardTest {

  @Test
  public void testGettersAndSetters() {
    // Create a sample EnvironmentalHazard instance
    String id = "1";
    String propertyId = "ABC123";
    String title = "Toxic Waste";
    String category = "Chemical";
    String description =
      "A large plastic is dumped outside of the property with a lot of chemicals.";
    String propertyName = "Building A";
    String riskLevel = "High";
    String mitigationStatus = "In Progress";
    Date created = new Date();
    Date modified = new Date();

    EnvironmentalHazard hazard = new EnvironmentalHazard(
      id,
      propertyId,
      title,
      category,
      description,
      propertyName,
      riskLevel,
      mitigationStatus,
      created,
      modified
    );

    // Test the getters
    assertEquals(id, hazard.getId());
    assertEquals(propertyId, hazard.getPropertyId());
    assertEquals(title, hazard.getTitle());
    assertEquals(category, hazard.getCategory());
    assertEquals(description, hazard.getDescription());
    assertEquals(propertyName, hazard.getPropertyName());
    assertEquals(riskLevel, hazard.getRiskLevel());
    assertEquals(mitigationStatus, hazard.getMitigationStatus());
    assertEquals(created, hazard.getCreated());
    assertEquals(modified, hazard.getModified());

    // Test the setters
    String newId = "2";
    String newPropertyId = "DEF456";
    String newTitle = "New Hazard";
    String newCategory = "Physical";
    String newDescription = "This is a new hazard description.";
    String newPropertyName = "New Property";
    String newRiskLevel = "Medium";
    String newMitigationStatus = "Completed";
    Date newCreated = new Date();
    Date newModified = new Date();

    hazard.setId(newId);
    hazard.setPropertyId(newPropertyId);
    hazard.setTitle(newTitle);
    hazard.setCategory(newCategory);
    hazard.setDescription(newDescription);
    hazard.setPropertyName(newPropertyName);
    hazard.setRiskLevel(newRiskLevel);
    hazard.setMitigationStatus(newMitigationStatus);
    hazard.setCreated(newCreated);
    hazard.setModified(newModified);

    // Test the updated values
    assertEquals(newId, hazard.getId());
    assertEquals(newPropertyId, hazard.getPropertyId());
    assertEquals(newTitle, hazard.getTitle());
    assertEquals(newCategory, hazard.getCategory());
    assertEquals(newDescription, hazard.getDescription());
    assertEquals(newPropertyName, hazard.getPropertyName());
    assertEquals(newRiskLevel, hazard.getRiskLevel());
    assertEquals(newMitigationStatus, hazard.getMitigationStatus());
    assertEquals(newCreated, hazard.getCreated());
    assertEquals(newModified, hazard.getModified());
  }
}
