package com.splitscale.reems.Unit;

import com.splitscale.reems.expenses.Expense;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

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
    Assert.assertEquals(id, expenseObj.getId());
    Assert.assertEquals(expense, expenseObj.getExpense());
    Assert.assertEquals(created, expenseObj.getCreated());
    Assert.assertEquals(modified, expenseObj.getModified());

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
    Assert.assertEquals(newId, expenseObj.getId());
    Assert.assertEquals(newExpense, expenseObj.getExpense());
    Assert.assertEquals(newCreated, expenseObj.getCreated());
    Assert.assertEquals(newModified, expenseObj.getModified());
  }
}
