package ro.academyplus.avaj.simulator;

import java.util.ArrayList;
import java.util.List;

public class Tower {
    private List<Flyable> observers = new ArrayList<>();

    public void register(Flyable p_flyable) {
        if (!observers.contains(p_flyable)) {
            observers.add(p_flyable);
            System.out.println("Tower says: " + p_flyable.getClass().getSimpleName() + "#" + p_flyable.getId() + " registered to weather tower.");
        }
    }

    public void unregister(Flyable p_flyable) {
        observers.remove(p_flyable);
        System.out.println("Tower says: " + p_flyable.getClass().getSimpleName() + "#" + p_flyable.getId() + " unregistered from weather tower.");
    }

    protected void conditionsChanged() {
        for (Flyable observer : observers) {
            observer.updateConditions();
        }
    }
}