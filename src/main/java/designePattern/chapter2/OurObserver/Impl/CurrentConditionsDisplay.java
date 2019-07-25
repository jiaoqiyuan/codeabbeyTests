package designePattern.chapter2.OurObserver.Impl;

import designePattern.chapter2.OurObserver.Interface.DisplayElement;
import designePattern.chapter2.OurObserver.Interface.Observer;
import designePattern.chapter2.OurObserver.Interface.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + " % humidity.");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
