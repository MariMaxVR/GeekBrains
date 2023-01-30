package Java.Lesson4_HomeWork;

import java.util.Random;
import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {

        // ****************************************************************************
        // 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
        // вернет “перевернутый” список.

        // LinkedList<String> list1 = new LinkedList<>();
        // list1.add("J");
        // list1.add("a");
        // list1.add("v");
        // list1.add("a");
        // list1.add("!");

        // System.out.println("Исходный список " + list1);

        // LinkedList<String> list2 = new LinkedList<>();
        // list2 = reverseList(list1);
        // System.out.println("Перевёрнутый список " + list2);

        // ****************************************************************************
        // 2. Реализуйте очередь с помощью LinkedList со следующими методами: 
        // enqueue() - помещает элемент в конец очереди, 
        // dequeue() - возвращает первый элемент из очереди и удаляет его, 
        // first() - возвращает первый элемент из очереди, не удаляя.






        // ****************************************************************************
        // 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
        // Используйте итератор

        // LinkedList<Integer> list = new LinkedList<>();
        // for (int i = 0; i < 5; i++) {
        //     Random random = new Random();
        //     list.add(random.nextInt(1, 10));
        // }
        // System.out.println("Получился список " + list);
        // System.out.println("Сумма элементов списка = " + sumElements(list));






    }

    static LinkedList reverseList(LinkedList list) {
        LinkedList templist = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            templist.add(list.get(i));
        }
        return templist;
    }

    static int sumElements(LinkedList<Integer> list) {
        int sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }

}
