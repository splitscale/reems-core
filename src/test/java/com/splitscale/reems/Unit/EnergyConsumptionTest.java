package com.splitscale.reems.Unit;

import com.splitscale.reems.energy.consumption.EnergyConsumption;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

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
    Assert.assertEquals(id, energyConsumption.getId());
    Assert.assertEquals(propertyId, energyConsumption.getPropertyId());
    Assert.assertEquals(propertyName, energyConsumption.getPropertyName());
    Assert.assertEquals(usage, energyConsumption.getUsage());
    Assert.assertEquals(consumed, energyConsumption.getConsumed());
    Assert.assertEquals(amount, energyConsumption.getAmount());
    Assert.assertEquals(created, energyConsumption.getCreated());
    Assert.assertEquals(modified, energyConsumption.getModified());

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
    Assert.assertEquals(newId, energyConsumption.getId());
    Assert.assertEquals(newPropertyId, energyConsumption.getPropertyId());
    Assert.assertEquals(newPropertyName, energyConsumption.getPropertyName());
    Assert.assertEquals(newUsage, energyConsumption.getUsage());
    Assert.assertEquals(newConsumed, energyConsumption.getConsumed());
    Assert.assertEquals(newAmount, energyConsumption.getAmount());
    Assert.assertEquals(newCreated, energyConsumption.getCreated());
    Assert.assertEquals(newModified, energyConsumption.getModified());
  }
}
