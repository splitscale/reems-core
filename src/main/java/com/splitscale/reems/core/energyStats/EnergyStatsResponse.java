package com.splitscale.reems.core.energyStats;

import java.sql.Date;

public class EnergyStatsResponse {
    private String id;
    private Date created;
    private Date edited;
    private String totalConsumption;
    private String changeThisMonth;
    private String consumedThisMonth;

    public EnergyStatsResponse() {
        // default
    }

    public EnergyStatsResponse(String id, Date created, Date edited, String totalConsumption, String changeThisMonth,
            String consumedThisMonth) {
        this.id = id;
        this.created = created;
        this.edited = edited;
        this.totalConsumption = totalConsumption;
        this.changeThisMonth = changeThisMonth;
        this.consumedThisMonth = consumedThisMonth;
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

    public String getTotalConsumption() {
        return totalConsumption;
    }

    public void setTotalConsumption(String totalConsumption) {
        this.totalConsumption = totalConsumption;
    }

    public String getChangeThisMonth() {
        return changeThisMonth;
    }

    public void setChangeThisMonth(String changeThisMonth) {
        this.changeThisMonth = changeThisMonth;
    }

    public String getConsumedThisMonth() {
        return consumedThisMonth;
    }

    public void setConsumedThisMonth(String consumedThisMonth) {
        this.consumedThisMonth = consumedThisMonth;
    }
}
