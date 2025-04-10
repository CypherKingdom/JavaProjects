package design_patterns.structural.exercise1;

public class WeatherAdapter {
    public WeatherData convertWeather(String rawData){
        String[] x = rawData.split(",");
        //x[0]=14°C"    x[1]="rainy"
        int i = x[0].indexOf("°C");
        String temp = x[0].substring(0, i);
        double temperature = Double.parseDouble(temp);
        WeatherData data = new WeatherData(null, temperature, x[1]);
        return data;
    }
}
