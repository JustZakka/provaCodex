import java.util.ArrayList;

public class CartaObiettivoSetOggetti extends CartaObiettivo{

    private ArrayList<Oggetto> setOggetti;

    public CartaObiettivoSetOggetti(int puntiAttribuiti, ArrayList<Oggetto> setOggetti) {
        super(puntiAttribuiti);
        this.setOggetti = setOggetti;
    }
}
