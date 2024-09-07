package ro.academyplus.avaj.simulator;

public class Aircraft extends Flyable {
    // Attributes
    
    protected long id;
    protected String name;
    protected Coordinates coordinates;

    // Constructor

    public Aircraft(long p_id, String p_name, Coordinates p_coordinate) {
        this.id = p_id;
        this.name = p_name;
        this.coordinates = p_coordinate;
    }

    // Methods

    @Override
    public void updateConditions() {
        // Empty as children will implement
    } 

}