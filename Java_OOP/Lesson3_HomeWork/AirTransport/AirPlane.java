package Lesson3_HomeWork.AirTransport;



public class AirPlane extends AirTransport {

    private int flightNumber;

    public AirPlane(String type, String model, int maxCapacity, String color, int countOfEngines, int howManyPilots,
            int flightNumber) {
        super(type, model, maxCapacity, color, countOfEngines, howManyPilots);
        this.flightNumber = flightNumber;

    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "AirPlane [flightNumber=" + flightNumber + "]";
    }

    @Override
    public void Beep() {
        System.out.println("Самолёт " + AirPlane.super.getModel() + " как-то сигналит");
    }

    @Override
    public void startEngine() {
        System.out.println("Старт двигателей самолёта");
    }

    @Override
    public void lightsOn() {
        System.out.println("У самолёта зажглись бортовые огни");
    }

}
