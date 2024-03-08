import java.util.ArrayList;

public class CartaRisorsa extends CartaRisorsaOro{
    public CartaRisorsa(ArrayList<Risorsa> risorseFronteAngoli, ArrayList<Boolean> angoliFronteDisponibili, ArrayList<Boolean> angoliRetroDisponibili, Risorsa risorsaRetro) {
        super(risorseFronteAngoli, angoliFronteDisponibili, angoliRetroDisponibili, risorsaRetro);
    }
}
