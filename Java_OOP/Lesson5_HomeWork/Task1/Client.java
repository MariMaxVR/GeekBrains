package Lesson5_HomeWork.Task1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket("127.0.0.1", 888)) {

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            while (true) {
                System.out.println(dataInputStream.readUTF());
                String clientAnswer = scanner.nextLine();
                dataOutputStream.writeUTF(clientAnswer);
                if (clientAnswer.equals("Exit")) {
                    scanner.close();
                    System.out.println("Программа завершена успешно. До свидания!");
                    break;
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}