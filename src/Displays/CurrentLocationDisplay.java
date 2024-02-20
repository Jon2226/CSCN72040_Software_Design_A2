package Displays;

import Vehicle.Vehicle;

public class CurrentLocationDisplay {
    public void displayCurrentLocation(Vehicle vehicle) {
        System.out.printf("The vehicle is currently located at (%f, %f).\n",
                vehicle.getGPS().getLocation().getX(), vehicle.getGPS().getLocation().getY());
    }
}
