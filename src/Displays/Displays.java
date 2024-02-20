package Displays;

import Danger.DangerZone;
import Vehicle.Vehicle;

// aggregator class to promote simplicity in the main function
public class Displays {
    private CurrentLocationDisplay currentLocationDisplay;
    private DangerZoneDisplay dangerZoneDisplay;
    private TotalTravelledDistanceDisplay totalTravelledDistanceDisplay;

    public void updateDisplays(Vehicle vehicle, DangerZone dangerZone) {
        this.currentLocationDisplay.displayCurrentLocation(vehicle);
        this.dangerZoneDisplay.checkInsideDangerZone(vehicle, dangerZone);
        this.totalTravelledDistanceDisplay.displayTotalDistanceTravelled(vehicle);
    }

    public Displays() {
        CurrentLocationDisplay currentLocationDisplay = new CurrentLocationDisplay();
        DangerZoneDisplay dangerZoneDisplay = new DangerZoneDisplay();
        TotalTravelledDistanceDisplay totalTravelledDistanceDisplay = new TotalTravelledDistanceDisplay();
    }
}
