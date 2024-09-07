package ro.academyplus.avaj.simulator;

import java.io.*;
import java.util.*;

public class Simulator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ro.academyplus.avaj.simulator.Simulator scenario.txt");
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            PrintWriter writer = new PrintWriter(new FileWriter("simulation.txt"));

            // First line is the number of simulation cycles
            int simulationCycles = Integer.parseInt(reader.readLine());

            WeatherTower weatherTower = new WeatherTower();
            List<Flyable> flyables = new ArrayList<>();

            // Parse the rest of the file to register aircraft
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String type = parts[0];
                String name = parts[1];
                int longitude = Integer.parseInt(parts[2]);
                int latitude = Integer.parseInt(parts[3]);
                int height = Integer.parseInt(parts[4]);

                Coordinates coordinates = new Coordinates(longitude, latitude, height);
                Flyable flyable = AircraftFactory.newAircraft(type, name, coordinates);

                if (flyable != null) {
                    flyables.add(flyable);
                    flyable.registerTower(weatherTower);
                }
            }

            // Simulate the weather changes
            for (int i = 0; i < simulationCycles; i++) {
                weatherTower.changeWeather();
            }

            writer.close();
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}