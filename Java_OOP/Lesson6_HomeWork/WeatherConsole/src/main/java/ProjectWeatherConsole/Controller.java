package ProjectWeatherConsole;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    private WeatherModel weatherModel = new AccuweatherModel();
    private Map<Integer, Period> variants = new HashMap<>();

    public Controller() {
        variants.put(1, Period.ONE_DAY);
        variants.put(5, Period.FIVE_DAYS);
    }

    public void getWeather(String command, String cityName) throws IOException {
        try {
            Integer userInput = Integer.parseInt(command);
            switch (variants.get(userInput)) {
                case ONE_DAY:
                    weatherModel.getWeather(cityName, Period.ONE_DAY);
                    break;
                case FIVE_DAYS:
                    weatherModel.getWeather(cityName, Period.FIVE_DAYS);
                    break;
            }

        } catch (Exception e) {
            System.out.println("Некорректно указано название города. Повторите ввод.");
            System.out.println();

        }
    }
}
