package com.splitscale.reems.core.repositories;

import com.splitscale.reems.core.expenseStats.ExpenseStats;
import com.splitscale.reems.core.expenseStats.ExpenseStatsRequest;
import java.io.IOException;
import java.util.List;

public interface ExpenseStatsRepository {
    public List<ExpenseStats> getAll() throws IOException;

    public ExpenseStats getById(String id) throws IOException;

    public String add(ExpenseStatsRequest expenseStatsRequest) throws IOException;

    public void update(ExpenseStats history) throws IOException;

    public void deleteById(String id) throws IOException;

    public void deleteAll() throws IOException;
}
