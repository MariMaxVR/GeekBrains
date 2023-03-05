package ProjectWeatherConsole;

import java.io.IOException;

public interface WeatherModel {
    void getWeather(String cityName, Period weatherPeriod) throws IOException;



}

