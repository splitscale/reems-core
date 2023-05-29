package com.splitscale.reems.Unit.Entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.splitscale.reems.expenseStats.ExpenseStats;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpenseStatsTest {
    private ExpenseStats expenseStats;
    private final String id = "123";
    private final Date created = new Date(System.currentTimeMillis());
    private final Date edited = new Date(System.currentTimeMillis());
    private final String totalExpenses = "1000";
    private final String changeThisMonth = "200";
    private final String expenseThisMonth = "800";

    @BeforeEach
    public void setUp() {
        expenseStats = new ExpenseStats();
    }

    @Test
    public void testGettersAndSetters() {
        expenseStats.setId(id);
        expenseStats.setCreated(created);
        expenseStats.setEdited(edited);
        expenseStats.setTotalExpenses(totalExpenses);
        expenseStats.setChangeThisMonth(changeThisMonth);
        expenseStats.setExpenseThisMonth(expenseThisMonth);

        assertEquals(id, expenseStats.getId());
        assertEquals(created, expenseStats.getCreated());
        assertEquals(edited, expenseStats.getEdited());
        assertEquals(totalExpenses, expenseStats.getTotalExpenses());
        assertEquals(changeThisMonth, expenseStats.getChangeThisMonth());
        assertEquals(expenseThisMonth, expenseStats.getExpenseThisMonth());
    }
}
