package s17_io_binary_file_serialization.exercise.controller;

import s17_io_binary_file_serialization.exercise.service.IProduct;
import s17_io_binary_file_serialization.exercise.service.ProductService;

import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {
        displayMenu();
    }
    static void displayMenu() {
        IProduct iProduct = new ProductService();
        int choice;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add new product \n " +
                    "2. Display list product \n" +
                    "3. Search product \n " +
                    "4. Exit");
            System.out.print("Enter your choice : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iProduct.add();
                    break;
                case 2:
                    iProduct.showAll();
                    break;
                case 3:
                    iProduct.findProduct();
                    break;
            }
        } while(choice > 0 && choice < 4);
    }
}
