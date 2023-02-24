package Lesson5_HomeWork.Task1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Server {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(888)) {
            writeToFile(getDate() + getTime() + "Запуск сервера выполнен успешно, ожидается подключение клиента...\n");
            Socket socket = serverSocket.accept();
            writeToFile(getDate() + getTime() + "Обнаружено подключение клиента к серверу, выполняю запрос...\n");

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            String printMenu = "Выберите режим калькулятора:\n" +
                    "1 - Классический калькулятор;\n" +
                    "2 - Строковый калькулятор;\n" +
                    "Exit - Завершение программы.";

            String mathSign = "Введите знак математической операции: ";

            dataOutputStream.writeUTF(printMenu);

            String clientAsnwer = dataInputStream.readUTF();

            while (true) {
                if (clientAsnwer.equals("Exit")) {
                    writeToFile("Клиент завершил работу с программой.");
                    break;
                } else if (clientAsnwer.equals("1")) {
                    dataOutputStream.writeUTF("Режим классического калькулятора, для выхода введите Exit.\n" +
                            "Введите первое число: ");

                    double number1 = Double.parseDouble(dataInputStream.readUTF());
                    double result = number1;

                    dataOutputStream.writeUTF("Введите знак математической операции: ");
                    while (true) {
                        String operation = dataInputStream.readUTF();
                        dataOutputStream.writeUTF("Введите второе число: ");
                        double number2 = Double.parseDouble(dataInputStream.readUTF());

                        if (operation.equals("+")) {
                            result = number1 + number2;

                            dataOutputStream.writeUTF(number1 + " + " + number2 + " = " + result
                                    + "\n" + mathSign);

                            writeToFile(getDate() + "в " + getTime() + "Пользователь ввёл числа: " + number1
                                    + " и " + number2 + ", пользователю предоставлен результат сложения = "
                                    + result + "\n");
                            number1 = result;

                        } else if (operation.equals("-")) {
                            result = number1 - number2;
                            dataOutputStream.writeUTF(number1 + " - " + number2 + " = " + result
                                    + "\n" + mathSign);
                            writeToFile(getDate() + "в " + getTime() + "Пользователь ввёл числа: " + number1
                                    + " и " + number2 + ", пользователю предоставлен результат вычитания = "
                                    + result + "\n");
                            number1 = result;

                        } else if (operation.equals("*")) {
                            result = number1 * number2;
                            dataOutputStream.writeUTF(number1 + " * " + number2 + " = " + result
                                    + "\n" + mathSign);
                            writeToFile(getDate() + "в " + getTime() + "Пользователь ввёл числа: " + number1
                                    + " и " + number2 + ", пользователю предоставлен результат умножения = "
                                    + result + "\n");
                            number1 = result;

                        } else if (operation.equals("/")) {
                            result = number1 / number2;
                            String result1 = String.format("%.3f", result);
                            dataOutputStream.writeUTF(number1 + " / " + number2 + " = " + result1
                                    + "\n" + mathSign);
                            writeToFile(getDate() + "в " + getTime() + "Пользователь ввёл числа: " + number1
                                    + " и " + number2 + ", пользователю предоставлен результат деления = "
                                    + result1 + "\n");
                            number1 = result;

                        } else {
                            dataOutputStream.writeUTF("Укажите корректно знак математической операции:");
                        }

                    }

                } else if (clientAsnwer.equals("2")) {

                    dataOutputStream.writeUTF("Данный функционал пока не реализован. " + printMenu);
                }

                else {
                    dataOutputStream.writeUTF("Некорректное указание пункта меню. " + printMenu);
                }
                clientAsnwer = dataInputStream.readUTF();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String getDate() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy "));
    }

    static String getTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm "));
    }

    static void writeToFile(String someText) {
        File file = new File("Java_OOP\\Lesson5_HomeWork\\Task1\\log.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(someText);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
