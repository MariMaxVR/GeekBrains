package Java.Lesson2_HomeWork;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

/* 
Дана json строка { [ "фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"]} 

Задача написать метод(ы), который распарсить строку и выдаст ответ вида: 
Студент Иванов получил 5 по предмету Математика. 
Студент Петрова получил 4 по предмету Информатика. 
Студент Краснов получил 5 по предмету Физика. 

Используйте StringBuilder для подготовки ответа. 
Создать метод, который запишет результат работы в файл. Обработайте исключения и запишите ошибки в лог файл.
*/

public class Program {
    public static void main(String[] args) throws Exception {
        String path = "Java\\Lesson2_HomeWork\\data.txt";

        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        scanner.close();

        line = line.replace("{", "")
                .replace("}", "")
                .replace("[", "")
                .replace("]", "")
                .replace("\"", "")
                .replace(",", " ")
                .replace("фамилия:", "")
                .replace("оценка:", "")
                .replace("предмет:", "");

        String[] array = line.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i += 3) {
            sb.append(" Студент ");
            sb.append(array[i]);
            sb.append(" получил ");
            sb.append(array[i + 1]);
            sb.append(" по предмету ");
            sb.append(array[i + 2]);
            sb.append(".\n");
        }
        System.out.println(sb);

        // Запись результатной строки в файл
        File fileResult = new File("Java\\Lesson2_HomeWork\\result.txt");
        PrintWriter pw = new PrintWriter(fileResult);
        pw.print(sb);
        pw.close();
    }
}
