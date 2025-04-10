package design_patterns.structural.exercise1;

import java.util.HashMap;

public class WeatherAppProxy implements WeatherInterface{
    private WeatherAPIService service = new WeatherAPIService();
    private HashMap<String, WeatherData> cache = new HashMap<String, WeatherData>(); //key:location(String)
    private WeatherAdapter adapter = new WeatherAdapter();

    @Override
    public String updateWeather(String location) {
        WeatherData data = this.checkCache(location);
        if(data==null){
            String rawData = this.service.updateWeather(location);
            data = adapter.convertWeather(rawData);
            data.setLocation(location);
            this.saveToCache(data);
        }
        return data.toString();
    }

    private WeatherData checkCache(String location){
        return this.cache.get(location);
    }

    private void saveToCache(WeatherData weatherdata){
        this.cache.put(weatherdata.getLocation(), weatherdata);
    }
}
