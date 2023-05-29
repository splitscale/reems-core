package com.splitscale.reems.core.tenantinfo.delete;

import com.splitscale.reems.core.repositories.TenantRepository;
import java.io.IOException;

public class DeleteTenantInfoInteractor {

  private TenantRepository repository;

  public DeleteTenantInfoInteractor(TenantRepository repository) {
    this.repository = repository;
  }

  public void deleteTenantInfo(String id) throws IOException {
    repository.delete(id);
  }
}
