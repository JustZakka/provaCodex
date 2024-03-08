import java.util.ArrayList;

public abstract class CartaNonObiettivo {

    private ArrayList<Risorsa> risorseFronteAngoli;
    private ArrayList<Boolean> angoliFronteDisponibili;
    private ArrayList<Boolean> angoliRetroDisponibili;

    public CartaNonObiettivo(ArrayList<Risorsa> risorseFronteAngoli, ArrayList<Boolean> angoliFronteDisponibili, ArrayList<Boolean> angoliRetroDisponibili) {
        this.risorseFronteAngoli = risorseFronteAngoli;
        this.angoliFronteDisponibili = angoliFronteDisponibili;
        this.angoliRetroDisponibili = angoliRetroDisponibili;
    }
}
