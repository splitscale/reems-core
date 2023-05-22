package com.splitscale.reems.Unit;

import org.junit.Assert;
import org.junit.Test;

import com.splitscale.reems.mitigation.Mitigation;

import java.util.Date;

public class MitigationTest {

    @Test
    public void testGettersAndSetters() {
        // Create a sample Mitigation instance
        String id = "1";
        String hazardId = "ABC123";
        String task = "Clean Toxic Waste";
        String description = "A large plastic is cleaned and disposed immediately outside the property.";
        String cost = "500";
        Date created = new Date();
        Date modified = new Date();

        Mitigation mitigation = new Mitigation(
                id, hazardId, task, description, cost, created, modified
        );

        // Test the getters
        Assert.assertEquals(id, mitigation.getId());
        Assert.assertEquals(hazardId, mitigation.getHazardId());
        Assert.assertEquals(task, mitigation.getTask());
        Assert.assertEquals(description, mitigation.getDescription());
        Assert.assertEquals(cost, mitigation.getCost());
        Assert.assertEquals(created, mitigation.getCreated());
        Assert.assertEquals(modified, mitigation.getModified());

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
        Assert.assertEquals(newId, mitigation.getId());
        Assert.assertEquals(newHazardId, mitigation.getHazardId());
        Assert.assertEquals(newTask, mitigation.getTask());
        Assert.assertEquals(newDescription, mitigation.getDescription());
        Assert.assertEquals(newCost, mitigation.getCost());
        Assert.assertEquals(newCreated, mitigation.getCreated());
        Assert.assertEquals(newModified, mitigation.getModified());
    }
}
