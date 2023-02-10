
public class Laptop {

    String id;
    String trademark;
    String ram_value;
    String disk_value;
    String oper_system;
    String colour;

    Laptop(String id, String trademark, String ram_value, String disk_value, String oper_system, String colour) {
        this.id = id;
        this.trademark = trademark;
        this.ram_value = ram_value;
        this.disk_value = disk_value;
        this.oper_system = oper_system;
        this.colour = colour;
    }

    public String getID() {
        return id;
    }

    public String getTrademark() {
        return trademark;
    }

    public String getRamValue() {
        return ram_value;
    }

    public String getHardDisk() {
        return disk_value;
    }

    public String getOperatingSystem() {
        return oper_system;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Ноутбук " + trademark + " c ID номером в системе: " + id + ", объёмом ОЗУ: " + ram_value +
                "GB, объёмом диска: " + disk_value + "GB, операционной система: " + oper_system +
                ", Цвет корпуса: " + colour + "." + "\n";
    }

}