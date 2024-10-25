package org.example;

import java.io.IOException;
import java.util.Scanner;

public class BudgetTracker {

    public static void main(String[] args) throws IOException {
        // det räcker att du har en Scanner som definieras högst upp, du kan använda den i hela programmet
        // definiera även alla dina objekt av klasser här uppe sam läs in filerna så du är säker på att pgroammet läst in båda
        // filerna innan det går vidare. Kommenterade bara ut där du definierad IncomeStorage och ExpenseStorage tidigare
        TryCatch tryCatch1 = new TryCatch();
        Scanner sc = new Scanner(System.in);
        // definiera här upp
        IncomeStorage incomeStorage = new IncomeStorage();
        incomeStorage.readFile();

        ExpenseStorage expenseStorage = new ExpenseStorage();
        expenseStorage.readFile();

        User user1 = new User("Bengt", "Bengtsson");
        System.out.println("Användare: " + user1.getFirstName() + " " + user1.getLastName());

        System.out.println("Välkommen till Budgify, din personliga budgettapp! Vänligen välj ett av följande val:\n" + "1. Lägg till inkomst\n" + "2. Lägg till utgift\n" + "3. Ändra inkomst\n" + "4. Ändra utgift\n" + "5. Se budget\n");
        int choice = tryCatch1.tryCatch1();

        switch (choice) {
            case 1:
                // HELENA: du sparar lite kod om du inte definirar variabler här utan direkt
                // när du tar emot input. Du måste också ha olika variabelnamn i dina cases du kan
                // inte använda samma

               // Scanner input1 = new Scanner(System.in);
               // String incomeCategory = "";
               // double amount = 0;

                //Kallar på klassen IncomeStorage för att använda metoderna där
               // IncomeStorage incomeStorage = new IncomeStorage();
                //incomeStorage.readFile();

                System.out.println("Ange kategori för inkomst: \n" + "Salary \n" + "Gift \n" + "Other \n");
                String incomeCategory = sc.next();
                // ändrade till next() istället för nextLine() tror det hoppar över annars

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
                //Scanner input = new Scanner(System.in);
                //String expenseCategory = "";
                //double amount = 0;
                // Se kommentarer i "case 1", använder samma kod och metoder
               // ExpenseStorage expenseStorage = new ExpenseStorage();
               // expenseStorage.readFile();

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
                System.out.println("Vänligen välj inkomst att ändra eller ta bort.");
                System.out.println("Lista av inkomster: ");
                System.out.println();

                // Här listas användarens inkomster
                break;
            case 4:
                // HELENA: städa upp här inne börja med att skriva stegvis vad det är du behöver göra tex:

                // steg 1: visa alla utgifter för användaren
                // steg 2: be användaren välja en utgift (kanske baserat på datum eller nåt annat? bör vara unikt)
                // steg 3: efter input från användaren hämta specifik utgift, här kan du använda get() som till HashMap
                // du skickar in nyckeln du vill hämta i get metoden.
                // och så vidare...


              //  input = new Scanner(System.in);
                expenseCategory = "";
                localDate = "";
             //   amount = 0;
             //   expenseStorage = new ExpenseStorage();
              //  expenseStorage.readFile();
                //expense = new Expense(localDate, amount, expenseCategory);
                // ändrade ordning för att matcha konstructorn och tog bort...

               /* for(Map.Entry<Expense, String> entry : expenses.entrySet()) {
                    System.out.println("Vänligen välj utgift att ändra eller ta bort: " );
                    System.out.println(entry.getKey());
*/
                // flytta det här till din Expensestorage där din faktiska lista finns
                // alltså expenselist
                // Här listas användarens utgifter
                break;
               // }
            // du har en hel del } på helt fel plats. break avslutar switch case
                    case 5:
                        break;

        }
    }
    }



