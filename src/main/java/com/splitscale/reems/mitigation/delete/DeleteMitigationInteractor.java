package com.splitscale.reems.mitigation.delete;

import com.splitscale.reems.repositories.MitigationRepository;
import java.io.IOException;

public class DeleteMitigationInteractor {

  private MitigationRepository repository;

  public DeleteMitigationInteractor(MitigationRepository repository) {
    this.repository = repository;
  }

  public void deleteMitigation(String id) throws IOException {
    repository.delete(id);
  }
}
