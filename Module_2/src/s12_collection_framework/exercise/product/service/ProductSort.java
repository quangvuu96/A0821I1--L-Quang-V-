package s12_collection_framework.exercise.product.service;

import s12_collection_framework.exercise.product.model.Product;

import java.util.Comparator;

public class ProductSort implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() == o2.getPrice()) {
            return o1.getNameProduct().compareTo(o2.getNameProduct());
        }
        return o1.getPrice() - o2.getPrice();
    }
}
