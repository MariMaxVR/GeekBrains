package Java.Lesson1_HomeWork;

import java.util.Scanner;
import javax.sql.rowset.spi.SyncResolver;

public class Main {

    public static void main(String[] args) {

        // 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n):

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число до которого нужно вывести сумму всех чисел:
        ");
        int num = scanner.nextInt();
        int result = 0;
        for (int i = 0; i <= num; i++) {
        result = result + i;
        }
        System.out.println("Сумма чисел от 1 до числа " + num + " равна " + result);

        // ********************************************************************************************************

        // 2. Вычислить n! (произведение чисел от 1 до n):

        factorial();

        // ********************************************************************************************************

        // 3. Вывести все простые числа от 1 до 1000 (простые числа - это числа которые
        // делятся только на себя и на единицу без остатка. Чтобы найти остаток от
        // деления используйте оператор %, например 10 % 3 будет равно единице):

        System.out.println("Простыми числами в диапазоне от 1 до 1000 являются числа:
        ");
        for (int i = 2; i <= 1000; i++) {
        for (int j = 2; j <= i; j++) {
        if (j < i && i % j == 0) {
        break;
        }
        if (i % j == 0) {
        System.out.print(i + " ");
        }
        }
        }

        // ********************************************************************************************************

        // 4. Реализовать простой калькулятор ("введите первое число"... "Введите второе
        // число"... "укажите операцию, которую надо выполнить с этими числами"...
        // "ответ: ...")

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите операцию: ");
        char operation = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        if (operation == '+') {
            int result = num1 + num2;
            System.out.println("Результатом сложения числа " + num1 + " и числа " + num2 + " будет число = " + result);
        } else if (operation == '-') {
            int result = num1 - num2;
            System.out.println("Результатом вычитания числа " + num1 + " и числа " + num2 + " будет число = " + result);
        } else if (operation == '*') {
            int result = num1 * num2;
            System.out.println("Результатом умножения числа " + num1 + " и числа " + num2 + " будет число = " + result);
        } else if (operation == '/') {
            int result = num1 / num2;
            System.out.println("Результатом деления числа " + num1 + " и числа " + num2 + " будет число = " + result);
        } else {
            System.out.println("Некорректный ввод! Проверьте правильность ввода оператора!");
        }

    }
    static void factorial() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число до которого нужно вывести произведение всех
    чисел: ");
    int num = scanner.nextInt();
    int result = 1;
    for (int i = 1; i <= num; i++) {
    result = result * i;
    }
    System.out.println("Произведение чисел от 1 до числа " + num + " равно " +
    result);
    }
}