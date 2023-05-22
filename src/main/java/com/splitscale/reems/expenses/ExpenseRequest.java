package com.splitscale.reems.expenses;

public class ExpenseRequest {

  private String expense;

  public ExpenseRequest(String expense) {
    this.expense = expense;
  }

  public String getExpense() {
    return expense;
  }

  public void setExpense(String expense) {
    this.expense = expense;
  }
}
