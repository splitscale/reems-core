package com.splitscale.reems.Unit.Entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.splitscale.reems.properties.Property;
import org.junit.jupiter.api.Test;

public class PropertyTest {

  @Test
  public void testGettersAndSetters() {
    // Create a sample Property instance
    String id = "01";
    String name = "Building A";
    String location = "St. San Miguel";
    String status = "Active";

    Property property = new Property(id, name, location, status);

    // Test the getters
    assertEquals(id, property.getId());
    assertEquals(name, property.getName());
    assertEquals(location, property.getLocation());
    assertEquals(status, property.getStatus());

    // Test the setters
    String newId = "02";
    String newName = "New Property";
    String newLocation = "New Location";
    String newStatus = "Inactive";

    property.setId(newId);
    property.setName(newName);
    property.setLocation(newLocation);
    property.setStatus(newStatus);

    // Test the updated values
    assertEquals(newId, property.getId());
    assertEquals(newName, property.getName());
    assertEquals(newLocation, property.getLocation());
    assertEquals(newStatus, property.getStatus());
  }
}
