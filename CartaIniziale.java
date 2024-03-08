import java.util.ArrayList;

public class CartaIniziale extends CartaNonObiettivo{

    private ArrayList<Risorsa> risorseRetroAngoli;
    private ArrayList<Risorsa> risorseRetroCentro;

    public CartaIniziale(ArrayList<Risorsa> risorseFronteAngoli, ArrayList<Boolean> angoliFronteDisponibili, ArrayList<Boolean> angoliRetroDisponibili, ArrayList<Risorsa> risorseRetroAngoli, ArrayList<Risorsa> risorseRetroCentro) {
        super(risorseFronteAngoli, angoliFronteDisponibili, angoliRetroDisponibili);
        this.risorseRetroAngoli = risorseRetroAngoli;
        this.risorseRetroCentro = risorseRetroCentro;
    }
}
