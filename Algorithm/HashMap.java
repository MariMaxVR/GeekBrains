public class HashMap {
    private static final int SIZE = 16;
    private Node[] table;
    private int size;

    public HashMap() {
        table = new Node[SIZE];
        size = 0;
    }

    /*
     * Метод put(Integer key, Integer value) добавляет элемент в HashMap.
     * Если элемент с таким ключом уже существует, его значение будет заменено на новое,
     * и старое значение будет возвращено.
     * Если элемент с таким ключом не существует, он будет добавлен, и метод вернет null.
     */

    public Object put(Integer key, Integer value) {
        int index = getIndex(key);
        Node newNode = new Node(key, value, null);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    Object oldValue = current.value;
                    current.value = value;
                    return oldValue;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                Object oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current.next = newNode;
        }
        size++;
        return null;
    }

    /*
     * Метод get(Integer key) возвращает значение, соответствующее указанному ключу.
     * Если элемент с таким ключом не найден, метод вернет null.
     */

    public Object get(Integer key) {
        int index = getIndex(key);
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    /*
     * Метод remove(Integer key) удаляет элемент с указанным ключом из HashMap и
     * возвращает его значение. Если элемент с таким ключом не найден, метод вернет null.
     */

    public Object remove(Integer key) {
        int index = getIndex(key);
        Node current = table[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    /*
     * Метод replace(Integer key, Integer value) заменяет значение элемента с
     * указанным ключом на новое и возвращает старое значение. 
     * Если элемент с таким ключом не найден, метод вернет null.
     */

    public Object replace(Integer key, Integer value) {
        int index = getIndex(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                Object oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }
        return null;
    }

    /*
     * Метод size() возвращает количество элементов в HashMap.
     */

    public int size() {
        return size;
    }

    /*
     * Метод containsKey(Integer key) проверяет наличие элемента с указанным ключом
     * в HashMap и возвращает true, если такой элемент существует, и false в противном случае.
     */
    public boolean containsKey(Integer key) {
        int index = getIndex(key);
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /*
     * Метод containsValue(Integer value) проверяет наличие элемента с указанным
     * значением в HashMap и возвращает true, если такой элемент существует, 
     * и false в противном случае.
     */
    
    public boolean containsValue(Integer value) {
        for (int i = 0; i < table.length; i++) {
            Node current = table[i];
            while (current != null) {
                if (current.value.equals(value)) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    private int getIndex(Integer key) {
        return key.hashCode() % table.length;
    }

    private static class Node {
        private Integer key;
        private Integer value;
        private Node next;

        public Node(Integer key, Integer value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put(1, 88);
        map.put(2, 33);
        map.put(3, 100);

        System.out.println(map.get(2)); // Выведет 33.
    }
}