import java.util.ArrayList;

public class CartaOro extends CartaRisorsaOro {

    private int puntiAttribuiti;
    private ArrayList<Risorsa> requisitiRisorse;

    //TODO: aggiungere l'attributo requisitiPunti


    public CartaOro(ArrayList<Risorsa> risorseFronteAngoli, ArrayList<Boolean> angoliFronteDisponibili, ArrayList<Boolean> angoliRetroDisponibili, Risorsa risorsaRetro, int puntiAttribuiti, ArrayList<Risorsa> requisitiRisorse) {
        super(risorseFronteAngoli, angoliFronteDisponibili, angoliRetroDisponibili, risorsaRetro);
        this.puntiAttribuiti = puntiAttribuiti;
        this.requisitiRisorse = requisitiRisorse;
    }

    public void setPuntiAttribuiti(int puntiAttribuiti) {
        this.puntiAttribuiti = puntiAttribuiti;
    }

    public void setRequisitiRisorse(ArrayList<Risorsa> requisitiRisorse) {
        this.requisitiRisorse = requisitiRisorse;
    }

    public int getPuntiAttribuiti() {
        return puntiAttribuiti;
    }

    public ArrayList<Risorsa> getRequisitiRisorse() {
        return requisitiRisorse;
    }
}
