package weather;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentWeatherController {
  @RequestMapping("/weather")
  public CurrentWeather currentWeather() {
    // TODO: Fetch data from weather API
    return new CurrentWeather(50.40);
  }
}
