package ro.academyplus.avaj.simulator;

public class WeatherTower extends Tower {
    // Methods

    public String getWeather(Coordinates p_coordinates) {
        return WeatherProvider.getInstance().getCurrentWeather(p_coordinates);
    }

    public void changeWeather() {
        this.conditionsChanged();
    }
}
