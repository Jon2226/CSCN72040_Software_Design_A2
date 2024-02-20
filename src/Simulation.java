import Danger.DangerZone;
import Displays.Displays;
import Location.Location;
import Vehicle.Vehicle;

public class Simulation {
    private DangerZone dangerZone;
    private Displays displays;
    private Vehicle vehicle;

    public void changeLocation(Location location) {
        vehicle.getGPS().setLocation(location);
    }

    public void changeLocation(double x, double y) {
        Location location = new Location(x, y);
        vehicle.getGPS().setLocation(location);
    }

    public void runSimulation() {
        Thread.sleep(1500);

    }

    Simulation() {
        DangerZone dangerZone;
        Displays displays;
        Vehicle vehicle;
    }
}
