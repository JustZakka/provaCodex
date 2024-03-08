import java.util.ArrayList;

public abstract class CartaNonObiettivo {

    private ArrayList<Risorsa> risorseFronteAngoli;
    private int[] angoliFronteDisponibili;
    private int[] angoliRetroDisponibili;

    public CartaNonObiettivo(ArrayList<Risorsa> risorseFronteAngoli, int[] angoliFronteDisponibili, int[] angoliRetroDisponibili) {
        this.risorseFronteAngoli = risorseFronteAngoli;
        this.angoliFronteDisponibili = angoliFronteDisponibili;
        this.angoliRetroDisponibili = angoliRetroDisponibili;
    }


}
