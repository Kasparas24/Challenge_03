import java.util.Arrays;

abstract class Point implements Mappable {

    Point(double[] location) {
        this.location = location;
    }

    private final double[] location;

    public String getLocation() {
        return Arrays.toString(location);
    }
}
