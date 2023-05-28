package com.splitscale.reems.Unit.Interactors.tenantInfo;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.repositories.TenantRepository;
import com.splitscale.reems.tenantinfo.TenantInfo;
import com.splitscale.reems.tenantinfo.edit.EditTenantInfoInteractor;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class EditTenantInfoInteractorTest {
  @Mock
  private TenantRepository repository;

  @InjectMocks
  private EditTenantInfoInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void editTenantInfo_shouldCallRepositoryUpdateMethod() throws IOException {
    TenantInfo tenantInfo = new TenantInfo(null, null);

    interactor.editTenantInfo(tenantInfo);

    verify(repository).update(tenantInfo);
  }
}
