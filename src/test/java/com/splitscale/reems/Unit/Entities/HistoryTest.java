package com.splitscale.reems.Unit.Entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.splitscale.reems.history.History;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class HistoryTest {

  @Test
  public void testGettersAndSetters() {
    // Create a sample History instance
    String id = "01";
    String header = "Environmental Hazard";
    String body = "Sample environmental body.";
    Date created = new Date();

    History history = new History(id, header, body, created);

    // Test the getters
    assertEquals(id, history.getId());
    assertEquals(header, history.getHeader());
    assertEquals(body, history.getBody());
    assertEquals(created, history.getCreated());

    // Test the setters
    String newId = "2";
    String newHeader = "New Header";
    String newBody = "This is a new history body.";
    Date newCreated = new Date();

    history.setId(newId);
    history.setHeader(newHeader);
    history.setBody(newBody);
    history.setCreated(newCreated);

    // Test the updated values
    assertEquals(newId, history.getId());
    assertEquals(newHeader, history.getHeader());
    assertEquals(newBody, history.getBody());
    assertEquals(newCreated, history.getCreated());
  }
}
