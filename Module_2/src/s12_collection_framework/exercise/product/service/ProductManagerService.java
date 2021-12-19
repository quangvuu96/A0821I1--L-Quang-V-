package s12_collection_framework.exercise.product.service;

import s12_collection_framework.exercise.product.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManagerService implements IProductManager {
    ArrayList<Product> productArrayList = new ArrayList<Product>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addProduct() {
        int id;
        if (productArrayList.size() == 0) {
            id = 0;
        } else {
            id = productArrayList.get(productArrayList.size() - 1).getId() + 1;
        }
        System.out.println("Enter name of Product : ");
        String nameProduct = scanner.nextLine();
        System.out.println("Enter price of Product : ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, nameProduct, price);
        productArrayList.add(product);
        System.out.println("Created successful !");
    }

    @Override
    public void editProduct() {
        System.out.println("Enter ID Product : ");
        int input = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == input) {
                System.out.println("Enter name : ");
                productArrayList.get(i).setNameProduct(scanner.nextLine());
                System.out.println("Enter price : ");
                productArrayList.get(i).setPrice(Integer.parseInt(scanner.nextLine()));

                System.out.println("Edited successful !");
                check = false;
                break;
            }
        }
        if (check) System.out.println("Product not found !!!");
    }

    @Override
    public void deleteProduct() {
        System.out.println("Enter ID : ");
        int inputDelete = Integer.parseInt(scanner.nextLine());
        int size = productArrayList.size();
        for (int i = 0; i < size; i++) {
            if (productArrayList.get(i).getId() == inputDelete) {
                productArrayList.remove(i);
                break;
            }
        }
    }

    @Override
    public void displayProduct() {
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println(productArrayList.get(i).toString());
        }
    }


    @Override
    public void searchProduct() {
        System.out.println("Enter Product name : ");
        String name = scanner.nextLine();
        int size = productArrayList.size();
        for (int i = 0; i < size; i++) {
            if (productArrayList.get(i).getNameProduct().contains(name)) {
                System.out.println(productArrayList.get(i).toString());
            }
        }
    }

    @Override
    public void sortProduct() {
        Collections.sort(productArrayList, new ProductSort());
    }


}
