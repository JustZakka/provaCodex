import java.util.ArrayList;

public class CartaRisorsa extends CartaRisorsaOro{
    public CartaRisorsa(int idCarta, String artRef, ArrayList<Angolo> angoliFronte, Risorsa risorsaRetroCentro) {
        super(idCarta, artRef, angoliFronte, risorsaRetroCentro);
    }
}
