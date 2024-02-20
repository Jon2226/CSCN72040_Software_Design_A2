package Displays;

import Danger.DangerZone;
import Location.DistanceCalculator;
import Vehicle.Vehicle;

public class DangerZoneDisplay {
    private Boolean insideDangerZone;
    private final DangerZoneAlarm dangerZoneAlarm;
    private final DistanceCalculator distanceCalculator;

    public void checkInsideDangerZone(Vehicle vehicle, DangerZone dangerZone) {
        if (this.distanceCalculator.calculateDistance(dangerZone.getDangerLocation(), vehicle.getGPS().getLocation())
                < dangerZone.getDangerRadius()) {

            this.insideDangerZone = true;

            dangerZoneAlarm.fireAlarm();
        } else {
            this.insideDangerZone = false;
        }
    }

    public Boolean insideDangerZone() {
        return this.insideDangerZone;
    }

    DangerZoneDisplay() {
        this.insideDangerZone = false;
        this.dangerZoneAlarm = new DangerZoneAlarm();
        this.distanceCalculator = new DistanceCalculator();
    }
}
