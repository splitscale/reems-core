package com.splitscale.reems.Unit;

import com.splitscale.reems.history.History;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

public class HistoryTest {

  @Test
  public void testGettersAndSetters() {
    // Create a sample History instance
    String id = "1";
    String header = "Sample Header";
    String body = "This is a sample history body.";
    Date created = new Date();

    History history = new History(id, header, body, created);

    // Test the getters
    Assert.assertEquals(id, history.getId());
    Assert.assertEquals(header, history.getHeader());
    Assert.assertEquals(body, history.getBody());
    Assert.assertEquals(created, history.getCreated());

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
    Assert.assertEquals(newId, history.getId());
    Assert.assertEquals(newHeader, history.getHeader());
    Assert.assertEquals(newBody, history.getBody());
    Assert.assertEquals(newCreated, history.getCreated());
  }
}
