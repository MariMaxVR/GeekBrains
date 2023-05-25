/*
 * Разворот двусвязного списка включает изменение направления связей между узлами списка таким образом, 
 * чтобы последний узел стал первым, а первый узел стал последним.
 */

public class LinkedListReverse {
    private Node head;

    // Node - вложенный класс, представляющий узел списка. Узел содержит поле data, которое хранит значение узла, 
    // а также ссылки prev и next на предыдущий и следующий узлы соответственно.

    private class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

// add(int data) - метод для добавления нового узла в конец списка. 
// Если список пуст, новый узел становится головой списка. 
// В противном случае, происходит проход по списку до последнего узла, и новый узел добавляется в конец списка.

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // Если список пуст, новый узел становится головой списка
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode; // Добавление нового узла в конец списка
            newNode.prev = current; // Обновление ссылки на предыдущий узел для нового узла
        }
    }

// reverse() - метод для разворота списка. В данном методе происходит итерация по всем узлам списка. 
// Для каждого узла происходит обмен местами ссылок prev и next, таким образом изменяется направление связей между узлами.
// Голова списка обновляется после завершения разворота.

    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev; // Обновление головы списка после разворота
        }
    }

// print() - метод для вывода значений всех узлов списка. Он проходит по всем узлам, начиная с головы списка, 
// и выводит значение каждого узла. В методе main создается объект LinkedListReverse, добавляются элементы в список, 
// и затем выводятся исходный и развёрнутый списки.

    public void print() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " "); // Вывод значения текущего узла
            current = current.next; // Переход к следующему узлу
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println("Исходный двухсвязный список:");
        list.print(); // Вывод исходного списка

        list.reverse(); // Разворот списка

        System.out.println("Развёрнутый двухсвязный список:");
        list.print(); // Вывод развёрнутого списка
    }
}
