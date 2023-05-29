package com.splitscale.reems.core.mitigation.read;

import com.splitscale.reems.core.mitigation.Mitigation;
import com.splitscale.reems.core.repositories.MitigationRepository;
import java.io.IOException;
import java.util.List;

public class ReadMitigationInteractor {

  MitigationRepository repository;

  public ReadMitigationInteractor(MitigationRepository repository) {
    this.repository = repository;
  }

  public List<Mitigation> getAllMitigation() throws IOException {
    return repository.getAll();
  }

  public Mitigation getMitigationById(String id) throws IOException {
    return repository.getById(id);
  }
}
