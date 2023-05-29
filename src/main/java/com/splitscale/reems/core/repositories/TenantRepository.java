package com.splitscale.reems.core.repositories;

import com.splitscale.reems.core.tenantinfo.TenantInfo;
import com.splitscale.reems.core.tenantinfo.TenantInfoRequest;

import java.io.IOException;
import java.util.List;

public interface TenantRepository {
  public List<TenantInfo> getAll() throws IOException;

  public TenantInfo getById(String id) throws IOException;

  public String add(TenantInfoRequest tenantInfoRequest) throws IOException;

  public void update(TenantInfo tenant) throws IOException;

  public void delete(String id) throws IOException;
}
