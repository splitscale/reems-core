package com.splitscale.reems.Unit.Entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;

import com.splitscale.reems.energy.consumption.EnergyConsumption;
import org.junit.jupiter.api.Test;

public class EnergyConsumptionTest {

  @Test
  public void testConstructorAndGetters() {
    // Create sample values
    String id = "123";
    String expenseId = "456";
    String propertyId = "789";
    Date created = new Date(0);
    Date edited = new Date(0);
    String consumedValue = "100";
    String energyUnit = "kWh";
    String usageValue = "50";
    double costPerUnit = 0.0;

    // Create an instance of EnergyConsumption using the constructor
    EnergyConsumption energyConsumption = new EnergyConsumption(id, expenseId, propertyId, created, edited,
        consumedValue, energyUnit, usageValue, costPerUnit);

    // Test the getters
    assertEquals(id, energyConsumption.getId());
    assertEquals(expenseId, energyConsumption.getExpenseId());
    assertEquals(propertyId, energyConsumption.getPropertyId());
    assertEquals(created, energyConsumption.getCreated());
    assertEquals(edited, energyConsumption.getEdited());
    assertEquals(consumedValue, energyConsumption.getConsumedValue());
    assertEquals(energyUnit, energyConsumption.getEnergyUnit());
    assertEquals(usageValue, energyConsumption.getUsageValue());
    assertEquals(costPerUnit, energyConsumption.getCostPerUnit()); 
  }

  @Test
  public void testSetters() {
    // Create a sample EnergyConsumption object
    EnergyConsumption energyConsumption = new EnergyConsumption("", "", "", null, null,
        "", "", "", 0.0);

    // Set new values using the setters
    String newId = "123";
    energyConsumption.setId(newId);
    assertEquals(newId, energyConsumption.getId());

    String newExpenseId = "456";
    energyConsumption.setExpenseId(newExpenseId);
    assertEquals(newExpenseId, energyConsumption.getExpenseId());

    String newPropertyId = "789";
    energyConsumption.setPropertyId(newPropertyId);
    assertEquals(newPropertyId, energyConsumption.getPropertyId());

    Date newCreated = new Date(0);
    energyConsumption.setCreated(newCreated);
    assertEquals(newCreated, energyConsumption.getCreated());

    Date newEdited = new Date(0);
    energyConsumption.setEdited(newEdited);
    assertEquals(newEdited, energyConsumption.getEdited());

    String newConsumedValue = "100";
    energyConsumption.setConsumedValue(newConsumedValue);
    assertEquals(newConsumedValue, energyConsumption.getConsumedValue());

    String newEnergyUnit = "kWh";
    energyConsumption.setEnergyUnit(newEnergyUnit);
    assertEquals(newEnergyUnit, energyConsumption.getEnergyUnit());

    String newUsageValue = "50";
    energyConsumption.setUsageValue(newUsageValue);
    assertEquals(newUsageValue, energyConsumption.getUsageValue());

    double newConstPerUnit = 0.5;
    energyConsumption.setConstPerUnit(newConstPerUnit);
    assertEquals(newConstPerUnit, energyConsumption.getConstPerUnit(), 0.0); // delta of 0.0 for exact comparison
  }
}
