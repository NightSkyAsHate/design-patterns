package observer;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    weatherData.setMeasurements(50, 65, 30.4f);
  }
}
