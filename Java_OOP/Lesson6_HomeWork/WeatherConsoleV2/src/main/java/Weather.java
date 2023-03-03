public class Weather {

    private Current current;
    private Location location;

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Город " + location.getName() + "\"" + "\n" +
                "Температура: " + current.getTemperature() + "\n" +
                "Дата: " + current.getObservation_time() + "\"" + "\n" +
                "Давление: " + current.getPressure() + "\n" +
                "humidity: " + current.getHumidity() + "\n" +
                "Расположен на широте: " + location.getLat() + "\"" + "\n" +
                "Расположен на долготе: " + location.getLon() + "\"";

    }
}
