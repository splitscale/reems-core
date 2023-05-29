package com.splitscale.reems.core.Unit.Entities;

import org.junit.jupiter.api.Test;

import com.splitscale.reems.core.mitigation.Mitigation;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class MitigationTest {

  @Test
  void testGettersAndSetters() {
    // Create a Mitigation object
    Mitigation mitigation = new Mitigation();

    // Set values using setters
    String id = "123";
    String expenseId = "456";
    Date created = new Date();
    Date edited = new Date();
    String title = "Sample Title";
    String description = "Sample Description";
    Double cost = null;
    String status = "Active";

    mitigation.setId(id);
    mitigation.setExpenseId(expenseId);
    mitigation.setCreated(created);
    mitigation.setEdited(edited);
    mitigation.setTitle(title);
    mitigation.setDescription(description);
    mitigation.setCost(cost);
    mitigation.setStatus(status);

    // Test getters
    assertEquals(id, mitigation.getId());
    assertEquals(expenseId, mitigation.getExpenseId());
    assertEquals(created, mitigation.getCreated());
    assertEquals(edited, mitigation.getEdited());
    assertEquals(title, mitigation.getTitle());
    assertEquals(description, mitigation.getDescription());
    assertEquals(cost, mitigation.getCost());
    assertEquals(status, mitigation.getStatus());
  }
}
