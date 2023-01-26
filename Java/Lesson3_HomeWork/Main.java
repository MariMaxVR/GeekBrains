package Java.Lesson3_HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * 
 1. Пусть дан произвольный список целых чисел, удалить из него четные числа.
 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
 * 
 */

public class Main {

    public static void main(String[] args) {

        task1(10);

        // task2(5);

    }

    static void task1(int n) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Начальный список - " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println("Список без чётных цифр - " + list);
    }

    // **********************************************************************

    static void task2(int n) {
        Random random = new Random();
        double average = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
            average += list.get(i);

        }
        average /= list.size();

        System.out.println("Начальный список - " + list);
        System.out.println("Минимальное число в списке - " + Collections.min(list));
        System.out.println("Максимальное число в списке - " + Collections.max(list));
        System.out.println(String.format("Среднее арифметичное списка - %.2f", average));
    }

}
