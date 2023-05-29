package com.splitscale.reems.core.expenseStats;

import java.sql.Date;

public class ExpenseStatsResponse {
    private String id;
    private Date created;
    private Date edited;
    private String totalExpenses;
    private String changeThisMonth;
    private String expenseThisMonth;

    public ExpenseStatsResponse() {
        // default
    }

    public ExpenseStatsResponse(String id, Date created, Date edited, String totalExpenses, String changeThisMonth,
            String expenseThisMonth) {
        this.id = id;
        this.created = created;
        this.edited = edited;
        this.totalExpenses = totalExpenses;
        this.changeThisMonth = changeThisMonth;
        this.expenseThisMonth = expenseThisMonth;
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

    public String getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(String totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public String getChangeThisMonth() {
        return changeThisMonth;
    }

    public void setChangeThisMonth(String changeThisMonth) {
        this.changeThisMonth = changeThisMonth;
    }

    public String getExpenseThisMonth() {
        return expenseThisMonth;
    }

    public void setExpenseThisMonth(String expenseThisMonth) {
        this.expenseThisMonth = expenseThisMonth;
    }
}
