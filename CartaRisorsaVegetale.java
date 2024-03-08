import java.util.ArrayList;

public abstract class CartaRisorsaVegetale extends CartaRisorsa {

    public CartaRisorsaVegetale(ArrayList<Risorsa> risorseFronteAngoli, int[] angoliFronteDisponibili) {
        super(risorseFronteAngoli, angoliFronteDisponibili, new Vegetale());
    }
}
