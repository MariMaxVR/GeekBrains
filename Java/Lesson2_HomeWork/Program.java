package Java.Lesson2_HomeWork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
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



public class Program 
{
  public static void main(String[] args) throws FileNotFoundException
  {
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

    String result = "";

    for (int i = 0; i < array.length; i+=3) 
    {
      result += "Студент " + array[i] + " получил " + array[i+1] + " по предмету " + array[i+2] + ".\n";
    }
  
    File fileResult = new File("Java\\Lesson2_HomeWork\\result.txt");
    PrintWriter pw = new PrintWriter(fileResult);
    pw.println(result);
    pw.close();
  } 

}




// Второй вариант с переработанным кодом:

// public class Program 
// {
//   public static void main(String[] args) throws IOException 
//   {
//     StringBuilder sb = new StringBuilder();
//     try (BufferedReader br = new BufferedReader(new FileReader("Java\\Lesson2_HomeWork\\data.txt"))) 
//     {
//       String data;
//       while ((data = br.readLine()) != null) {
//         sb.append(data);
//       }
//     } catch (IOException e) 
//     {
//       e.printStackTrace();
//     }
//     // создание словаря
//     Map<String, String> map = new HashMap<>();

//     // Парсим строку, убираем лишние символы и записываем данные в словарь
//     String[] keys = sb.toString().replace("{", "")
//                       .replace("[", "")
//                       .replace("]", "")
//                       .replace("\"", "")
//                       .replaceAll("\\s", "").split("},");

//     for (String data : keys) 
//     {
//       String[] person = data.split(",");
//       for (String keyValues : person) 
//       {
//         String[] keyValue = keyValues.replace("}", "").split(":");
//         String key = keyValue[0];
//         String value = keyValue[1];
//         map.put(key, value);
//       }
//       System.out.printf("Студент %s получил %s по предмету %s.\n", map.get("фамилия"),
//           map.get("оценка"), map.get("предмет"));
//     }
//   }
// }
