package Lesson2_HomeWork;

public class Program {

    public static void main(String[] args) {

        VendingMachine vendine1 = new VendingMachine();

        vendine1.putProduct("Snickers", 75.80, "Chocolate");
        vendine1.putProduct("CocaCola", 89.50, "Soda");
        vendine1.putProduct("Chernogolovka", 80.10, "Russian Soda");
        vendine1.putProduct("Alyonka", 100, "Russian Chocolate");

        vendine1.getStatus();
        System.out.println();

        vendine1.getProduct("CocaCola");

        System.out.println();
        vendine1.getStatus();

        vendine1.putProduct("CocaCola", 93.50, "Soda");
        vendine1.putProduct("CocaCola", 89.50, "Soda");

        System.out.println();
        vendine1.getStatus();
        System.out.println();

        vendine1.getProduct("Alyonka");

        System.out.println();
        vendine1.getStatus();
    }
}