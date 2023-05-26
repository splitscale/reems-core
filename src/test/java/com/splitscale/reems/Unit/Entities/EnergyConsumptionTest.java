package com.splitscale.reems.Unit.Entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.splitscale.reems.energy.consumption.EnergyConsumption;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class EnergyConsumptionTest {

  @Test
  public void testGettersAndSetters() {
    String id = "01";
    String propertyId = "4345";
    String propertyName = "Property A";
    String usage = "Electricity";
    String consumed = "100 kwh";
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
    String newPropertyId = "9812";
    String newPropertyName = "New Property";
    String newUsage = "Gas";
    String newConsumed = "200kwh";
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
