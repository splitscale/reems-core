package com.splitscale.reems.core.Unit.Entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.splitscale.reems.core.energyStats.EnergyStats;
import java.sql.Date;

public class EnergyStatsTest {
    @Test
    public void testGettersAndSetters() {
        String id = "1";
        Date created = new Date(System.currentTimeMillis());
        Date edited = new Date(System.currentTimeMillis());
        String totalConsumption = "1000";
        String changeThisMonth = "200";
        String consumedThisMonth = "800";

        EnergyStats energyStats = new EnergyStats();
        energyStats.setId(id);
        energyStats.setCreated(created);
        energyStats.setEdited(edited);
        energyStats.setTotalConsumption(totalConsumption);
        energyStats.setChangeThisMonth(changeThisMonth);
        energyStats.setConsumedThisMonth(consumedThisMonth);

        Assertions.assertEquals(id, energyStats.getId());
        Assertions.assertEquals(created, energyStats.getCreated());
        Assertions.assertEquals(edited, energyStats.getEdited());
        Assertions.assertEquals(totalConsumption, energyStats.getTotalConsumption());
        Assertions.assertEquals(changeThisMonth, energyStats.getChangeThisMonth());
        Assertions.assertEquals(consumedThisMonth, energyStats.getConsumedThisMonth());
    }
}
