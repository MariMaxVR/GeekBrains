package Lesson4_HomeWork;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Какого типа задачу будем добавлять?, \n" +
                    "1 - Создание задачи для отдела Frontend. \n" +
                    "2 - Создание задачи для отдела Backend. \n" +
                    "3 - Просмотр задач отдела Frontend. \n" +
                    "4 - Просмотр задач отдела Backend. \n" +
                    "0 - Выход. \n Введите значение: ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Добавляем задачу для отдела Frontend.");
                FrontendTasks f = new FrontendTasks(0, null, null, null);
                System.out.print("Введите приоритет задачи: ");

                f.setPriority(scanner.nextInt());
                System.out.print("Введите автора задачи: ");
                f.setAuthor(scanner.next());
                System.out.print("Введите тему задачи: ");
                f.setTaskTheme(scanner.next());
                System.out.println("Введите deadline задачи: ");
                f.setDeadLine(scanner.next());

                // System.out.println(f);
                Calendar.addToListOfFrontendTasks(f); // не срабатывает ?
                Calendar.getListOfFrontendTasks();

            }

            else if (choice == 2) {

                System.out.println("Добавляем задачу для отдела Backend.");
                BackendTasks b = new BackendTasks(0, null, null, null);
                System.out.print("Введите приоритет задачи: ");

                b.setPriority(scanner.nextInt());
                System.out.print("Введите автора задачи: ");
                b.setAuthor(scanner.next());
                System.out.print("Введите тему задачи: ");
                b.setTaskTheme(scanner.next());
                System.out.println("Введите deadline задачи: ");
                b.setDeadLine(scanner.next());

                // System.out.println(f);
                Calendar.addToListOfBackendTasks(b); // не срабатывает ?
                Calendar.getListOfBackendTasks();
            }

            else if (choice == 3) {
                Calendar.getListOfFrontendTasks();
            }

            else if (choice == 4) {
                Calendar.getListOfBackendTasks();
            }

            else {
                scanner.close();
                break;
            }

        }

    }

}
