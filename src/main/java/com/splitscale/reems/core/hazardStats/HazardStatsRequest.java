package com.splitscale.reems.core.hazardStats;

import java.sql.Date;

public class HazardStatsRequest {
    private String id;
    private Date created;
    private Date edited;
    private long total_hazards;
    private long change_this_month;

    public HazardStatsRequest() {
        // default
    }
    
    public HazardStatsRequest(String id, Date created, Date edited, long total_hazards, long change_this_month) {
        this.id = id;
        this.created = created;
        this.edited = edited;
        this.total_hazards = total_hazards;
        this.change_this_month = change_this_month;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getEdited() {
        return edited;
    }

    public void setEdited(Date edited) {
        this.edited = edited;
    }

    public long getTotal_hazards() {
        return total_hazards;
    }

    public void setTotal_hazards(long total_hazards) {
        this.total_hazards = total_hazards;
    }

    public long getChange_this_month() {
        return change_this_month;
    }

    public void setChange_this_month(long change_this_month) {
        this.change_this_month = change_this_month;
    }
}
