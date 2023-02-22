package Lesson4_HomeWork;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "cp866");
        while (true) {

            System.out.print("Какого типа задачу будем добавлять?\n" +
                    "1 - Создание задачи для отдела Frontend.\n" +
                    "2 - Создание задачи для отдела Backend.\n" +
                    "3 - Просмотр задач отдела Frontend.\n" +
                    "4 - Просмотр задач отдела Backend.\n" +
                    "0 - Выход.\n" +
                    "Введите значение: ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                FrontendTasks f = new FrontendTasks(0, null, null, null);
                System.out.println("Добавляем задачу для отдела Frontend.");
                System.out.print("Введите автора задачи: ");
                scanner.nextLine();
                f.setAuthor(scanner.nextLine());
                System.out.print("Введите описание задачи: ");
                f.setTaskTheme(scanner.nextLine());
                System.out.print("Введите крайний срок выполнения задачи: ");
                f.setDeadLine(scanner.nextLine());
                System.out.print("Введите приоритет задачи от 0 до 4: ");
                f.setPriority(scanner.nextInt());

                Calendar.addToListOfFrontendTasks(f);

            }

            else if (choice == 2) {

                BackendTasks b = new BackendTasks(0, null, null, null);
                System.out.println("Добавляем задачу для отдела Backend.");
                System.out.print("Введите автора задачи: ");
                scanner.nextLine();
                b.setAuthor(scanner.nextLine());
                System.out.print("Введите описание задачи: ");
                b.setTaskTheme(scanner.nextLine());
                System.out.print("Введите крайний срок выполнения задачи: ");
                b.setDeadLine(scanner.nextLine());
                System.out.print("Введите приоритет задачи: ");
                b.setPriority(scanner.nextInt());

                Calendar.addToListOfBackendTasks(b);

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
