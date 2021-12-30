package final_exam.controllers;


import final_exam.services.BankAccount;
import final_exam.services.IAccountManager;

import java.util.Scanner;

public class AccountView {
    public static void main(String[] args) {
        displayMainMenu();
    }

    static void displayMainMenu() {
        IAccountManager iAccountManager = new BankAccount();
        int choice = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("BANK ACCOUNT MANAGEMENT PROGRAM ");
            System.out.println("1. Add new account \n " +
                    "2. Delete account \n " +
                    "3. Display list account \n " +
                    "4. Search account \n " +
                    "5. Return main menu \n");
            System.out.print("Enter your choice : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iAccountManager.add();
                    break;
                case 2:
                    iAccountManager.delete();
                    break;
                case 3:
                    iAccountManager.getAll();
                    break;
                case 4:
                    iAccountManager.search();
                    break;
                case 5:
                    AccountView.displayMainMenu();
                    break;


            }
        } while (choice > 0 && choice <= 5);
    }
}
