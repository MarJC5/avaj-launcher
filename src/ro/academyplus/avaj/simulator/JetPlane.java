package ro.academyplus.avaj.simulator;

public class JetPlane extends Aircraft {
    
    public JetPlane(long p_id, String p_name, Coordinates p_coordinate) {
        super(p_id, p_name, p_coordinate);
    }

    @Override
    public void updateConditions() {
        String weather = this.weatherTower.getWeather(this.coordinates);
        
        switch (weather) {
            case "SUN":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude(),
                    this.coordinates.getLatitude() + 10,
                    this.coordinates.getHeight() + 2
                );
                break;
            case "RAIN":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude(),
                    this.coordinates.getLatitude() + 5,
                    this.coordinates.getHeight()
                );
                break;
            case "FOG":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude(),
                    this.coordinates.getLatitude() + 1,
                    this.coordinates.getHeight()
                );
                break;
            case "SNOW":
                this.coordinates = new Coordinates(
                    this.coordinates.getLongitude(),
                    this.coordinates.getLatitude(),
                    this.coordinates.getHeight() + 7
                );
                break;
            default:
                break;
        }
    }
}