package com.splitscale.reems.core.Unit.Interactors.tenantInfo;

import static org.mockito.Mockito.verify;

import com.splitscale.reems.core.repositories.TenantRepository;
import com.splitscale.reems.core.tenantinfo.delete.DeleteTenantInfoInteractor;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class DeleteTenantInfoInteractorTest {
  @Mock
  private TenantRepository repository;

  @InjectMocks
  private DeleteTenantInfoInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void deleteTenantInfo_shouldCallRepositoryDeleteMethod() throws IOException {
    String tenantInfoId = "123";

    interactor.deleteTenantInfo(tenantInfoId);

    verify(repository).delete(tenantInfoId);
  }
}
