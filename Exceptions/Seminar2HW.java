// import java.lang.management.ThreadInfo;
// import java.util.Scanner;

// public class Seminar2HW {

//     public static void main(String[] args) {

//         AskFloatNumber();
//         AskSomeString();

//     }

//     /*
//      * 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа
//      * (типа float), и возвращает введенное значение. Ввод текста вместо числа не
//      * должно приводить к падению приложения, вместо этого, необходимо повторно
//      * запросить у пользователя ввод данных.
//      */

//     public static void AskFloatNumber() {
//         Scanner scanner = new Scanner(System.in);
//         while (true) {
//             try {
//                 System.out.print("Для выхода введите exit или введите дробное число: ");
//                 String input = scanner.nextLine();
//                 if (input.equals("exit")) {
//                     System.out.println("Работа программы завершена. До свидания!");
//                     break;
//                 } else {
//                     input = input.replace(",", ".");
//                     float number = Float.parseFloat(input);
//                     System.out.println();
//                     System.out.println("Вы ввели число " + number);
//                 }
//             } catch (NumberFormatException e) {
//                 System.out.println("Введено некорректное значение, повторите ввод!");
//             }
//         }
//     }

//     /*
//      * 2. Если необходимо, исправьте данный код (задание 2
//      * https://docs.google.com/document/d/
//      * 17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//      */
//     // Код необходимо закомментировать, чтобы не вызывать ошибку по всему остальному файлу.

//     try

//     {
//         int d; // Убрал инициализацию переменной d=0, иначе получалось постоянное деление на
//                // ноль.
//         double catchedRes1 = intArray[8] / d; // Добавил проверку, что нет выхода за пределы массива, так как 8 индекса
//                                               // может не быть.
//         System.out.println("catchedRes1 = " + catchedRes1);

//     }catch(
//     ArithmeticException e)
//     {
//         System.out.println("Catching ArithmeticException: " + e);
//     }catch(
//     ArrayIndexOutOfBoundsException e)
//     {
//         System.out.println("Catching ArrayIndexOutOfBoundsException: " + e);
//     }catch(
//     NullPointerException e)
//     {
//         System.out.println("Catching NullPointerException: " + e);
//     }catch(
//     Exception e)
//     {
//         System.out.println("Another Exception " + e);
//     }

//     /*
//      * 3. Дан следующий код, исправьте его там, где требуется (задание 3
//      * https://docs.google.com/document/d/
//      * 17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//      */

//     // Код необходимо закомментировать, чтобы не вызывать ошибку по всему остальному файлу.

//     try

//     {
//         int a = 90;
//         int b = 3;
//         System.out.println(a / b);
//         printSum(23, 234);
//         int[] abc = { 1, 2 };
//         abc[2] = 9;
//     }catch(
//     NullPointerException ex)
//     {
//         System.out.println("Указатель не может указывать на null!");
//     }catch(
//     IndexOutOfBoundsException ex)
//     {
//         System.out.println("Массив выходит за пределы своего размера!");
//     }catch(
//     Throwable ex)
//     {
//         System.out.println("Что-то пошло не так...");
//     }

//     public static void printSum(Integer a, Integer b) {
//     System.out.println(a + b);
//     }

//     /*
//      * 4. Разработайте программу, которая выбросит Exception, когда пользователь
//      * вводит пустую строку. Пользователю должно показаться сообщение, что пустые
//      * строки вводить нельзя.
//      */

//     public static void AskSomeString() {
//         Scanner scanner = new Scanner(System.in);
//         while (true) {
//             System.out.print("Для выхода введите exit или введите строку: ");
//             String input = scanner.nextLine();
//             if (input.equals("exit")) {
//                 System.out.println("Работа программы завершена. До свидания!");
//                 break;
//             } else if (input.isEmpty()) {
//                 try {
//                     throw new RuntimeException("Пустую строку вводить запрещено, повторите ввод!");
//                 } catch (RuntimeException e) {
//                     System.out.println(e.getMessage());
//                 }
//             } else {
//                 System.out.println("Вы ввели строку: " + input);
//             }

//         }
//     }
// }
