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

    private String model;
    private int year;
    private double price;
    private String color;
    private double power;
    private boolean engineStatus;

    Car(String model, int year, double price, String color, double power) {
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

    public void setColor(String color) {
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public static void carCompareYear(String carModel1, int year1, String carModel2, int year2) {
        if (year1 > year2) {
            System.out.printf("Автомобиль %s выпущен с завода позже, чем автомобиль %s.\n",
                    carModel1, carModel2);
        } else if (year1 == year2) {
            System.out.println("Автомобили одного года выпуска с завода.");
        } else {
            System.out.printf("Автомобиль %s выпущен с завода позже, чем автомобиль %s.\n",
                    carModel2, carModel1);
        }
    }

    public static void carComparePower(String carModel1, double engPower1, String carModel2, double engPower2) {
        if (engPower1 > engPower2) {
            System.out.printf("Автомобиль %s имеет более мощный мотор, чем автомобиль %s.\n",
                    carModel1, carModel2);

        } else if (engPower1 == engPower2) {
            System.out.println("Одинаковая мощность моторов автомобилей.");
        } else {
            System.out.printf("Автомобиль %s имеет более мощный мотор, чем автомобиль %s.\n",
                    carModel2, carModel1);
        }
    }

    public void Beep() {
        System.out.println("<<Автомобиль сигналит>>");
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

    public static void printStars() {
        System.out.println("****************************************");
    }
}
