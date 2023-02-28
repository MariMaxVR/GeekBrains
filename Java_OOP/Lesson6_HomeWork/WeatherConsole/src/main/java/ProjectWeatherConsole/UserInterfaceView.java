package ProjectWeatherConsole;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите 1 для получения погоды на сегодня;\n" +
                        "Введите 5 для прогноза на 5 дней;\nДля выхода введите 0.\n" +
                        "Введите значение: ");

                String command = scanner.nextLine();
                // Небольшая, простая проверка пользовательского ввода:
                if (command.equals("0")) {
                    System.out.println("Работа программы завершена. До свидания!");
                    break;
                } else if (command.equals("1") || command.equals("5")) {
                    System.out.println("Введите имя города на английском языке: ");
                    String city = scanner.nextLine();
                    System.out.println();
                    try {
                        controller.getWeather(command, city);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                else {
                    System.out.println("Некорректно указан пункт меню. Выберите действие:");
                }
            }
        }
    }

    public static void main(String[] args) {
        UserInterfaceView userInterfaceView = new UserInterfaceView();
        userInterfaceView.runInterface();
    }
}