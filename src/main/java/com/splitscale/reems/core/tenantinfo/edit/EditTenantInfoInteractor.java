package com.splitscale.reems.core.tenantinfo.edit;

import com.splitscale.reems.core.repositories.TenantRepository;
import com.splitscale.reems.core.tenantinfo.TenantInfo;

import java.io.IOException;

public class EditTenantInfoInteractor {

  private TenantRepository repository;

  public EditTenantInfoInteractor(TenantRepository repository) {
    this.repository = repository;
  }

  public void editTenantInfo(TenantInfo tenantInfo) throws IOException {
    repository.update(tenantInfo);
  }
}
