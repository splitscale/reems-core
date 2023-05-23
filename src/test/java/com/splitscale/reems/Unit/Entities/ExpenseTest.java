package com.splitscale.reems.Unit.Entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.splitscale.reems.expenses.Expense;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class ExpenseTest {

  @Test
  public void testGettersAndSetters() {
    // Create a sample Expense instance
    String id = "1";
    String expense = "124221";
    Date created = new Date();
    Date modified = new Date();

    Expense expenseObj = new Expense(id, expense, created, modified);

    // Test the getters
    assertEquals(id, expenseObj.getId());
    assertEquals(expense, expenseObj.getExpense());
    assertEquals(created, expenseObj.getCreated());
    assertEquals(modified, expenseObj.getModified());

    // Test the setters
    String newId = "2";
    String newExpense = "3443563";
    Date newCreated = new Date();
    Date newModified = new Date();

    expenseObj.setId(newId);
    expenseObj.setExpense(newExpense);
    expenseObj.setCreated(newCreated);
    expenseObj.setModified(newModified);

    // Test the updated values
    assertEquals(newId, expenseObj.getId());
    assertEquals(newExpense, expenseObj.getExpense());
    assertEquals(newCreated, expenseObj.getCreated());
    assertEquals(newModified, expenseObj.getModified());
  }
}
