package org.example;

public class AddExpense {
private ExpenseCategory expenseCategory;
// ändrade här inne pga bröt ut Enum
public void setExpenseCategory(String expenseCategory) {
    switch (expenseCategory) {
        case "Food":
            this.expenseCategory = ExpenseCategory.FOOD;
            break;
        case "Transportation":
            this.expenseCategory = ExpenseCategory.TRANSPORTATION;
            break;
        case "Amusement":
            this.expenseCategory = ExpenseCategory.AMUSEMENT;
            break;
        case "Other":
            this.expenseCategory = ExpenseCategory.OTHER;
            break;
    }
}

}



