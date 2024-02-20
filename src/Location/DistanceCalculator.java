package Location;

public class DistanceCalculator {

    // calculate Euclidean distance using builtin distance() from Point2D library
    public double calculateDistance(Location point1, Location point2) {
        return point1.distance(point2);
    }
}
