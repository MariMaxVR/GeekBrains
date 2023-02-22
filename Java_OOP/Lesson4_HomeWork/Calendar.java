package Lesson4_HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

    private static List<BackendTasks> listOfBackendTasks = new ArrayList<>();
    static List<FrontendTasks> listOfFrontendTasks = new ArrayList<>();

    public static void getListOfBackendTasks() {
        System.out.println(listOfBackendTasks);

    }

    public static void addToListOfBackendTasks(BackendTasks object) {
        Calendar.listOfBackendTasks.add(object);
    }

    public static void getListOfFrontendTasks() {
        System.out.println(listOfFrontendTasks);

    }

    public static void addToListOfFrontendTasks(FrontendTasks object) {
        Calendar.listOfFrontendTasks.add(object);
    }

}
