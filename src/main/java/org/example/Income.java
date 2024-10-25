package org.example;

public class Income extends Transaction {

    private IncomeCategory incomeCategory;

    public Income(String localDate,double amount, String category) {
        super(localDate, amount);
        switch (category) {
            case "Salary":
                this.incomeCategory = IncomeCategory.SALARY;
                break;
            case "Gift":
                this.incomeCategory = IncomeCategory.GIFT;
                break;
            case "Other":
                this.incomeCategory = IncomeCategory.OTHER;

        }
    }
}

