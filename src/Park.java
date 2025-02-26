public class Park extends Point {

    public Park(String name, String location) {
        super(Mappable.stringToLatLon(location));
        this.name = name;
    }

    private String name;

    @Override
    public void render() {
        Mappable.printOut(name, getClass().getSimpleName().toUpperCase(), getLocation());
    }
}
