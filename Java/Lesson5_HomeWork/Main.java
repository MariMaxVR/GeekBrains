package Java.Lesson5_HomeWork;

import java.util.*;

/*
 1.Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

 2.Пусть дан список сотрудников: 

 Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, 
 Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, 
 Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 

 Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
 */

public class Main {
    public static void main(String[] args) {

        task1_run();
        System.out.println();
        task2_run();

    }
    // ************************************************************
    // Методы для задания 1:

    static void task1_run() {
        String name = "Иванов";
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        fillPB(phoneBook);
        findContact(name, phoneBook);
    }

    static void fillPB(HashMap<String, List<String>> list) {
        list.put("Иванов", List.of("010101"));
        list.put("Петров", List.of("33333"));
        list.put("Сидоров", List.of("55555", "66666"));
        list.put("Иванов", List.of("11111", "22222"));
        list.put("Тестов", List.of("88888", "99999", "00000"));
    }

    static void findContact(String name, HashMap<String, List<String>> list) {
        for (HashMap.Entry entry : list.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println("У контакта " + name + " найдены следующие телефонные номера: "
                        + list.get(name));

            }
        }
    }

    // ************************************************************
    // Метод для задания 2:
    static void task2_run() {

        String workers = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, " + 
        "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, " + 
        "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";

        workers = workers.replace(",", "");
        workers = workers.replace(".", "");
        String[] workersFullNames = workers.split(" ");

        TreeMap<String, Integer> workersNames = new TreeMap<>();

        for (int i = 0; i < workersFullNames.length; i += 2) {

            if (workersNames.containsKey(workersFullNames[i])) {
                workersNames.replace(workersFullNames[i], workersNames.get(workersFullNames[i]) + 1);
            } else {
                workersNames.put(workersFullNames[i], 1);
            }

        }
        System.out.println("Не отсортированный список: " + workersNames);

        Map<String, Integer> sortedNames = new LinkedHashMap<>();
        int max = 1;

        for (int value : workersNames.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : workersNames.entrySet()) {
                String key = entry.getKey();
                if (workersNames.get(key) == i) {
                    sortedNames.put(key, workersNames.get(key));
                }
            }
        }
        System.out.println("Отсортированный список: " + sortedNames);

    }
}
