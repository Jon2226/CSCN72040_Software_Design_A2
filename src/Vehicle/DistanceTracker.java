package Vehicle;

public class DistanceTracker {
    private double totalDistanceTravelled;

    public void updateTotalDistanceTravelled(double additionalDistance) {
        this.totalDistanceTravelled += additionalDistance;
    }

    public void setTotalDistanceTravelled(double totalDistanceTravelled) {
        this.totalDistanceTravelled = totalDistanceTravelled;
    }

    public double getTotalDistanceTravelled() {
        return this.totalDistanceTravelled;
    }

    DistanceTracker() {
        this.totalDistanceTravelled = 0;
    }

    DistanceTracker(double totalDistanceTravelled) {
        this.totalDistanceTravelled = totalDistanceTravelled;
    }
}
