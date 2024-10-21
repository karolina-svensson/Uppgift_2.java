package org.example;

public class Expense extends Transaction {
    public Expense(String expenseCategory, String localDate,double amount) {
        super(expenseCategory, localDate, amount);
    }

    public enum ExpenseCategory {
        FOOD, TRANSPORTATION, AMUSEMENT, OTHER
    }

}
