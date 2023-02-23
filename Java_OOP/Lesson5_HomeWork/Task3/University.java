import java.util.ArrayList;

public class University {

    private ArrayList<Students> list = new ArrayList<>();

    public String addStudent(String name, int phone, int group) {

        Students student = new Students(name, phone, group);
        list.add(student);
        return "Студент добавлен.";

    }

    public String delStudent(String name, int phone) {
        boolean result = false;
        for (Students student : list) {
            if (student.getName().equals(name) && student.getPhone() == phone) {
                list.remove(student);
                result = true;
                break;
            }
        }
        if (result) {
            return "Студент удалён успешно";
        } else {
            return "Студент не обнаружен.";
        }

    }

    public String getList(int groupNumber) {
        String result = "Студенты группы: " + groupNumber + "\n";
        for (Students student : list) {
            if (student.getGroup() == groupNumber) {
                result += student.getName() + " " + student.getPhone() + "\n";

            }

        }
        return result;

    }
}
