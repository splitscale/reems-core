package com.splitscale.reems.mitigation.edit;

import com.splitscale.reems.mitigation.Mitigation;
import com.splitscale.reems.repositories.MitigationRepository;
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
