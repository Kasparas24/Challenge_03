public class River extends Line {

    public River(String name, String... locations) {
        super(Mappable.stringToMultiLatLon(locations));
        this.name = name;
    }

    private String name;

    @Override
    public void render() {
        Mappable.printOut(name, getClass().getSimpleName().toUpperCase(), getLocations());
    }

}
