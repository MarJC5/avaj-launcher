package ro.academyplus.avaj.simulator;

public class Helicopter extends Aircraft {
    // Constructor

    public Helicopter(long p_id, String p_name, Coordinates p_coordinate) {
        super(p_id, p_name, p_coordinate);
    }

    // Methods

    @Override
    public void updateConditions() {
        String weather = this.weatherTower.getWeather(this.coordinates);
        
        switch (weather) {
            case "SUN":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude() + 10,
                    this.coordinates.getLatitude(),
                    this.coordinates.getHeight() + 2
                );
                break;
            case "RAIN":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude() + 5,
                    this.coordinates.getLatitude(),
                    this.coordinates.getHeight()
                );
                break;
            case "FOG":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude() + 1,
                    this.coordinates.getLatitude(),
                    this.coordinates.getHeight()
                );
                break;
            case "SNOW":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude(),
                    this.coordinates.getLatitude(),
                    this.coordinates.getHeight() - 12
                );
                break;
            default:
                break;
        }
    }
}