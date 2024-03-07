import java.util.ArrayList;

public abstract class CartaRisorsaOro {

    ArrayList<Boolean> angoliFronteDisponibili;
    ArrayList<Risorsa> risorseFronteAngoli;
    Risorsa risorsaRetro;

    public CartaRisorsaOro(ArrayList<Boolean> angoliFronteDisponibili, ArrayList<Risorsa> risorseFronteAngoli, Risorsa risorsaRetro) {
        this.angoliFronteDisponibili = angoliFronteDisponibili;
        this.risorseFronteAngoli = risorseFronteAngoli;
        this.risorsaRetro = risorsaRetro;
    }

}
