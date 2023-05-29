package com.splitscale.reems.core.mitigation.edit;

import com.splitscale.reems.core.mitigation.Mitigation;
import com.splitscale.reems.core.repositories.MitigationRepository;
import java.io.IOException;

public class EditMitigationInteractor {

  private MitigationRepository repository;

  public EditMitigationInteractor(MitigationRepository repository) {
    this.repository = repository;
  }

  public void editMitigation(Mitigation mitigation) throws IOException {
    repository.update(mitigation);
  }
}
