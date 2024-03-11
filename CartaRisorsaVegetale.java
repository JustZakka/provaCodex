import java.util.ArrayList;

public abstract class CartaRisorsaVegetale extends CartaRisorsa {

    public CartaRisorsaVegetale(ArrayList<Angolo> angoliFronte) {
        super(angoliFronte, new Vegetale());
    }
}
