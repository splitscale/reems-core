package com.splitscale.reems.repositories;

import com.splitscale.reems.properties.Property;
import com.splitscale.reems.properties.PropertyRequest;

import java.io.IOException;
import java.util.List;

public interface PropertyRepository {
  public List<Property> getAll() throws IOException;

  public Property getById(String id) throws IOException;

  public String add(PropertyRequest propertyRequest) throws IOException;

  public void update(Property property) throws IOException;

  public void delete(String id) throws IOException;
}
