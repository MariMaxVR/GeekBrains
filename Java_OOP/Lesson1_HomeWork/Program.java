package Lesson1_HomeWork;

public class Program {

    public static void main(String[] args) throws InterruptedException {

        Car car1 = new Car("Ford Fiesta", 2010, 10000, "Black", 1.8, false);
        Car car2 = new Car("Mazda", 2012, 15500, "Green", 1.6, false);

        Car car3 = new Car();
        car3.getInfo();
        car3.setModel("Запорожец");
        car3.setYear(1988);
        car3.setPower(1.2);
        car3.getInfo();

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

        // car1.startRace(car1.getModel(), car2.getModel());

    }
}