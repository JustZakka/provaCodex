import java.util.ArrayList;

public class CartaOro extends CartaRisorsaOro {

    private int puntiAttribuiti;
    private ArrayList<Risorsa> requisitiRisorse;

    //TODO: aggiungere l'attributo requisitiPunti


    public CartaOro(ArrayList<Risorsa> risorseFronteAngoli, int[] angoliFronteDisponibili, Risorsa risorsaRetro, int puntiAttribuiti, ArrayList<Risorsa> requisitiRisorse) {
        super(risorseFronteAngoli, angoliFronteDisponibili, risorsaRetro);
        this.puntiAttribuiti = puntiAttribuiti;
        this.requisitiRisorse = requisitiRisorse;
    }
}
