package Lesson3_HomeWork.AirTransport;

import Lesson3_HomeWork.Transport;

public class AirTransport extends Transport {

    int countOfEngines;
    int howManyPilots;

    public AirTransport(String type, String model, int maxCapacity, String color, int countOfEngines,
            int howManyPilots) {
        super(type, model, maxCapacity, color);
        this.countOfEngines = countOfEngines;
        this.howManyPilots = howManyPilots;

    }

    @Override
    public void Beep() {
        // Можно переопределить метод, но пока не имеет смысла так как данный клас не
        // конкретный.
        super.Beep();
    }

    @Override
    public void startEngine() {
        // Можно переопределить метод, но пока не имеет смысла так как данный клас не
        // конкретный.
        super.startEngine();
    }

    public void lightsOn() {
        
    }
}
