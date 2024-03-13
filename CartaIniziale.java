import java.util.ArrayList;

public class CartaIniziale extends CartaNonObiettivo{

    private ArrayList<Risorsa> risorseRetroCentro;

    public CartaIniziale(int idCarta, String artRef, ArrayList<Angolo> angoliFronte, ArrayList<Angolo> angoliRetro, ArrayList<Risorsa> risorseRetroCentro) {
        super(idCarta, artRef, angoliFronte, angoliRetro);
        this.risorseRetroCentro = risorseRetroCentro;
    }
}
