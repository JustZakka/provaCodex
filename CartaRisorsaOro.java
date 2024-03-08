import java.util.ArrayList;

public abstract class CartaRisorsaOro extends CartaNonObiettivo{


    private Risorsa risorsaRetroCentro;

    public CartaRisorsaOro(ArrayList<Risorsa> risorseFronteAngoli, ArrayList<Boolean> angoliFronteDisponibili, ArrayList<Boolean> angoliRetroDisponibili, Risorsa risorsaRetro) {
        super(risorseFronteAngoli, angoliFronteDisponibili, angoliRetroDisponibili);
        this.risorsaRetroCentro = risorsaRetro;
    }
}
