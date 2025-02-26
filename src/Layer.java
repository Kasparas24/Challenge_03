import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Layer<T extends Mappable> {

    private List<T> layerElements = new ArrayList<>();

    public void addElement(T element) {
        layerElements.add(element);
    }

    public void addElements(Collection<T> elements) {
        layerElements.addAll(elements);
    }

    public void renderLayer() {
        layerElements.forEach(Mappable::render);
    }

}
