package weather;

public class CurrentWeather {
  private final double temperature;

  public CurrentWeather(double temperature) {
      this.temperature = temperature;
  }

  public double getTemperature() {
      return temperature;
  }
}
