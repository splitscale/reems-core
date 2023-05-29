package com.splitscale.reems.repositories;

import com.splitscale.reems.hazardStats.HazardStats;
import com.splitscale.reems.hazardStats.HazardStatsRequest;

import java.io.IOException;
import java.util.List;

public interface HazardStatsRepository {
    public List<HazardStats> getAll() throws IOException;

    public HazardStats getById(String id) throws IOException;

    public String add(HazardStatsRequest hazardStatsRequest) throws IOException;

    public void update(HazardStats history) throws IOException;

    public void deleteById(String id) throws IOException;

    public void deleteAll() throws IOException;
}
