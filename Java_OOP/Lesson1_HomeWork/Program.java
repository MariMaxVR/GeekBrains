package Lesson1_HomeWork;

import java.util.Random;

public class Program {

    public static void main(String[] args) throws InterruptedException {

        Car car1 = new Car("Ford", 2010, 10000, "Black", 1.8);
        Car car2 = new Car("Mazda", 2012, 15500, "Green", 1.4);

        car1.getInfo();
        car2.getInfo();

        car1.setModel("Ford Fiesta");
        car2.setPower(1.6);

        System.out.println();

        car1.getInfo();
        car2.getInfo();

        System.out.println();

        car1.engineStatus(car1.getModel());
        car1.engineSwitch(car1.getModel());
        car1.road(car1.getModel(), "Москва");

        System.out.println();

        car2.engineStatus(car2.getModel());
        car2.road(car2.getModel(), "Санкт-Петербург");

        System.out.println();

        Car.carCompareYear(car1.getModel(), car1.getYear(), car2.getModel(), car2.getYear());
        Car.carComparePower(car1.getModel(), car1.getPower(), car2.getModel(), car2.getPower());

        // Гонка между двумя автомобилями:

        Program.startRace(car1.getModel(), car2.getModel());
    }

    private static void startRace(String carModel1, String carModel2) throws InterruptedException {
        Random random = new Random();
        int distanceRace = 100;
        int distanceCar1 = 0;
        int distanceCar2 = 0;
        System.out.println("Гонка на 100 километров началась!");
        Car.printStars();

        while (distanceCar1 < distanceRace && distanceCar2 < distanceRace) {
            distanceCar1 += random.nextInt(3, 15);
            distanceCar2 += random.nextInt(3, 15);

            if (distanceCar1 < distanceRace && distanceCar2 < distanceRace)
                System.out.println("Автомобиль " + carModel1 + " проехал " + distanceCar1 + " километров трассы");
            if (distanceCar2 < distanceRace && distanceCar1 < distanceRace)
                System.out.println("Автомобиль " + carModel2 + " проехал " + distanceCar2 + " километров трассы");
            Thread.sleep(1000);
            System.out.println();
        }
        if (distanceCar1 >= distanceRace && distanceCar2 < distanceRace) {
            Car.printStars();
            System.out.println("Автомобиль " + carModel2 + " успел проехать " + distanceCar2 + " километров трассы");
            System.out.println("А автомобиль " + carModel1 + " проехал первым 100 км. трассы и победил в гонке!");
            Car.printStars();
        } else if (distanceCar2 >= distanceRace && distanceCar1 < distanceRace) {
            Car.printStars();
            System.out.println("Автомобиль " + carModel1 + " успел проехать " + distanceCar1 + " километров трассы");
            System.out.println("А автомобиль " + carModel2 + " проехал первым 100 км. трассы и победил в гонке!");
            Car.printStars();
        } else {
            Car.printStars();
            System.out.println("Автомобили финишировали одновременно!");
            Car.printStars();

        }
    }
}