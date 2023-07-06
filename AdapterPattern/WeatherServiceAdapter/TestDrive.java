package DesignPattern.AdapterPattern.WeatherServiceAdapter;

public class TestDrive {
    
    public static void main(String[] args) {
        String location = "Jaipur";
        LegacyWeatherService legacyWeatherService = new LegacyWeatherService();
        System.out.println(legacyWeatherService.getHumidity(location));
        System.out.println(legacyWeatherService.getTemperature(21,32));
        
        WeatherService weatherService = new WeatherServiceAdapter(legacyWeatherService);

        System.out.println(weatherService.getTemperature("Jaipur"));
        System.out.println(weatherService.getHumidity("Jaipur"));
    }
}
