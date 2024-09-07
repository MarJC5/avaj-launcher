package ro.academyplus.avaj.simulator;

import java.util.ArrayList;
import java.util.List;

public class Tower {
    private List<Flyable> observers = new ArrayList<>();

    public void register(Flyable p_flyable) {
        if (!observers.contains(p_flyable)) {
            observers.add(p_flyable);
            // implement a way to print the message that the flyable has registered to the tower
        }
    }

    public void unregister(Flyable p_flyable) {
        observers.remove(p_flyable);
        // implement a way to print the message that the flyable has registered to the tower
    }

    protected void conditionsChanged() {
        for (Flyable observer : observers) {
            observer.updateConditions();
        }
    }
}