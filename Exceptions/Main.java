public class Main {

    public static void main(String[] args) {

        /*
         * 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
         */

        System.out.println(DivisionByZero(5)); // java.lang.ArithmeticException: / by zero

        int[] array = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(ValueFromIndex(array, 5)); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds
                                                      // for length 5

        NullException(); // java.lang.NullPointerException: Cannot invoke "String.length()" because "str"
                         // is null

        /*
         * 2) Реализуйте метод, принимающий в качестве аргументов два целочисленных
         * массива, и возвращающий новый массив, каждый элемент которого равен разности
         * элементов двух входящих массивов в той же ячейке. Если длины массивов не
         * равны, необходимо как-то оповестить пользователя.
         */

        int[] array1 = new int[] { 5, 3, 2, 8, 0 };
        // int[] array1 = new int[] {5, 3 ,2, 8}; // Оповестит пользователя об ошибке.
        int[] array2 = new int[] { 1, 2, 3, 4, 5 };
        ArraysDifference(array1, array2);

        /*
         * 3) * Дополнительно * Реализуйте метод, принимающий в качестве аргументов два
         * целочисленных массива, и возвращающий новый массив, каждый элемент которого
         * равен частному элементов двух входящих массивов в той же ячейке. Если длины
         * массивов не равны, необходимо как-то оповестить пользователя. Важно: При
         * выполнении метода единственное исключение, которое пользователь может увидеть
         * - RuntimeException, т.е. ваше.
         */

        int[] array3 = new int[] { 4, 8, 16, 32, 64 };
        // int[] array3 = new int[] { 4, 8, 16, 32 }; // java.lang.RuntimeException: Длины массивов не совпадают
        int[] array4 = new int[] { 2, 2, 2, 2, 2 };

        int[] resultArray = divideArrays(array3, array4);

        System.out.println("Новый массив:");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }

    }

    public static int DivisionByZero(int number) {
        return number / 0;
    }

    public static int ValueFromIndex(int[] array, int index) {
        return array[index];
    }

    public static void NullException() {
        String str = null;
        int length = str.length(); // Попытка вызова метода length() для значения null
        System.out.println(length);
    }

    public static void ArraysDifference(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Выполнение задачи невозможно, переданные массивы не равны по длине!");
        } else {
            System.out.println("Новый массив с разницей элементов имеет вид:");
            int[] resultArray = new int[array1.length];
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = array1[i] - array2[i];
                System.out.print(resultArray[i] + " ");
            }

        }
    }

    public static int[] divideArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не совпадают");
        }

        int[] result = new int[array1.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] / array2[i];
        }

        return result;
    }

}
