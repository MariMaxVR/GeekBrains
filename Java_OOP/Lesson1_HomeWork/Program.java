package Lesson1_HomeWork;

import java.util.Random;

public class Program {

    public static void main(String[] args) throws InterruptedException {

        Car car1 = new Car("Ford Fiesta", 2010, 10000, "Black", 1.8, false);
        Car car2 = new Car("Mazda", 2012, 15500, "Green", 1.6, false);

        car1.getInfo();
        car2.getInfo();

        car1.engineStatus(car1.getModel());
        car1.engineSwitch(car1.getModel());
        car1.road(car1.getModel(), "Москва");
        System.out.println();
        car2.engineStatus(car2.getModel());
        car2.road(car2.getModel(), "Санкт-Петербург");

        Car.carCompareYear(car1.getModel(), car1.getYear(), car2.getModel(), car2.getYear());
        Car.carComparePower(car1.getModel(), car1.getPower(), car2.getModel(), car2.getPower());

        // Program.startRace(car1.getModel(), car2.getModel());
    }

    /*
     * ДОП: Сделать гонки:
     * - задаём растояние
     * - едут до финиша.
     * Сказать кто победит.
     */

    public static void startRace(String carModel1, String carModel2) throws InterruptedException {
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
            System.out.println("Автомобиль " + carModel2 + " проехал " + distanceCar2 + " километров трассы");
            System.out.println("А автомобиль " + carModel1 + " проехал первым 100 км. трассы и победил в гонке!");
            Car.printStars();
        } else if (distanceCar2 >= distanceRace && distanceCar1 < distanceRace) {
            Car.printStars();
            System.out.println("Автомобиль " + carModel1 + " проехал " + distanceCar1 + " километров трассы");
            System.out.println("А автомобиль " + carModel2 + " проехал первым 100 км. трассы и победил в гонке!");
            Car.printStars();
        } else {
            Car.printStars();
            System.out.println("Автомобили финишировали одновременно!");
            Car.printStars();

        }
    }
}