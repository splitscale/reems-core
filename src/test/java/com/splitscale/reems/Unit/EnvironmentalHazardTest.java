package com.splitscale.reems.Unit;

import com.splitscale.reems.hazard.environment.EnvironmentalHazard;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

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
    Assert.assertEquals(id, hazard.getId());
    Assert.assertEquals(propertyId, hazard.getPropertyId());
    Assert.assertEquals(title, hazard.getTitle());
    Assert.assertEquals(category, hazard.getCategory());
    Assert.assertEquals(description, hazard.getDescription());
    Assert.assertEquals(propertyName, hazard.getPropertyName());
    Assert.assertEquals(riskLevel, hazard.getRiskLevel());
    Assert.assertEquals(mitigationStatus, hazard.getMitigationStatus());
    Assert.assertEquals(created, hazard.getCreated());
    Assert.assertEquals(modified, hazard.getModified());

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
    Assert.assertEquals(newId, hazard.getId());
    Assert.assertEquals(newPropertyId, hazard.getPropertyId());
    Assert.assertEquals(newTitle, hazard.getTitle());
    Assert.assertEquals(newCategory, hazard.getCategory());
    Assert.assertEquals(newDescription, hazard.getDescription());
    Assert.assertEquals(newPropertyName, hazard.getPropertyName());
    Assert.assertEquals(newRiskLevel, hazard.getRiskLevel());
    Assert.assertEquals(newMitigationStatus, hazard.getMitigationStatus());
    Assert.assertEquals(newCreated, hazard.getCreated());
    Assert.assertEquals(newModified, hazard.getModified());
  }
}
