package ro.academyplus.avaj.simulator;

public class Baloon extends Aircraft {
    // Constructor

    public Baloon(long p_id, String p_name, Coordinates p_coordinate) {
        super(p_id, p_name, p_coordinate);
    }

    // Methods

    @Override
    public void updateConditions() {
        String weather = this.weatherTower.getWeather(this.coordinates);
        
        switch (weather) {
            case "SUN":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude() + 2,
                    this.coordinates.getLatitude(),
                    this.coordinates.getHeight() + 4
                );
                break;
            case "RAIN":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude(),
                    this.coordinates.getLatitude(),
                    this.coordinates.getHeight() - 5
                );
                break;
            case "FOG":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude(),
                    this.coordinates.getLatitude(),
                    this.coordinates.getHeight() - 3
                );
                break;
            case "SNOW":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude(),
                    this.coordinates.getLatitude(),
                    this.coordinates.getHeight() - 15
                );
                break;
            default:
                break;
        }
    }
}