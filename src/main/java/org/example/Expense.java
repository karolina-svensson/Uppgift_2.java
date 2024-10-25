package org.example;

public class Expense extends Transaction {

    private ExpenseCategory expenseCategory;


    public Expense(String localDate,double amount, String category) {
        super(localDate, amount);
        switch (category) {
            case "Food":
                expenseCategory = ExpenseCategory.FOOD;
                break;
            case "Transportation":
                expenseCategory = ExpenseCategory.TRANSPORTATION;
                break;
            case "Amusement":
                expenseCategory = ExpenseCategory.AMUSEMENT;
                break;
                case "Other":
                    expenseCategory = ExpenseCategory.OTHER;
                    break;
        }

    }



    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }
}
