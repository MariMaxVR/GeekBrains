import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Socket socket = new Socket("localhost", 1234)) {
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            System.out.println("Выберите пункт меню:\n1 - добавить студента\n2 - удалить студента\n" +
                    "3 - показать группу\n0 - выход.");
            while (true) {
                String request = scanner.nextLine();
                dataOutputStream.writeUTF(request);
                if (request.equals("0"))
                    break;
                System.out.println(dataInputStream.readUTF());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            scanner.close();
        }
    }

}
