import java.util.ArrayList;

public class CartaIniziale extends CartaNonObiettivo{

    private ArrayList<Risorsa> risorseRetroAngoli;
    private ArrayList<Risorsa> risorseRetroCentro;

    public CartaIniziale(ArrayList<Risorsa> risorseFronteAngoli, int[] angoliRetroDisponibili, ArrayList<Risorsa> risorseRetroAngoli, ArrayList<Risorsa> risorseRetroCentro) {
        super(risorseFronteAngoli, new int[]{1, 1, 1, 1}, angoliRetroDisponibili);
        this.risorseRetroAngoli = risorseRetroAngoli;
        this.risorseRetroCentro = risorseRetroCentro;
    }
}
