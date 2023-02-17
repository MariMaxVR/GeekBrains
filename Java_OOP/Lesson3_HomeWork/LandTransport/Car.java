package Lesson3_HomeWork.LandTransport;

public class Car extends LandTransport {

    private int fuelType;
    private String model;

    public Car(String type, String model, int maxCapacity, String color, int fuelType, int countOfWheels) {
        super(type, model, maxCapacity, color, countOfWheels);
        this.fuelType = fuelType;

    }

    public Car(int fuelType, String model) {
        this.fuelType = fuelType;
        this.model = model;
    }

    public int getFuelType() {
        return fuelType;
    }

    public String getModel() {
        return model;
    }

    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Автомобиль " + super.getModel() + " " + "Тип топлива: " + fuelType;
    }

    @Override
    public void Beep() {

        System.out.println("<<<Автомобиль сигналит>>>");
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель автомобиля заведён, можно ехать!");
    }

    @Override
    public void refueling() {
        System.out.println("Автомобиль заправляется.");
    }

}
