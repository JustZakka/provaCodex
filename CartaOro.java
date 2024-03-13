import java.util.ArrayList;

public class CartaOro extends CartaRisorsaOro {

    private int puntiAttribuiti;
    private ArrayList<Risorsa> requisitiRisorse;

    //TODO: aggiungere l'attributo requisitiPunti


    public CartaOro(int idCarta, String artRef, ArrayList<Angolo> angoliFronte, Risorsa risorsaRetroCentro, int puntiAttribuiti, ArrayList<Risorsa> requisitiRisorse) {
        super(idCarta, artRef, angoliFronte, risorsaRetroCentro);
        this.puntiAttribuiti = puntiAttribuiti;
        this.requisitiRisorse = requisitiRisorse;
    }
}
