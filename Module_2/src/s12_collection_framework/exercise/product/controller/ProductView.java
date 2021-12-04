package s12_collection_framework.exercise.product.controller;

import s12_collection_framework.exercise.product.service.IProductManager;
import s12_collection_framework.exercise.product.service.ProductManagerService;

import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {
        displayMainMenu();
    }
     static void displayMainMenu() {
        IProductManager iProductManager = new ProductManagerService();

        int choice = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add new product \n " +
                    "2. Edit a product \n " +
                    "3. Delete a product \n " +
                    "4. Display list product \n " +
                    "5. Search product \n " +
                    "6. Sort product \n " +
                    "7. Return main menu \n");
            System.out.print("Enter your choice : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductManager.addProduct();
                    break;
                case 2:
                    iProductManager.editProduct();
                    break;
                case 3:
                    iProductManager.deleteProduct();
                    break;
                case 4:
                    iProductManager.displayProduct();
                    break;
                case 5:
                    iProductManager.searchProduct();
                    break;
                case 6:
                    iProductManager.sortProduct();
                    iProductManager.displayProduct();
                    break;
                case 7:
                    displayMainMenu();
                    break;

            }
        } while (choice > 0 && choice <= 7);
    }
}
