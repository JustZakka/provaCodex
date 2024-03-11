import java.util.ArrayList;
import java.util.Arrays;

public class CartaRisorsaVegetale1 extends CartaRisorsaVegetale{

    public CartaRisorsaVegetale1() {
        super(new ArrayList<>(Arrays.asList(
                new Angolo(1, null),
                new Angolo(0, null),
                new Angolo(1, new Vegetale()),
                new Angolo(1, new Vegetale())
        )));
    }
}
