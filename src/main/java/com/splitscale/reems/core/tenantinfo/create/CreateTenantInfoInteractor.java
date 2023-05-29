package com.splitscale.reems.core.tenantinfo.create;

import com.splitscale.reems.core.repositories.TenantRepository;
import com.splitscale.reems.core.tenantinfo.TenantInfoRequest;
import java.io.IOException;

public class CreateTenantInfoInteractor {

  private TenantRepository repository;

  public CreateTenantInfoInteractor(TenantRepository repository) {
    this.repository = repository;
  }

  public String createTenantInfo(TenantInfoRequest tenantInfoRequest)
    throws IOException {
    return repository.add(tenantInfoRequest);
  }
}
