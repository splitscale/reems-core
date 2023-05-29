package com.splitscale.reems.repositories;

import com.splitscale.reems.energyStats.EnergyStats;
import com.splitscale.reems.energyStats.EnergyStatsRequest;
import java.io.IOException;
import java.util.List;

public interface EnergyStatsRepository {
    public List<EnergyStats> getAll() throws IOException;

    public EnergyStats getById(String id) throws IOException;

    public String add(EnergyStatsRequest EnergyStatsRequest) throws IOException;

    public void update(EnergyStats history) throws IOException;

    public void deleteById(String id) throws IOException;

    public void deleteAll() throws IOException;
}
