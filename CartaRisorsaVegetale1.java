import java.util.ArrayList;
import java.util.Arrays;

public class CartaRisorsaVegetale1 extends CartaRisorsaVegetale{

    public CartaRisorsaVegetale1(int idCarta, String artRef, ArrayList<Angolo> angoliFronte) {
        super(11, "1", new ArrayList<>(Arrays.asList(
                new Angolo(1, null),
                new Angolo(0, null),
                new Angolo(1, new Vegetale()),
                new Angolo(1, new Vegetale())
        )));
    }
}
