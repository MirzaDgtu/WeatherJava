import weather.*;

import java.util.Currency;

// Pattern Observer
public class Main {
    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        CelsiyDisplay  celsiyDisplay = new CelsiyDisplay(weatherData);
        // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,28.2f);
        weatherData.setMeasurements(78,90,29.3f);
        weatherData.setMeasurements(100, 90,29.9f);
    }
}
