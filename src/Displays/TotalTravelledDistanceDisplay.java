package Displays;

import Vehicle.Vehicle;

public class TotalTravelledDistanceDisplay {
    public void displayTotalDistanceTravelled(Vehicle vehicle) {
        System.out.printf("The vehicle has travelled a distance of %lf units",
        vehicle.getDistanceTracker().getTotalDistanceTravelled());
    }

}
