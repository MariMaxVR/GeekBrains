package Lesson3_HomeWork;

public class LandTransport extends Transport {

    int countOfWheels;

    public LandTransport(String type, String model, int maxCapacity, String color, int countOfWheels) {
        super(type, model, maxCapacity, color);
        this.countOfWheels = countOfWheels;

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

    public void refueling() {

    }

}
