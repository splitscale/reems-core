package com.splitscale.reems.Unit;

import com.splitscale.reems.properties.Property;
import org.junit.Assert;
import org.junit.Test;

public class PropertyTest {

  @Test
  public void testGettersAndSetters() {
    // Create a sample Property instance
    String id = "1";
    String name = "Building A";
    String location = "St. San Miguel";
    String status = "Active";

    Property property = new Property(id, name, location, status);

    // Test the getters
    Assert.assertEquals(id, property.getId());
    Assert.assertEquals(name, property.getName());
    Assert.assertEquals(location, property.getLocation());
    Assert.assertEquals(status, property.getStatus());

    // Test the setters
    String newId = "2";
    String newName = "New Property";
    String newLocation = "New Location";
    String newStatus = "Inactive";

    property.setId(newId);
    property.setName(newName);
    property.setLocation(newLocation);
    property.setStatus(newStatus);

    // Test the updated values
    Assert.assertEquals(newId, property.getId());
    Assert.assertEquals(newName, property.getName());
    Assert.assertEquals(newLocation, property.getLocation());
    Assert.assertEquals(newStatus, property.getStatus());
  }
}
