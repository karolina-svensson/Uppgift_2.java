package org.example;

public class Transaction {
    private double amount;
    private String localDate;
   // private String expenseCategory;

    public Transaction(String localDate, double amount) {
        this.localDate = localDate;
        this.amount = amount;
       // this.expenseCategory = expenseCategory;

    }



    @Override
    public String toString() {
        return "Datum: " + localDate +
                ", Summa: " + amount +
              //  ", Kategori: " + expenseCategory +
                "}";

    }

    public double getAmount() {
        return amount;
    }

    public String getLocalDate() {
        return localDate;
    }
}


