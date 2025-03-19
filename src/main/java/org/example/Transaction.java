package org.example;

public class Transaction {
    private double amount;
    private String localDate;


    public Transaction(String localDate, double amount) {
        this.localDate = localDate;
        this.amount = amount;


    }
    public double getAmount() {
        return amount;
    }

    public String getLocalDate() {
        return localDate;
    }
}




