package com.splitscale.reems.tenantinfo.read;

import com.splitscale.reems.repositories.TenantRepository;
import com.splitscale.reems.tenantinfo.TenantInfo;
import java.io.IOException;
import java.util.List;

public class ReadTenantInfoInteractor {

  TenantRepository repository;

  public List<TenantInfo> getAllTenantInfo() throws IOException {
    return repository.getAll();
  }

  public TenantInfo getTenantInfoById(String id) throws IOException {
    return repository.getById(id);
  }
}
