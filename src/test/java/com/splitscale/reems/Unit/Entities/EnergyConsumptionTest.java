package com.splitscale.reems.Unit.Entities;

import com.splitscale.reems.energy.consumption.EnergyConsumption;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class EnergyConsumptionTest {

  @Test
  public void testGettersAndSetters() {
    // Create a sample EnergyConsumption instance
    String id = "1";
    String propertyId = "123";
    String propertyName = "Property A";
    String usage = "Electricity";
    String consumed = "100 kWh";
    String amount = "$50";
    Date created = new Date();
    Date modified = new Date();

    EnergyConsumption energyConsumption = new EnergyConsumption(
      id,
      propertyId,
      propertyName,
      usage,
      consumed,
      amount,
      created,
      modified
    );

    // Test the getters
    assertEquals(id, energyConsumption.getId());
    assertEquals(propertyId, energyConsumption.getPropertyId());
    assertEquals(propertyName, energyConsumption.getPropertyName());
    assertEquals(usage, energyConsumption.getUsage());
    assertEquals(consumed, energyConsumption.getConsumed());
    assertEquals(amount, energyConsumption.getAmount());
    assertEquals(created, energyConsumption.getCreated());
    assertEquals(modified, energyConsumption.getModified());

    // Test the setters
    String newId = "2";
    String newPropertyId = "DEF456";
    String newPropertyName = "New Property";
    String newUsage = "Gas";
    String newConsumed = "50 units";
    String newAmount = "$30";
    Date newCreated = new Date();
    Date newModified = new Date();

    energyConsumption.setId(newId);
    energyConsumption.setPropertyId(newPropertyId);
    energyConsumption.setPropertyName(newPropertyName);
    energyConsumption.setUsage(newUsage);
    energyConsumption.setConsumed(newConsumed);
    energyConsumption.setAmount(newAmount);
    energyConsumption.setCreated(newCreated);
    energyConsumption.setModified(newModified);

    // Test the updated values
    assertEquals(newId, energyConsumption.getId());
    assertEquals(newPropertyId, energyConsumption.getPropertyId());
    assertEquals(newPropertyName, energyConsumption.getPropertyName());
    assertEquals(newUsage, energyConsumption.getUsage());
    assertEquals(newConsumed, energyConsumption.getConsumed());
    assertEquals(newAmount, energyConsumption.getAmount());
    assertEquals(newCreated, energyConsumption.getCreated());
    assertEquals(newModified, energyConsumption.getModified());
  }
}
