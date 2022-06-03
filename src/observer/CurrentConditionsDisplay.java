package observer;

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
    System.out.printf("Current conditions: %sF degrees and %s%% humidity%n", temperature, humidity);
  }

  @Override
  public void update() {
    if (weatherData instanceof WeatherData) {
      WeatherData w = (WeatherData) weatherData;
      this.temperature = w.getTemperature();
      this.humidity = w.getHumidity();
      display();
    }
  }
}
