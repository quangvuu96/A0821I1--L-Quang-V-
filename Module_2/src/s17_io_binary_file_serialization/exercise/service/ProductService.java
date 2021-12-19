package s17_io_binary_file_serialization.exercise.service;

import s17_io_binary_file_serialization.exercise.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProduct {
    static List<Product> productServiceArrayList = new ArrayList<Product>();

    Scanner scanner = new Scanner(System.in);
    static {
        productServiceArrayList = readDataFromFile("E:\\QuangVu\\cntt\\A0821I1\\Module_2\\src\\s17_io_binary_file_serialization\\exercise\\products.txt");
    }
    public static void writeToFile(String path, List<Product> products){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }
    @Override
    public void add() {
        int id;
        if (productServiceArrayList.size() == 0) {
            id = 0;
        } else {
            id = productServiceArrayList.get(productServiceArrayList.size() - 1).getId() + 1;
        }
        System.out.print("Enter name of product : ");
        String name = scanner.nextLine();
        System.out.print("Enter brand of product : ");
        String brand = scanner.nextLine();
        System.out.print("Enter price of product : ");
        int price = Integer.parseInt(scanner.nextLine());
        productServiceArrayList.add(new Product(id, name, brand, price));
        writeToFile("E:\\QuangVu\\cntt\\A0821I1\\Module_2\\src\\s17_io_binary_file_serialization\\exercise\\products.txt",productServiceArrayList);
        System.out.println("Add completed !");
    }

    @Override
    public void showAll() {
        List<Product> products = readDataFromFile("E:\\QuangVu\\cntt\\A0821I1\\Module_2\\src\\s17_io_binary_file_serialization\\exercise\\products.txt");
        for (Product product : products){
            System.out.println(product);
        }
    }

    @Override
    public void findProduct() {
        List<Product> res = new ArrayList<>();
        System.out.println("Enter product name : ");
        String name = scanner.nextLine();
        int size = productServiceArrayList.size();
        for (int i = 0; i < size; i++) {
            if(productServiceArrayList.get(i).getName().contains(name)){
                res.add(productServiceArrayList.get(i));
            }
        }
        System.out.println(res);
    }

}
