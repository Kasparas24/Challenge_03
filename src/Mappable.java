import java.util.Arrays;

public interface Mappable {

    void render();

    static void printOut(String name, String typeName, String locations) {
        System.out.printf("Render %s as %s (%s)%n", name, typeName, locations);
    }

    static double[] stringToLatLon(String coordinates) {
        return Arrays.stream(coordinates.split(","))
                .mapToDouble(Double::parseDouble)
                .toArray();
    }

    static double[][] stringToMultiLatLon(String... coordinates) {
        double[][] coordinatesToDouble = new double[coordinates.length][];
        for (int i = 0; i < coordinates.length; i++) {
            coordinatesToDouble[i] = stringToLatLon(coordinates[i]);
        }
        return coordinatesToDouble;
    }

}
