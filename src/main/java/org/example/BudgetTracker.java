package org.example;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BudgetTracker {

    public static void main(String[] args) throws IOException {

        TryCatch tryCatch1 = new TryCatch();
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> incomeSums = new ArrayList<>();
        ArrayList<Double> expenseSums = new ArrayList<>();

        IncomeStorage incomeStorage = new IncomeStorage();
        incomeStorage.readFile();

        ExpenseStorage expenseStorage = new ExpenseStorage();
        expenseStorage.readFile();

        User user1 = new User("Bengt", "Bengtsson");
        System.out.println("Användare: " + user1.getFirstName() + " " + user1.getLastName());

        System.out.println("Välkommen till Budgify, din personliga budgettapp! Vänligen välj ett av följande val:\n" + "1. Lägg till inkomst\n" + "2. Lägg till utgift\n" + "3. Ta bort inkomst\n" + "4. Ta bort utgift\n" + "5. Se budget\n" + "6. Avsluta programmet");
        int choice = tryCatch1.tryCatch1();

        switch (choice) {
            case 1:
                System.out.println("Ange kategori för inkomst: \n" + "Salary \n" + "Gift \n" + "Other \n");
                String incomeCategory = sc.next();

                System.out.println("Ange datum (DD/MM/YYYY) för inkomst: ");
                String localDate = sc.next();

                System.out.println("Ange summa för inkomst: ");
                double incomeAmount = sc.nextDouble();

                //Nytt Income objekt efter användaren angett variablerna localDate, amount och incomeCategory
                Income newIncome = new Income(localDate, incomeAmount, incomeCategory);

                // newIncome adderas till incomelist Hashmappen i IncomeStorage
                incomeStorage.getIncomelist().put(newIncome.getLocalDate(), newIncome);
                incomeStorage.saveToFile(newIncome);
                break;
            case 2:
                System.out.print("Ange kategori för utgift: \n" + "Food \n" + "Transportation \n" + "Amusement \n" + "Other \n");
                String expenseCategory = sc.next();

                System.out.println("Ange datum (DD/MM/YYYY) för utgift: ");
                String expLocalDate = sc.next();

                System.out.println("Ange summa för utgift: ");
                double expenseAmount = sc.nextDouble();

                Expense newExpense = new Expense(expLocalDate, expenseAmount, expenseCategory);

                expenseStorage.getExpenselist().put(newExpense.getLocalDate(), newExpense);
                expenseStorage.saveToFile(newExpense);
                break;
            case 3:
                System.out.println("Vänligen välj inkomst att ta bort genom att ange (DD/MM/YYYY): ");
                //här skrivs alla inkomster från hashmapen incomelist ut
                System.out.println(new Gson().toJson(incomeStorage.getIncomelist()).toString());
                //här anger användaren vilken inkomst dem vill ta bort via nyckeln (DD/MM/YYYY)
                incomeStorage.getIncomelist().remove(sc.next());
                //här skrivs nya inkomstlistan ut efter att inkomsten är borttagen
                System.out.println(new Gson().toJson(incomeStorage.getIncomelist()).toString());
                break;
            case 4:
                System.out.println("vänligen välj utgift att ta bort genom att ange (DD/MM/YYYY): ");
                System.out.println(new Gson().toJson(expenseStorage.getExpenselist()).toString());
                expenseStorage.getExpenselist().remove(sc.next());

                System.out.println(new Gson().toJson(expenseStorage.getExpenselist()).toString());
                break;
            case 5:

                double incomeTotal = 0;
                for (Income income : incomeStorage.getIncomelist().values()) {
                    System.out.println("Inkomster: " + income.getAmount());
                    /*Lägger till alla inkomster i en arraylista för att seden göra samma med utgifter och sen
                    subtrahera utgifter från inkomster*/
                    incomeSums.add(income.getAmount());
                    incomeTotal = 0;
                    for (double num : incomeSums) {
                        incomeTotal += num;

                    }

                }
                System.out.println("Totala inomster: " + incomeTotal);

                double expenseTotal = 0;
                for (Expense expense : expenseStorage.getExpenselist().values()) {
                    System.out.println("Utgifter: " + expense.getAmount());
                    expenseSums.add(expense.getAmount());
                    expenseTotal = 0;
                    for (double num : expenseSums) {
                        expenseTotal += num;

                    }

                }
                System.out.println("Totala utgifter " + expenseTotal);
                System.out.printf("Pengar kvar: ");
                System.out.println(incomeTotal - expenseTotal);

                break;
            case 6:
                System.exit(6);
                break;

        }

}

}


