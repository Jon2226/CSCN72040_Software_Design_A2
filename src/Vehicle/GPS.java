package Vehicle;

import Location.Location;

public class GPS {
    private Location location;
    private Location previousLocation;

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public GPS() {
        this.location = new Location();
    }

    public  GPS(Location location) {
        this.location = location;
    }
}
