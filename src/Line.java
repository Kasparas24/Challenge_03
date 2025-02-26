import java.util.Arrays;

abstract class Line implements Mappable {

    Line(double[][] locations) {
        this.locations = locations;
    }

    private final double[][] locations;

    public String getLocations() {
        return Arrays.deepToString(locations);
    }
}
