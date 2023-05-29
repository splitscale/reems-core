package com.splitscale.reems.Unit.Interactors.tenantInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.splitscale.reems.repositories.TenantRepository;
import com.splitscale.reems.tenantinfo.TenantInfoRequest;
import com.splitscale.reems.tenantinfo.create.CreateTenantInfoInteractor;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CreateTenantInfoInteractorTest {
  @Mock
  private TenantRepository repository;

  @InjectMocks
  private CreateTenantInfoInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void createTenantInfo_shouldReturnAddedTenantInfo() throws IOException {
    TenantInfoRequest tenantInfoRequest = new TenantInfoRequest(null, null, null, null);
    String expectedTenantInfoId = "123";

    when(repository.add(tenantInfoRequest)).thenReturn(expectedTenantInfoId);

    String actualTenantInfoId = interactor.createTenantInfo(tenantInfoRequest);

    assertEquals(expectedTenantInfoId, actualTenantInfoId);
    verify(repository).add(tenantInfoRequest);
  }
}
