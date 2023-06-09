import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Seminar3HW {

    public static void main(String[] args) {

        // Напишите приложение, которое будет запрашивать у пользователя следующие
        // данные, разделенные пробелом:
        // Фамилия Имя Отчество номертелефона

        // Форматы данных:
        // фамилия, имя, отчество - строки
        // номертелефона - целое беззнаковое число без форматирования

        // Ввод всех элементов через пробел

        // Приложение должно проверить введенные данные по количеству. Если количество
        // не совпадает с требуемым, вернуть код ошибки, обработать его и показать
        // пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

        // Приложение должно попытаться распарсить полученные значения и выделить из них
        // требуемые параметры. Если форматы данных не совпадают, нужно бросить
        // исключение, соответствующее типу проблемы. Можно использовать встроенные типы
        // java и создать свои. Исключение должно быть корректно обработано,
        // пользователю выведено сообщение с информацией, что именно неверно.

        // Если всё введено и обработано верно, должен создаться файл с названием,
        // равным фамилии, в него в одну строку должны записаться полученные данные,
        // вида

        // <Фамилия><Имя><Отчество><номер_телефона>
        // Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

        // Не забудьте закрыть соединение с файлом.

        // При возникновении проблемы с чтением-записью в файл, исключение должно быть
        // корректно обработано, пользователь должен увидеть стектрейс ошибки.

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(
                    "Введите данные пользователя через пробел, в формате [Фамилия Имя Отчество Номер_Телефона]:");
            System.out.print("По окончанию ввода данных пользователя нажмите Enter. Введите данные >>> ");
            String input = scanner.nextLine();

            String[] data = input.split(" "); // Запрашиваем у пользователя данные и кладём в переменную

            int expectedDataLength = 4; // Заводим переменную с ожидаемым количеством итоговых данных

            if (checkData(data, expectedDataLength) == -1) { // Проверка на нужное количество элементов
                System.out.println("Введено неверное количество данных пользователя!");
                return;
            }
            String lastName = data[0];
            String firstName = data[1];
            String patronymic = data[2];
            long phoneNumber;

            try {
                phoneNumber = Long.parseLong(data[3]); // Попытка перевести номер телефона в числовой формат
            } catch (NumberFormatException e) {
                System.out.println("Ошибка - неверный формат номера телефона!");
                System.out.println("Нужно ввести целое беззнаковое число без форматирования");
                return;
            }

            try {
                writeDataToFile(lastName, firstName, patronymic, phoneNumber); // Попытка записать в файл
                // Если запись будет невозможна, то метод writeDataToFile выбрасывает
                // IOException, которое обрабатывается здесь.
                System.out.println("Данные успешно записаны в файл.");
            } catch (IOException e) {
                System.out.println("Ошибка при записи данных в файл:");
                e.printStackTrace();
            }
        }

    }

    // Метод записи данных в файл. Если файл уже создан, то fileWriter добавляет
    // данные а не перезаписывает благодаря условию append:true.
    private static void writeDataToFile(String lastName, String firstName, String patronymic, long phoneNumber)
            throws IOException {
        String fileName = lastName + ".txt";
        String data = lastName + " " + firstName + " " + patronymic + " " + phoneNumber + "\n";

        FileWriter fileWriter = new FileWriter(fileName, true);
        fileWriter.write(data);
        fileWriter.close();
    }

    private static int checkData(String[] data, int expectedDataLength) {
        if (data.length != expectedDataLength)
            return -1;
        else
            return 0;
    }

}