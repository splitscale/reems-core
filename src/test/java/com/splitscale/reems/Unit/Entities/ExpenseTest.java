package com.splitscale.reems.Unit.Entities;

import org.junit.jupiter.api.Test;

import com.splitscale.reems.expenses.Expense;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpenseTest {

  @Test
  public void testExpenseProperties() {
    // Arrange
    String id = "123";
    Date created = new Date();
    Date modified = new Date();
    String value = "10.5";
    String unit = "USD";

    // Act
    Expense expense = new Expense(id, created, modified, value, unit);

    // Assert
    assertEquals(id, expense.getId());
    assertEquals(created, expense.getCreated());
    assertEquals(modified, expense.getModified());
    assertEquals(value, expense.getValue());
    assertEquals(unit, expense.getUnit());
  }

  @Test
  public void testExpenseSetters() {
    // Arrange
    Expense expense = new Expense();
    String id = "456";
    Date created = new Date();
    Date modified = new Date();
    String value = "15.2";
    String unit = "EUR";

    // Act
    expense.setId(id);
    expense.setCreated(created);
    expense.setModified(modified);
    expense.setValue(value);
    expense.setUnit(unit);

    // Assert
    assertEquals(id, expense.getId());
    assertEquals(created, expense.getCreated());
    assertEquals(modified, expense.getModified());
    assertEquals(value, expense.getValue());
    assertEquals(unit, expense.getUnit());
  }
}
