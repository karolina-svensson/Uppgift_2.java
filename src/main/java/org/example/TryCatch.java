package org.example;

import java.util.Scanner;

public class TryCatch {
    public int tryCatch1() {
        int choice = 0;
        while (choice <= 0 || choice > 5) {
            try {
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
                if (choice <= 0 || choice > 5) {
                    System.out.println("Vänligen ange siffra 1-5!");
                }
            } catch (Exception e) {
                System.out.println("Vänligen ange siffra 1-5!");
            } finally {

            }
        }
        return choice;
    }
}
