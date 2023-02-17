package Lesson3_HomeWork.AirTransport;

public class Helicopter extends AirTransport {



    public Helicopter(String type, String model, int maxCapacity, String color, int countOfEngines, int howManyPilots) {
        super(type, model, maxCapacity, color, countOfEngines, howManyPilots);
        
    }

    @Override
    public String toString() {
        return "Вертолёт модель " + super.getModel();
    }

    @Override
    public void Beep() {
        System.out.println("Вертолёт как-то сигналит");
    }

    @Override
    public void lightsOn() {
        System.out.println("Включение опозновательных огней вертолёта");
    }

    @Override
    public void startEngine() {
        System.out.println("Вертолёт заводится");
    }


    //Личные методы класса Helicopter
    public void up(){ 
        System.out.println("Вертолёт поднимается");
    }

    public void down(){ 
        System.out.println("Вертолёт опускается");
    }

  
    
    
}
