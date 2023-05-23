package com.splitscale.reems.tenantinfo.delete;

import com.splitscale.reems.repositories.TenantRepository;
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
