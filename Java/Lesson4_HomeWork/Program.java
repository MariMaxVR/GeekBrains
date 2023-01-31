package Java.Lesson4_HomeWork;

import java.util.Random;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {

        // ****************************************************************************
        // 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
        // вернет “перевернутый” список.

        LinkedList<String> list = new LinkedList<>();
        list.add("J");
        list.add("a");
        list.add("v");
        list.add("a");
        list.add("!");

        System.out.println("Исходный список: " + list);

        list = reverseList(list);
        System.out.println("Перевёрнутый список: " + list);

        // ****************************************************************************
        // 2. Реализуйте очередь с помощью LinkedList со следующими методами:
        // first() - возвращает первый элемент из очереди не удаляя его,
        // enqueue() - помещает элемент в конец очереди,
        // dequeue() - возвращает первый элемент из очереди и удаляет его.

        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            list.add(random.nextInt(1, 10));
        }

        int element = 88;

        System.out.println("Исходная очередь имеет вид: " + list + "\n");

        System.out.println("Первый элемент очереди без удаления = " + first(list) + "\n");

        System.out.println("Очередь с добавленным элементом " + element + " имеет вид: " +
                "\n" + enqueue(list, element) + "\n");

        System.out.println("Первый элемент очереди с удалением = " + dequeue(list) + "\n");

        System.out.println("Итоговая очередь имеет вид: " + list);

        // ****************************************************************************
        // 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
        // Используйте итератор

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
        Random random = new Random();
        list.add(random.nextInt(1, 10));
        }
        System.out.println("Получился список " + list);
        System.out.println("Сумма элементов списка = " + sumElements(list));

    }

    // ****************************************************************************
    // Метод для 1 задачи:

    static LinkedList reverseList(LinkedList list) {
        LinkedList templist = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            templist.add(list.get(i));
        }
        return templist;
    }

    // ****************************************************************************
    // Методы для 2 задачи:

    public static int first(LinkedList<Integer> linkedList) {
        return linkedList.getFirst();
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> linkedList, int element) {
        linkedList.addLast(element);
        return linkedList;
    }

    public static int dequeue(LinkedList<Integer> linkedList) {
        int firstElement = linkedList.getFirst();
        linkedList.pollFirst();
        return firstElement;
    }

    // ****************************************************************************
    // Метод для 3 задачи:

    static int sumElements(LinkedList<Integer> list) {
        int sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }
}
