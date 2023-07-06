package DesignPattern.AdapterPattern.WeatherServiceAdapter;

public class LegacyWeatherService {
    
    public int getTemperature(double latitude, double longitude) {
        return 23;
    }
    public int getHumidity(String location) {
        return 54;
    }

}
