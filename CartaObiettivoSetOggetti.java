import java.util.ArrayList;

public class CartaObiettivoSetOggetti extends CartaObiettivo{

    private ArrayList<Oggetto> setOggetti;

    public CartaObiettivoSetOggetti(int idCarta, String artRef, int puntiAttribuiti, ArrayList<Oggetto> setOggetti) {
        super(idCarta, artRef, puntiAttribuiti);
        this.setOggetti = setOggetti;
    }
}
