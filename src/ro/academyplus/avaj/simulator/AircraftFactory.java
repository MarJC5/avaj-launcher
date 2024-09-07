package ro.academyplus.avaj.simulator;

public class AircraftFactory {
    // Attributes
    private static AircraftFactory instance;

    // Constructor
    private AircraftFactory() {
    }

    // Getters
    public static AircraftFactory getFactory() {
        if (instance == null) {
            instance = new AircraftFactory();
        }
        return instance;
    }

    // Methods

    public static Flyable newAircraft(String type, String name, Coordinates coordinates) {
        switch (type) {
            case "Baloon":
                return new Baloon(1L, name, coordinates);
            case "JetPlane":
                return new JetPlane(2L, name, coordinates);
            case "Helicopter":
                return new Helicopter(3L, name, coordinates);
            default:
                return null;
        }
    }
}
