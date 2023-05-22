public class HeapSort {

    // Алгоритм пирамидальной сортировки (сортировка кучей).

    public static void heapSort(int arr[]) {
        // Присваивание переменной 'n' значения длины массива.
        int n = arr.length;

        // Построение Max-кучи
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Извлечение элементов из кучи по одному
        for (int i = n - 1; i > 0; i--) {
            // Перемещение текущего корня (максимального элемента) в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызов процедуры heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i; // Инициализация наибольшего элемента как корня
        int left = 2 * i + 1; // Левый дочерний элемент
        int right = 2 * i + 2; // Правый дочерний элемент

        // Если левый дочерний элемент больше корня
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Если правый дочерний элемент больше, чем наибольший элемент на данный момент
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Если наибольший элемент не является корнем
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Рекурсивно вызывать heapify на затронутой подкуче
            heapify(arr, n, largest);
        }
    }

    // ***************************************************************************************

    // Метод для вывода элементов массива
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ***************************************************************************************

    // Проверка Алгоритма пирамидальной сортировки (сортировка кучей).

    public static void main(String args[]) {
        int arr[] = { 1, 3, 6, 23, 13, 35, 43, 54, 88, 2, 4, 78, 15, 3, 5, 6, 7, 0, 12, 9, 7, 2,  1, 9 };

        heapSort(arr);
        printArray(arr);
    }
}
