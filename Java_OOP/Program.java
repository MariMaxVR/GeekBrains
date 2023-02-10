public class Program {

    public static void main(String[] args) {

    
        Car car1 = new Car("Ford Fiesta", 2010, 10000,"Black", 1.6, false);
        Car car2 = new Car("Mazda", 2012, 15500,"Green",1.8, false);

        car1.startRace(car1.model, car2.model);
       
    }
}