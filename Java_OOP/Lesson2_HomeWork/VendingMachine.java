package Lesson2_HomeWork;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> listOfProducts;
    int maxLoadMachine;

    VendingMachine() {
        listOfProducts = new ArrayList<>();
        maxLoadMachine = 4;

    }

    public void putProduct(String productName, double productPrice, String productType) {
        if (listOfProducts.size() < maxLoadMachine) {
            Product pr = new Product(productName, productPrice, productType);
            listOfProducts.add(pr);
        } else {
            System.out.println("Автомат полон, добавить новый продукт невозможно.");
        }
    }

    public void getStatus() {
        if (listOfProducts.isEmpty()) {
            System.out.println("Автомат пустой, ничего купить нельзя.");
            return;
        }
        for (Product pr : listOfProducts) {
            System.out.printf("Имя продукта - %s, цена продукта - %.2f\n", pr.getName(), pr.getPrice());
        }
    }

    public void getProduct(String nameProduct) {
        int check = checkProduct(nameProduct);
        if (listOfProducts.isEmpty()) {
            System.out.println("Автомат пустой, ничего купить нельзя.");
        } else if (check == -1) {
            System.out.println("Такой товар в автомате отсутвует.");
        } else {
            System.out.println("***Автомат выдаёт товар " + nameProduct + "***");
            listOfProducts.remove(check);
        }

    }

    private int checkProduct(String nameProduct) {
        int i = 0;
        for (Product product : listOfProducts) {
            if (product.getName().equals(nameProduct)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }
}
