package Lesson5_HomeWork.Task1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(888)) {
            System.out.println("Запуск сервера выполнен успешно, ожидается подключение клиента...");
            Socket socket = serverSocket.accept();
            System.out.println("Обнаружено подключение клиента к серверу, выполняю запрос...");

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String printMenu = "Выберите режим калькулятора:\n" +
                    "1 - классический калькулятор;\n" +
                    "2 - строковый калькулятор;\n" +
                    "0 - завершение программы или переход в главное меню из выбранного режима.";
            dataOutputStream.writeUTF(printMenu);

            while (true) {

                String clientAsnwer = dataInputStream.readUTF();

                if (clientAsnwer.equals("0")) {
                    System.out.println("Клиент завершил работу с программой.");
                    break;
                } else if (clientAsnwer.equals("1")) {
                    dataOutputStream.writeUTF("Режим классического калькулятора. Введите первое число: ");
                    double result = Double.parseDouble(dataInputStream.readUTF());

                    dataOutputStream.writeUTF("Введите знак математической операции: ");
                    String operation = dataInputStream.readUTF();
                    dataOutputStream.writeUTF("Введите второе число: ");
                    double number = Double.parseDouble(dataInputStream.readUTF());
                    if (operation.equals("+")) {
                        dataOutputStream.writeUTF(result + " + " + number + " = " + (result + number));
                    } else if (operation.equals("-")) {
                        dataOutputStream.writeUTF(result + " - " + number + " = " + (result - number));
                    } else if (operation.equals("*")) {
                        dataOutputStream.writeUTF(result + " * " + number + " = " + (result * number));
                    } else if (operation.equals("/")) {
                        dataOutputStream.writeUTF(result + " / " + number + " = " + (result / number));

                    } else {
                        dataOutputStream.writeUTF("Некорректное указание вида операции.");
                    }

                } else if (clientAsnwer.equals("2")) {

                    dataOutputStream.writeUTF("Режим строчного калькулятора. Введите строку: ");
                }

                else {
                    dataOutputStream.writeUTF("Некорректное указание пункта меню.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
