import java.util.ArrayList;

public class CartaIniziale {

    private ArrayList<Risorsa> risorseFronteAngoli;
    private ArrayList<Risorsa> risorseRetroAngoli;
    private ArrayList<Risorsa> risorseRetroCentro;
    private ArrayList<Boolean> angoliRetroDisponibili;

    public CartaIniziale(ArrayList<Risorsa> risorseFronteAngoli, ArrayList<Risorsa> risorseRetroAngoli, ArrayList<Risorsa> risorseRetroCentro, ArrayList<Boolean> angoliRetroDisponibili) {
        this.risorseFronteAngoli = risorseFronteAngoli;
        this.risorseRetroAngoli = risorseRetroAngoli;
        this.risorseRetroCentro = risorseRetroCentro;
        this.angoliRetroDisponibili = angoliRetroDisponibili;
    }


    //SETTERS
    public void setRisorseFronteAngoli(ArrayList<Risorsa> risorseFronteAngoli) {
        this.risorseFronteAngoli = risorseFronteAngoli;
    }

    public void setRisorseRetroAngoli(ArrayList<Risorsa> risorseRetroAngoli) {
        this.risorseRetroAngoli = risorseRetroAngoli;
    }

    public void setRisorseRetroCentro(ArrayList<Risorsa> risorseRetroCentro) {
        this.risorseRetroCentro = risorseRetroCentro;
    }

    public void setAngoliRetroDisponibili(ArrayList<Boolean> angoliRetroDisponibili) {
        this.angoliRetroDisponibili = angoliRetroDisponibili;
    }

    //GETTERS
    public ArrayList<Risorsa> getRisorseFronteAngoli() {
        return risorseFronteAngoli;
    }

    public ArrayList<Risorsa> getRisorseRetroAngoli() {
        return risorseRetroAngoli;
    }

    public ArrayList<Risorsa> getRisorseRetroCentro() {
        return risorseRetroCentro;
    }

    public ArrayList<Boolean> getAngoliRetroDisponibili() {
        return angoliRetroDisponibili;
    }
}
