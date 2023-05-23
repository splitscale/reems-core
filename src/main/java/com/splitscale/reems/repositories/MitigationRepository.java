package com.splitscale.reems.repositories;

import java.io.IOException;
import java.util.List;

import com.splitscale.reems.mitigation.Mitigation;
import com.splitscale.reems.mitigation.MitigationRequest;

public interface MitigationRepository {
  public List<Mitigation> getAll() throws IOException;

  public Mitigation getById(String id) throws IOException;

  public String add(MitigationRequest mitigationRequest) throws IOException;

  public void update(Mitigation mitigation) throws IOException;

  public void delete(String id) throws IOException;
}
