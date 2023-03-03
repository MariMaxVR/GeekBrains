package model;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {

    // через https://developer.accuweather.com
    public static final String API_KEY_ACCUWEATHER = "F3pRUm97bBqlBsdAqGMQB9Hf1SovqZy2";
    // через https://weatherstack.com
    public static final String API_KEY_WEATHERSTACK = "dfe3d466b1ee6048f345076f2e3faf4c";

    public String getInfo(String city) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();

        URL url = new URL("http://api.weatherstack.com/current?access_key=" + API_KEY_WEATHERSTACK + "&query=" + city);
        URLConnection connection = url.openConnection();
        try (Scanner scanner = new Scanner(connection.getInputStream())) {
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
            }
        }
        return stringBuilder.toString();
    }
}