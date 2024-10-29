package org.example;

public class Transaction {
    private double amount;
    private String localDate;
    //private String category;

    public Transaction(String localDate, double amount) {
        this.localDate = localDate;
        this.amount = amount;
        //this.category = category;

    }

    /*@Override
    public String toString() {
        return "Datum: " + localDate +
                ", Summa: " + amount +
               //", Kategori: " + category +
                "}";*/



    public double getAmount() {
        return amount;
    }

    public String getLocalDate() {
        return localDate;
    }
}
    /*@Override
    public String toString() {
        return
                "Datum: " + localDate +
                ", Summa: " + amount +
                ", Kategori: " + category +
                "}";}*/





