import java.util.ArrayList;

public abstract class CartaOroFunghi extends CartaOro{

    public CartaOroFunghi(ArrayList<Risorsa> risorseFronteAngoli, int[] angoliFronteDisponibili, int puntiAttribuiti, ArrayList<Risorsa> requisitiRisorse) {
        super(risorseFronteAngoli, angoliFronteDisponibili, new Funghi(), puntiAttribuiti, requisitiRisorse);
    }
}
