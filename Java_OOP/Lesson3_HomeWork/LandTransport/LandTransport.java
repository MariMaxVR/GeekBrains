package Lesson3_HomeWork.LandTransport;

import Lesson3_HomeWork.Transport;

public class LandTransport extends Transport {
    String type;
    int countOfWheels;

    public LandTransport(String type, String model, int maxCapacity, String color, int countOfWheels) {
        super(type, model, maxCapacity, color);
        this.countOfWheels = countOfWheels;

    }

    public LandTransport(){
        
    }

    @Override
    public void Beep() {
        // Можно переопределить метод, но пока не имеет смысла так как данный класс не
        // конкретный.
        super.Beep();
    }

    @Override
    public void startEngine() {
        // Можно переопределить метод, но пока не имеет смысла так как данный класс не
        // конкретный.
        super.startEngine();
    }

    public void refueling() {

    }

}
