package designePattern.chapter2.OurObserver;

import designePattern.chapter2.OurObserver.Impl.CurrentConditionsDisplay;
import designePattern.chapter2.OurObserver.Impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 40.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
