package org.example;

public class Expense extends Transaction {
    private ExpenseCategory expenseCategory;
// la till ett fält här idtället med Enumet

    public Expense(String localDate,double amount, String category) {
        // här inne städade jag upp för efter att jag tog bort Enum så var det lite fel
        // bland annat fel ordning i super consturctorn samt att expenseCategory stod med det där
        // tog även bort den i Transaction
        super(localDate, amount);
        this.expenseCategory = ExpenseCategory.OTHER;
        // just nu hårdkodat till OTHER på alla men det här får du fixa till. Titta på
        // mitt exempel
    }

    // Flyttade Enum till en egen klass så att det går att göra getters och setters

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }
}
