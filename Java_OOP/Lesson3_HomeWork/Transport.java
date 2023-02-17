package Lesson3_HomeWork;

public class Transport {

    private String type;
    private String model;
    private int maxCapacity;
    private String color;

    
    public Transport(String type, String model, int maxCapacity, String color) {
        this.type = type;
        this.model = model;
        this.maxCapacity = maxCapacity;
        this.color = color;
    }

    public Transport(){
        
    }

    public void Beep() { //"Какой-то метод" обозначающий, к примеру, сигнал, который должен быть создан в наследниках

    }

    public void startEngine() { //"Какой-то метод" обозначающий включение двигателя, также для наследников.

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
