package Vehicle;

import Displays.Displays;
import Location.Location;

public class Vehicle {
    private GPS gps;
    private DistanceTracker distanceTracker;

    public GPS getGPS() {
        return this.gps;
    }

    public DistanceTracker getDistanceTracker() {
        return this.distanceTracker;
    }

    Vehicle() {
        this.gps = new GPS();
        this.distanceTracker = new DistanceTracker();
    }

    Vehicle(Location location) {
        this.gps = new GPS(location);
        this.distanceTracker = new DistanceTracker();
    }
}
