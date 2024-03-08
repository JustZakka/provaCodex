import java.util.ArrayList;

public abstract class CartaRisorsaOro extends CartaNonObiettivo{


    private Risorsa risorsaRetroCentro;

    public CartaRisorsaOro(ArrayList<Risorsa> risorseFronteAngoli, int[] angoliFronteDisponibili, Risorsa risorsaRetro) {
        super(risorseFronteAngoli, angoliFronteDisponibili, new int[]{1, 1, 1, 1});
        this.risorsaRetroCentro = risorsaRetro;
    }
}
