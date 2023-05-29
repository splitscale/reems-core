package com.splitscale.reems.core.Unit.Entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.splitscale.reems.core.hazardStats.HazardStats;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HazardStatsTest {
    private HazardStats hazardStats;

    @BeforeEach
    public void setUp() {
        hazardStats = new HazardStats("1", Date.valueOf("2023-05-01"), Date.valueOf("2023-05-15"), 10, 5);
    }

    @Test
    public void testGetId() {
        assertEquals("1", hazardStats.getId());
    }

    @Test
    public void testSetId() {
        hazardStats.setId("2");
        assertEquals("2", hazardStats.getId());
    }

    @Test
    public void testGetCreated() {
        assertEquals(Date.valueOf("2023-05-01"), hazardStats.getCreated());
    }

    @Test
    public void testSetCreated() {
        hazardStats.setCreated(Date.valueOf("2023-05-10"));
        assertEquals(Date.valueOf("2023-05-10"), hazardStats.getCreated());
    }

    @Test
    public void testGetEdited() {
        assertEquals(Date.valueOf("2023-05-15"), hazardStats.getEdited());
    }

    @Test
    public void testSetEdited() {
        hazardStats.setEdited(Date.valueOf("2023-05-20"));
        assertEquals(Date.valueOf("2023-05-20"), hazardStats.getEdited());
    }

    @Test
    public void testGetTotalHazards() {
        assertEquals(10, hazardStats.getTotal_hazards());
    }

    @Test
    public void testSetTotalHazards() {
        hazardStats.setTotal_hazards(20);
        assertEquals(20, hazardStats.getTotal_hazards());
    }

    @Test
    public void testGetChangeThisMonth() {
        assertEquals(5, hazardStats.getChange_this_month());
    }

    @Test
    public void testSetChangeThisMonth() {
        hazardStats.setChange_this_month(8);
        assertEquals(8, hazardStats.getChange_this_month());
    }
}
