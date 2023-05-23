package com.splitscale.reems.tenantinfo.create;

import com.splitscale.reems.repositories.TenantRepository;
import com.splitscale.reems.tenantinfo.TenantInfoRequest;
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
