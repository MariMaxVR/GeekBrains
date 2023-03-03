package ProjectWeatherConsole;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class AccuweatherModel implements WeatherModel {

        // 1 День - http://dataservice.accuweather.com/forecasts/v1/daily/1day/Код
        // Города (через метод detectCityKey)
        // 5 Дней - http://dataservice.accuweather.com/forecasts/v1/daily/5day/Код
        // Города (через метод detectCityKey)
        private static final String PROTOKOL = "https";
        private static final String BASE_HOST = "dataservice.accuweather.com";
        private static final String FORECASTS = "forecasts";
        private static final String VERSION = "v1";
        private static final String DAILY = "daily";
        private static final String ONE_DAY = "1day"; // Параметр для отправки запроса на получение погоды на 1 день.
        private static final String FIVE_DAYS = "5day"; // Параметр для отправки запроса на получение погоды на 5 дней.
        private static final String API_KEY = "F3pRUm97bBqlBsdAqGMQB9Hf1SovqZy2"; // Ключ получил свой после регистрации
                                                                                  // на developer.accuweather.com
        private static final String API_KEY_QUERY_PARAM = "apikey";
        private static final String LOCATIONS = "locations";
        private static final String CITIES = "cities";
        private static final String AUTOCOMPLETE = "autocomplete";

        private static final OkHttpClient OK_HTTP_CLIENT = new OkHttpClient();
        private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

        public void getWeather(String cityName, Period weatherPeriod) throws IOException {
                switch (weatherPeriod) {
                        case ONE_DAY:
                                HttpUrl httpUrl0 = new HttpUrl.Builder()
                                                .scheme(PROTOKOL)
                                                .host(BASE_HOST)
                                                .addPathSegment(FORECASTS)
                                                .addPathSegment(VERSION)
                                                .addPathSegment(DAILY)
                                                .addPathSegment(ONE_DAY)
                                                .addPathSegment(detectCityKey(cityName))
                                                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                                                .build();

                                Request request_oneDay = new Request.Builder()
                                                .url(httpUrl0)
                                                .build();

                                Response oneDayForecastResponse = OK_HTTP_CLIENT.newCall(request_oneDay).execute();
                                String weatherResponse0 = oneDayForecastResponse.body().string();
                                System.out.println(weatherResponse0);
                                System.out.println();
                                break;

                        // ********************************************

                        case FIVE_DAYS:
                                HttpUrl httpUrl1 = new HttpUrl.Builder()
                                                .scheme(PROTOKOL)
                                                .host(BASE_HOST)
                                                .addPathSegment(FORECASTS)
                                                .addPathSegment(VERSION)
                                                .addPathSegment(DAILY)
                                                .addPathSegment(FIVE_DAYS)
                                                .addPathSegment(detectCityKey(cityName))
                                                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                                                .build();

                                Request request_fiveDays = new Request.Builder()
                                                .url(httpUrl1)
                                                .build();

                                Response fiveDaysForecastResponse = OK_HTTP_CLIENT.newCall(request_fiveDays).execute();
                                String weatherResponse1 = fiveDaysForecastResponse.body().string();
                                System.out.println(weatherResponse1);
                                System.out.println();
                                break;

                }
        }

        private String detectCityKey(String cityName) throws IOException {
                // http://dataservice.accuweather.com/locations/v1/cities/autocomplete
                HttpUrl httpUrl = new HttpUrl.Builder()
                                .scheme(PROTOKOL)
                                .host(BASE_HOST)
                                .addPathSegment(LOCATIONS)
                                .addPathSegment(VERSION)
                                .addPathSegment(CITIES)
                                .addPathSegment(AUTOCOMPLETE)
                                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                                .addQueryParameter("q", cityName)
                                .build();

                Request request = new Request.Builder()
                                .url(httpUrl)
                                .get()
                                .addHeader("accept", "application/json")
                                .build();

                Response response = OK_HTTP_CLIENT.newCall(request).execute();
                String responseString = response.body().string();

                String cityKey = OBJECT_MAPPER.readTree(responseString).get(0).at("/Key").asText();
                return cityKey;
        }
}
