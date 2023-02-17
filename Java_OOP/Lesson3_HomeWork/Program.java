package Lesson3_HomeWork;

import Lesson3_HomeWork.AirTransport.AirPlane;
import Lesson3_HomeWork.AirTransport.Helicopter;
import Lesson3_HomeWork.LandTransport.Car;

public class Program {

    public static void main(String[] args) {

        Car car1 = new Car("Легковой", "Ford Fiesta", 5, "black", 92, 4);

        car1.Beep();
        car1.refueling();
        System.out.println(car1);
        System.out.println();
        AirPlane airplane1 = new AirPlane("Пассажирский", "Ту-154", 200, "white", 3, 2, 888);

        airplane1.Beep();
        airplane1.lightsOn();
        System.out.println(airplane1);
        System.out.printf("Количество пилотов: %d \n", airplane1.getHowManyPilots());
        System.out.println();

        Helicopter helicopter1 = new Helicopter("Военный", "Ми-8", 16, "green", 1, 2);

        helicopter1.Beep();
        helicopter1.up();
        helicopter1.setModel("Ка-50");
        System.out.println(helicopter1);
    }
}
