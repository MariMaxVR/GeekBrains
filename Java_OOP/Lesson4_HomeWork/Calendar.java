package Lesson4_HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

    private static List<BackendTasks> listOfBackendTasks = new ArrayList<>();
    private static List<FrontendTasks> listOfFrontendTasks = new ArrayList<>();

    public static void getListOfBackendTasks() {
        System.out.println(listOfBackendTasks);

    }

    public void addToListOfBackendTasks(BackendTasks object) {
        listOfBackendTasks.add(object);

    }

    public static void getListOfFrontendTasks() {
        System.out.println(listOfBackendTasks);

    }

    public static void addToListOfFrontendTasks(FrontendTasks object) {
        listOfFrontendTasks.add(object);
    }

}
