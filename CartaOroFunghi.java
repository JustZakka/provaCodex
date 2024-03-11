import java.util.ArrayList;

public abstract class CartaOroFunghi extends CartaOro{

    public CartaOroFunghi(ArrayList<Angolo> angoliFronte, int puntiAttribuiti, ArrayList<Risorsa> requisitiRisorse) {
        super(angoliFronte, new Funghi(), puntiAttribuiti, requisitiRisorse);
    }
}
