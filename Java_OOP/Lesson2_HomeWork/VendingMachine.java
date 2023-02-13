package Lesson2_HomeWork;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> list;
    int maxValue;

    VendingMachine() {
        list = new ArrayList<>();
        maxValue = 4;
    }

    public void putProduct(String productName, double productPrice, String productType) {
        if (list.size() < maxValue) {
            Product pr = new Product(productName, productPrice, productType);
            list.add(pr);
        } else {
            System.out.println("Автомат полон, добавить новый продукт невозможно.");
        }

    }

    public void getStatus() {
        if (list.isEmpty()) {
            System.out.println("Автомат пустой");
            return;
        }
        for (Product pr : list) {
            System.out.printf("Имя продукта - %s, цена продукта - %.2f\n", pr.getName(), pr.getPrice());
        }

    }

    public void getProduct(String nameProduct) {
        if (list.isEmpty()) {
            System.out.println("Автомат пустой, купить нечего");
            return;
        }
        int check = checkProduct(nameProduct);
        if (check == -1) {
            System.out.println("Товар отсутвует");
        } else {
            System.out.println("Автомат выдаёт товар " + nameProduct);
            list.remove(check);
        }

    }

    private int checkProduct(String nameProduct) {
        int i = 0;
        for (Product pr : list) {
            if (pr.getName().equals(nameProduct)) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

}
