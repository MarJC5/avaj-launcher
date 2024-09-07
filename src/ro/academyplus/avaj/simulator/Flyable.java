package ro.academyplus.avaj.simulator;

public abstract class Flyable {
    // Attributes

    protected WeatherTower weatherTower;

    // Methods
    public abstract void updateConditions();

    public void registerTower(WeatherTower p_tower) {
        this.weatherTower = p_tower;
    }
}
