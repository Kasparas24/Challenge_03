import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Layer<Park> parkLayer = new Layer<>();
        parkLayer.addElement(new Park("Aukštaitija National Park", "55.3717, 26.0140"));
        parkLayer.addElement(new Park("Žemaitija National Park", "56.0436, 22.2755"));
        parkLayer.addElement(new Park("Dzūkija National Park", "54.0500, 24.2500"));
        parkLayer.addElement(new Park("Curonian Spit National Park (Kuršių Nerija)", "55.2833, 20.9667"));

        parkLayer.renderLayer();

        List<River> rivers = Arrays.asList(
                new River("Neman River (Nemunas)", "54.0122, 23.9648", "54.8985, 23.9002", "55.0769, 22.7594"),
                new River("Neris River", "54.6981, 25.2670", "55.0731, 24.2800", "54.8700, 23.9117"),
                new River("Venta River", "56.2326, 22.5208", "56.3167, 22.3333", "56.0017, 22.9556")
        );

        Layer<River> riverLayer = new Layer<>();
        riverLayer.addElements(rivers);

        riverLayer.renderLayer();
    }
}