import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {

    private static final String apiKey = "dfe3d466b1ee6048f345076f2e3faf4c";

    public String getInfo(String city) throws Exception{
        URL url = new URL("http://api.weatherstack.com/current?access_key=" + apiKey + "&query=" + city);
        URLConnection connection = url.openConnection();
        StringBuilder stringBuilder = new StringBuilder();

        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}
