
public class Laptop {

    private String id;
    private String trademark;
    private String ram_value;
    private String disk_value;
    private String oper_system;
    private String colour;

    public Laptop(String id, String trademark, String ram_value, String disk_value, String oper_system, String colour) {
        this.id = id;
        this.trademark = trademark;
        this.ram_value = ram_value;
        this.disk_value = disk_value;
        this.oper_system = oper_system;
        this.colour = colour;
    }

    public String getid() {
        return id;
    }

    public String gettrademark() {
        return trademark;
    }

    public String getram_value() {
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
        return "Ноутбук " + trademark + " ID номером в системе: " + id + ", объёмом ОЗУ: " + ram_value +
                "GB, объёмом диска: " + disk_value + "GB, с операционной система: " + oper_system +
                ", цвет корпуса: " + colour + "." + "\n";
    }

}