package ro.academyplus.avaj.simulator;

public class WeatherProvider {
    // Attributes
    private static WeatherProvider instance;
    private String[] weather;

    // Constructor

    private WeatherProvider() {
        this.weather = new String[] {"RAIN", "FOG", "SUN", "SNOW"};
    }

    // Getters

    public static WeatherProvider getInstance() {
        if (instance == null) {
            instance = new WeatherProvider();
        }
        return instance;
    }
    
    // Methods

    public String getCurrentWeather(Coordinates p_coordinates) {
        int sum = p_coordinates.getLongitude() + p_coordinates.getLatitude() + p_coordinates.getHeight();
        return this.weather[sum % 4];
    }
}
