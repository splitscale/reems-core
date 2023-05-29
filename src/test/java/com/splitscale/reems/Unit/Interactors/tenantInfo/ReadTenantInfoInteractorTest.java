package com.splitscale.reems.Unit.Interactors.tenantInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.splitscale.reems.repositories.TenantRepository;
import com.splitscale.reems.tenantinfo.TenantInfo;
import com.splitscale.reems.tenantinfo.read.ReadTenantInfoInteractor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class ReadTenantInfoInteractorTest {
  @Mock
  private TenantRepository repository;

  @InjectMocks
  private ReadTenantInfoInteractor interactor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void getAllTenantInfo_shouldReturnAllTenantInfo() throws IOException {
    List<TenantInfo> expectedTenantInfoList = new ArrayList<>();
    expectedTenantInfoList.add(new TenantInfo(null, null, null, null));
    expectedTenantInfoList.add(new TenantInfo(null, null, null, null));

    when(repository.getAll()).thenReturn(expectedTenantInfoList);

    List<TenantInfo> actualTenantInfoList = interactor.getAllTenantInfo();

    assertEquals(expectedTenantInfoList, actualTenantInfoList);
  }

  @Test
  void getTenantInfoById_shouldReturnTenantInfoById() throws IOException {
    String tenantInfoId = "123";
    TenantInfo expectedTenantInfo = new TenantInfo(
        tenantInfoId,
        tenantInfoId, null, null);

    when(repository.getById(tenantInfoId)).thenReturn(expectedTenantInfo);

    TenantInfo actualTenantInfo = interactor.getTenantInfoById(tenantInfoId);

    assertEquals(expectedTenantInfo, actualTenantInfo);
  }
}
