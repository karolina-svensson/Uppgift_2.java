package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Map;

public class IncomeStorage {
    private Map<String, Income> incomelist;

    private String filename = "src/main/income.json";

    Gson gson = new GsonBuilder().setPrettyPrinting().create();


    public IncomeStorage() {
    }
    public String readFile() throws IOException {
        Type type = new TypeToken<Map<String, Income>>() {}.getType();

        Reader reader = new FileReader(new File(filename));

        incomelist = gson.fromJson(reader, type);


        return "";
    }
    public void saveToFile(Income income) throws IOException {
        incomelist.put(income.getLocalDate(), income);

        FileWriter fw = new FileWriter(new File(filename));

        gson.toJson(incomelist, fw);
        fw.close();
        System.out.println("Inkomst sparad!");
    }
    public Map<String, Income> getIncomelist() {
        return incomelist;
}
}
