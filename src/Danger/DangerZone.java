package Danger;

import Location.Location;

public class DangerZone {

    private final Location dangerLocation;
    private final double radius;

    DangerZone() {
        this.dangerLocation = new Location(0,0);
        this.radius = 0;
    }

    DangerZone(double x, double y, double radius) {
        this.dangerLocation = new Location(x, y);
        this.radius = radius;
    }

    public Location getDangerLocation() {
        return this.dangerLocation;
    }

    public double getDangerRadius() {
        return this.radius;
    }

}
