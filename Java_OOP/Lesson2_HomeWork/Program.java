package Lesson2_HomeWork;

public class Program {

    public static void main(String[] args) {

        VendingMachine vm1 = new VendingMachine();

        vm1.putProduct("Snickers", 75.80, "Chocolate");
        vm1.putProduct("CocaCola", 89.50, "Soda");
        vm1.putProduct("Chernogolovka", 80.10, "Russian Soda");
        vm1.putProduct("Alyonka", 100, "Russian Chocolate");

        vm1.getStatus();
        System.out.println();

        vm1.getProduct("CocaCola");

        System.out.println();
        vm1.getStatus();

        vm1.putProduct("CocaCola", 93.50, "Soda");
        vm1.putProduct("CocaCola", 89.50, "Soda");

        System.out.println();
        vm1.getStatus();
        System.out.println();

        vm1.getProduct("Alyonka");

        System.out.println();
        vm1.getStatus();
    }
}