package ro.academyplus.avaj.simulator;

public class Coordinates {
    // Attributes

    private int longitude;
    private int latitude;
    private int height;

    // Constructor

    Coordinates(int p_longitude, int p_latitude, int p_height) {
        this.longitude = p_longitude;
        this.latitude = p_latitude;
        this.height = p_height;
    }

    // Getters

    public int getLongitude() {
        return this.longitude;
    }

    public int getLatitude() {
        return this.latitude;
    }

    public int getHeight() {
        return this.height;
    }
}