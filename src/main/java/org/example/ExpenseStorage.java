package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;

public class ExpenseStorage {
    private Map<String, Expense> expenselist;



    private final String filename = "src/main/budgettracker.json";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public ExpenseStorage() {
    }
    public void readFile() throws IOException {
     Type type = new TypeToken<Map<String, Expense>>() {}.getType();


     Reader reader = new FileReader(new File(filename));

     expenselist = gson.fromJson(reader, type);
        //System.out.println("Lista av utgifter: ");
        //for (Map.Entry<String, Expense> entry : expenselist.entrySet()) {

            //System.out.println(entry.getKey() + ": " + entry.getValue());
        //}
    }
    public void saveToFile(Expense expense) throws IOException {
        expenselist.put(expense.getLocalDate(), expense);

        FileWriter fw = new FileWriter(new File(filename));

        gson.toJson(expenselist, fw);
        fw.close();
        System.out.println("Utgift sparad!");
    }

    public Map<String, Expense> getExpenselist() {
        return expenselist;
    }
}




