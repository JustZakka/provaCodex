import java.util.ArrayList;

public class CartaIniziale extends CartaNonObiettivo{

    private ArrayList<Risorsa> risorseRetroCentro;

    public CartaIniziale(ArrayList<Angolo> angoliFronte, ArrayList<Angolo> angoliRetro, ArrayList<Risorsa> risorseRetroCentro) {
        super(angoliFronte, angoliRetro);
        this.risorseRetroCentro = risorseRetroCentro;
    }
}
