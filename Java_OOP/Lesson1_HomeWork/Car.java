package Lesson1_HomeWork;

import java.util.Random;

public class Car {

    /*
     * 1) Напишите класс Car.
     * В классе должна храниться следующая информация:
     * название автомобиля - model;
     * год выпуска - year;
     * стоимость - price;
     * цвет - color;
     * объем двигателя - power.
     */

    String model;
    int year;
    double price;
    String color;
    double power;
    boolean engineStatus;

    Car() {

    }

    Car(String model, int year, double price, String color, double power, boolean engineStatus) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.engineStatus = engineStatus;
    }

    /*
     * 2) Доработайте класс Car.
     * Добавьте в класс Car метод getInfo без параметров, который будет печать на
     * экране значения полей объекта класса model, power и year.
     */

    public void getInfo() {
        System.out.println("Модель - " + model + ", объём двигателя = " + power + ", год выпуска: " + year);
    }

    /*
     * 3) Доработайте класс Car.
     * В классе должна храниться следующая информация:
     * Свойство - которое говорит заведен авто или нет
     * Метод - запуска автомобиля
     * Метод - остановки автомобиля
     * Метод дороги - при вызове, в качестве аргумента передаем место назначения
     * И если авто заведён - выводим, что мы на такой-то авто едем место назначения
     * Если не заведён - сообщить, что авто не заведено. И мы не можем ехать
     */

    public void engineStatus(String carModel) {
        if (engineStatus == false) {
            System.out.println("Двигатель автомобиля " + carModel + " не запущен, движение невозможно!");
        } else {
            System.out.println("Двигатель автомобиля " + carModel + " запущен, можно ехать.");
        }
    }

    public void engineSwitch(String carModel) {
        if (engineStatus) {
            engineStatus = false;
            System.out.printf("Вы приехали, двигатель автомобиля %s остановлен.\n", carModel);

        } else {
            engineStatus = true;
            System.out.printf("Двигатель автомобиля %s запущен, можно ехать!\n", carModel);
            Beep();
        }
    }

    public void road(String carModel, String endpoint) {
        if (engineStatus) {
            System.out.printf("Машина %s заведена, едем до места назначения " + "\"" + endpoint + "\"" + ".\n",
                    carModel);
            driverHungry();
            engineSwitch(carModel);
        } else {
            System.out.println("Движение невозможно. Для начала движения необходимо запустить двигатель автомобиля.");
        }
    }

    /*
     * Доработайте программу в свободном стиле.
     * Можно сравнить 2 автомобиля между собой
     * Или пусть авто заедет за фруктами :-)
     * Добавьте несколько произвольных методов и свойств
     */

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double getPower() {
        return power;
    }

    public static void carCompareYear(String carModel1, int year1, String carModel2, int year2) {
        if (year1 > year2) {
            System.out.printf("Автомобиль %s выпущен с завода позже, чем автомобиль %s.\n",
                    carModel1, carModel2);
        } else {
            System.out.printf("Автомобиль %s выпущен с завода позже, чем автомобиль %s.\n",
                    carModel2, carModel1);
        }
    }

    public static void carComparePower(String carModel1, double engPower1, String carModel2, double engPower2) {
        if (engPower1 > engPower2) {
            System.out.printf("Автомобиль %s имеет более мощный мотор, чем автомобиль %s.\n",
                    carModel1, carModel2);
        } else {
            System.out.printf("Автомобиль %s имеет более мощный мотор, чем автомобиль %s.\n",
                    carModel2, carModel1);
        }
    }

    public void Beep() {
        System.out.println("<Автомобиль сигналит>");
    }

    static Random random = new Random();

    public void driverHungry() {
        int x = random.nextInt(0, 2);
        if (x == 0) {
            System.out.println("Водитель не голоден, едем дальше!");
        } else if (x == 1) {
            System.out.println("Водитель проголодался и заехал перекусить.");
        }
    }

    /*
     * ДОП: Сделать гонки:
     * - задаём растояние
     * - едут до финиша.
     * Сказать кто победит.
     */

    public static void printStars() {
        System.out.println("****************************************");
    }

    public static void startRace(String carModel1, String carModel2) throws InterruptedException {
        int distanceRace = 100;
        int distanceCar1 = 0;
        int distanceCar2 = 0;
        System.out.println("Гонка на 100 километров началась!");
        printStars();

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
            printStars();
            System.out.println("Автомобиль " + carModel2 + " проехал " + distanceCar2 + " километров трассы");
            System.out.println("А автомобиль " + carModel1 + " проехал первым 100 км. трассы и победил в гонке!");
            printStars();
        } else if (distanceCar2 >= distanceRace && distanceCar1 < distanceRace) {
            printStars();
            System.out.println("Автомобиль " + carModel1 + " проехал " + distanceCar1 + " километров трассы");
            System.out.println("А автомобиль " + carModel2 + " проехал первым 100 км. трассы и победил в гонке!");
            printStars();
        } else {
            printStars();
            System.out.println("Автомобили финишировали одновременно!");
            printStars();
        }

    }

}