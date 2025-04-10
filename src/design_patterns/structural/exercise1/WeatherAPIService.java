package design_patterns.structural.exercise1;

public class WeatherAPIService implements WeatherInterface {

    @Override
    public String updateWeather(String location) {
       return "14°C, rainy"; 
    }
}
