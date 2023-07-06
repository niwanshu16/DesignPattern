package DesignPattern.AdapterPattern.WeatherServiceAdapter;

public class WeatherServiceAdapter extends WeatherService {
    
    LegacyWeatherService legacyWeatherService;

    public WeatherServiceAdapter(LegacyWeatherService legacyWeatherService) {
        this.legacyWeatherService = legacyWeatherService;
    }

    public int getTemperature(String location) {
        double longitude = getLongitude(location);
        double latitude = getLatitude(location);

        return legacyWeatherService.getTemperature(latitude,longitude);
    }

    public double getLongitude(String location) {
        return 32;
    }

    public double getLatitude(String location) {
        return 43;
    }

    public int getHumidity(String location) {
        return legacyWeatherService.getHumidity(location);
    }
}
