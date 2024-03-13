import java.util.ArrayList;

public abstract class CartaOroFunghi extends CartaOro{


    public CartaOroFunghi(int idCarta, String artRef, ArrayList<Angolo> angoliFronte, int puntiAttribuiti, ArrayList<Risorsa> requisitiRisorse) {
        super(idCarta, artRef, angoliFronte, new Funghi(), puntiAttribuiti, requisitiRisorse);
    }
}
