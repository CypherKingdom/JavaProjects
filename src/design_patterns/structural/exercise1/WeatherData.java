package design_patterns.structural.exercise1;

public class WeatherData {
    private String location;
    private double temperature;
    private String condition; //rainy, windy, shiny, etc...

    public WeatherData(String location, double temperature, String condition) {
        this.location = location;
        this.temperature = temperature;
        this.condition = condition;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "WeatherData [location=" + location + ", temperature=" + temperature + ", condition=" + condition + "]";
    }
}