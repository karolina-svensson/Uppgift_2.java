package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;

public class IncomeStorage {
    private Map<Expense, String> incomelist;
    private String filename = "src/main/budgettracker.json";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public IncomeStorage() {
    }
    public void readFile() throws IOException {
        Type type = new TypeToken<Map<Expense, String>>() {}.getType();

        Reader reader = new FileReader(new File(filename));

        incomelist = gson.fromJson(reader, type);
        System.out.println("Lista av utgifter: ");
        for (Map.Entry<Expense, String> entry : incomelist.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public void saveToFile(Expense expense) throws IOException {
        incomelist.put(expense, gson.toJson(expense));

        FileWriter fw = new FileWriter(new File(filename));

        gson.toJson(incomelist, fw);
        fw.close();
        System.out.println("Utgift sparad!");
    }
}
