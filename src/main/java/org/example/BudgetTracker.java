package org.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args) throws IOException {
        TryCatch tryCatch1 = new TryCatch();
        Scanner sc = new Scanner(System.in);
        User user1 = new User("Bengt", "Bengtsson");
        System.out.println("Användare: " + user1.getFirstName() + " " + user1.getLastName());

        System.out.println("Välkommen till Budgify, din personliga budgettapp! Vänligen välj ett av följande val:\n" + "1. Lägg till inkomst\n" + "2. Lägg till utgift\n" + "3. Ändra inkomst\n" + "4. Ändra utgift\n" + "5. Se budget\n");
        int choice = tryCatch1.tryCatch1();

        switch (choice) {
            case 1:

                break;
            case 2:
                Scanner input = new Scanner(System.in);
                String expenseCategory = "";
                String localDate = "";
                double amount = 0;
                ExpenseStorage expenseStorage = new ExpenseStorage();
                expenseStorage.readFile();
                Expense expense = new Expense(expenseCategory, localDate, amount);
                HashMap<Expense, String> expenses = new HashMap<>();
                System.out.print("Ange kategori för utgift: \n" + "Food \n" + "Transportation \n" + "Amusement \n" + "Other \n");
                expenseCategory = input.nextLine();


               System.out.println("Ange datum (DD/MM/YYYY) för utgift: ");
               localDate = input.nextLine();

                System.out.println("Ange summa för utgift: ");
                amount = input.nextDouble();

                expenses.put(new Expense(expenseCategory, localDate, amount), expense.toString());
                expenseStorage.saveToFile(expense);

                for(Map.Entry<Expense, String> entry : expenses.entrySet()) {
                System.out.println("Lista av utgifter: " );
                    System.out.println(entry.getKey());
                break;
                }
            case 3:
                System.out.println("Vänligen välj inkomst att ändra eller ta bort.");
                // Här listas användarens inkomster
                break;
            case 4:
                input = new Scanner(System.in);
                expenseCategory = "";
                localDate = "";
                amount = 0;
                expenseStorage = new ExpenseStorage();
                expenseStorage.readFile();
                expense = new Expense(expenseCategory, localDate, amount);
                expenses = new HashMap<>();
                for(Map.Entry<Expense, String> entry : expenses.entrySet()) {
                    System.out.println("Vänligen välj utgift att ändra eller ta bort: " );
                    System.out.println(entry.getKey());

                // Här listas användarens utgifter
                break;
                }
                    case 5:
                        break;

        }
    }
    }



