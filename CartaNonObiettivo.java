import java.util.ArrayList;
import java.util.Arrays;

public abstract class CartaNonObiettivo {

    private ArrayList<Risorsa> risorseFronteAngoli;
    private int[] angoliFronteDisponibili;
    private int[] angoliRetroDisponibili;
    private int piazzataInFronte = 1;

    public CartaNonObiettivo(ArrayList<Risorsa> risorseFronteAngoli, int[] angoliFronteDisponibili, int[] angoliRetroDisponibili) {
        this.risorseFronteAngoli = risorseFronteAngoli;
        this.angoliFronteDisponibili = angoliFronteDisponibili;
        this.angoliRetroDisponibili = angoliRetroDisponibili;
    }

    @Override
    public String toString() {
        return "CartaNonObiettivo{" +
                "risorseFronteAngoli=" + risorseFronteAngoli +
                ", angoliFronteDisponibili=" + Arrays.toString(angoliFronteDisponibili) +
                ", angoliRetroDisponibili=" + Arrays.toString(angoliRetroDisponibili) +
                ", piazzataInFronte=" + piazzataInFronte +
                '}';
    }

    public void printAngoliFronte() {
        System.out.println("[" + angoliFronteDisponibili[3] + "][" + angoliFronteDisponibili[0] + "]");
        System.out.println("[" + angoliFronteDisponibili[2] + "][" + angoliFronteDisponibili[1] + "]");
    }
    public void printAngoliRetro() {
        System.out.println("[" + angoliRetroDisponibili[3] + "][" + angoliRetroDisponibili[0] + "]");
        System.out.println("[" + angoliRetroDisponibili[2] + "][" + angoliRetroDisponibili[1] + "]");
    }

    public int getPiazzataInFronte() {
        return piazzataInFronte;
    }

    public int[] getAngoliFronteDisponibili() {
        return angoliFronteDisponibili;
    }

    public int[] getAngoliRetroDisponibili() {
        return angoliRetroDisponibili;
    }

    public void setPiazzataInFronte(int piazzataInFronte) {
        this.piazzataInFronte = piazzataInFronte;
    }
}
