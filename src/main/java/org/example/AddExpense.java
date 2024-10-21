package org.example;

public class AddExpense {
private Expense.ExpenseCategory expenseCategory;

public void setExpenseCategory(String expenseCategory) {
    switch (expenseCategory) {
        case "Food":
            this.expenseCategory = Expense.ExpenseCategory.FOOD;
            break;
        case "Transportation":
            this.expenseCategory = Expense.ExpenseCategory.TRANSPORTATION;
            break;
        case "Amusement":
            this.expenseCategory = Expense.ExpenseCategory.AMUSEMENT;
            break;
        case "Other":
            this.expenseCategory = Expense.ExpenseCategory.OTHER;
            break;
    }
}

}



