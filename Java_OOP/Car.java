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

    int year;
    String model;
    double price;
    String color;
    double power;
    boolean engineStatus;

    Car(String model, int year, double price, String color, double power, boolean engineStatus) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.engineStatus = false;
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
     * * 3) Доработайте класс Car.
     * В классе должна храниться следующая информация:
     * Свойство - которое говорит заведен авто или нет
     * Метод - запуска автомобиля
     * Метод - остановки автомобиля
     * Метод дороги - при вызове, в качестве аргумента передаем место назначения
     * И если авто заведён - выводим, что мы на такой-то авто едем место назначения
     * Если не заведён - сообщить, что авто не заведено. И мы не можем ехать
     */

    public void engineStatus() {
        if (this.engineStatus == false) {
            System.out.println("Двигатель автомобиля не запущен, движение невозможно.");
        } else {
            System.out.println("Двигатель автомобиля запущен, можно ехать.");
        }
    }

    public void engineSwitch() {
        if (engineStatus == false) {
            engineStatus = true;
            System.out.println("Двигатель запущен!");

        } else {
            engineStatus = false;
            System.out.println("Двигатель остановлен!");
        }
    }

    public void road(String endpoint) {
        if (engineStatus) {
            System.out.println("Машина заведена, едем до места назначения " + "\"" + endpoint + "\"" + ".");
        } else {
            System.out.println("Для движения необходимо запустить двигатель автомобиля.");
        }
    }

    /*
     * Доработайте программу в свободном стиле.
     * Можно сравнить 2 автомобиля между собой
     * Или пусть авто заедет за фруктами :-)
     * Добавьте несколько произвольных методов и свойств
     * 
     */

    Random random = new Random();

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

    public void startRace(Object carModel1, Object carModel2) {
        int distanceRace = 100;
        int distanceCar1 = 0;
        int distanceCar2 = 0;
        System.out.println("Гонка на 100 километров началась!");

        while (distanceCar1 < distanceRace && distanceCar2 < distanceRace) {
            distanceCar1 += random.nextInt(3, 10);
            distanceCar2 += random.nextInt(3, 10);
            if (distanceCar1 < distanceRace && distanceCar2 < distanceRace) {
                System.out.println("Автомобиль " + carModel1 + " проехал " + distanceCar1 + " километров трассы");
                System.out.println("Автомобиль " + carModel2 + " проехал " + distanceCar2 + " километров трассы");
            } else if (distanceCar1 >= distanceRace && distanceCar2 < distanceRace) {
                System.out.println("Автомобиль " + carModel1 + " проехал первым 100 км. трассы и победил в гонке!");
            } else if (distanceCar2 >= distanceRace && distanceCar1 < distanceRace) {
                System.out.println("Автомобиль " + carModel2 + " проехал первым 100 км. трассы и победил в гонке!");
            } else
                System.out.println("Автомобили финишировали одновременно!");

            System.out.println();
        }

    }

}
