package com.splitscale.reems.Unit.Entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.splitscale.reems.mitigation.Mitigation;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class MitigationTest {

  @Test
  public void testGettersAndSetters() {
    // Create a sample Mitigation instance
    String id = "1";
    String hazardId = "ABC123";
    String task = "Clean Toxic Waste";
    String description =
      "A large plastic is cleaned and disposed immediately outside the property.";
    String cost = "500";
    Date created = new Date();
    Date modified = new Date();

    Mitigation mitigation = new Mitigation(
      id,
      hazardId,
      task,
      description,
      cost,
      created,
      modified
    );

    // Test the getters
    assertEquals(id, mitigation.getId());
    assertEquals(hazardId, mitigation.getHazardId());
    assertEquals(task, mitigation.getTask());
    assertEquals(description, mitigation.getDescription());
    assertEquals(cost, mitigation.getCost());
    assertEquals(created, mitigation.getCreated());
    assertEquals(modified, mitigation.getModified());

    // Test the setters
    String newId = "2";
    String newHazardId = "DEF456";
    String newTask = "New Task";
    String newDescription = "This is a new mitigation description.";
    String newCost = "2000";
    Date newCreated = new Date();
    Date newModified = new Date();

    mitigation.setId(newId);
    mitigation.setHazardId(newHazardId);
    mitigation.setTask(newTask);
    mitigation.setDescription(newDescription);
    mitigation.setCost(newCost);
    mitigation.setCreated(newCreated);
    mitigation.setModified(newModified);

    // Test the updated values
    assertEquals(newId, mitigation.getId());
    assertEquals(newHazardId, mitigation.getHazardId());
    assertEquals(newTask, mitigation.getTask());
    assertEquals(newDescription, mitigation.getDescription());
    assertEquals(newCost, mitigation.getCost());
    assertEquals(newCreated, mitigation.getCreated());
    assertEquals(newModified, mitigation.getModified());
  }
}
