import java.util.ArrayList;

public abstract class CartaRisorsaVegetale extends CartaRisorsa {


    public CartaRisorsaVegetale(int idCarta, String artRef, ArrayList<Angolo> angoliFronte) {
        super(idCarta, artRef, angoliFronte, new Vegetale());
    }
}
