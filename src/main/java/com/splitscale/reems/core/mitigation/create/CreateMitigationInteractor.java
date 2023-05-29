package com.splitscale.reems.core.mitigation.create;

import com.splitscale.reems.core.mitigation.MitigationRequest;
import com.splitscale.reems.core.repositories.MitigationRepository;
import java.io.IOException;

public class CreateMitigationInteractor {

  private MitigationRepository repository;

  public CreateMitigationInteractor(MitigationRepository repository) {
    this.repository = repository;
  }

  public String createMitigation(MitigationRequest mitigationRequest)
    throws IOException {
    return repository.add(mitigationRequest);
  }
}
