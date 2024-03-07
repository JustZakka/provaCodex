import java.util.ArrayList;

public class CartaRisorsa extends CartaRisorsaOro{

    public CartaRisorsa(ArrayList<Boolean> angoliFronteDisponibili, ArrayList<Risorsa> risorseFronteAngoli, Risorsa risorsaRetro) {
        super(angoliFronteDisponibili, risorseFronteAngoli, risorsaRetro);
    }
}
