import java.util.ArrayList;
import java.util.Arrays;

public abstract class CartaNonObiettivo{

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

    /**
     * Printa a console gli angoli frontali della carta con [0] se non è disponibile e [1] se disponibile
     */
    public void printAngoliFronte() {
        System.out.println("[" + angoliFronteDisponibili[3] + "][" + angoliFronteDisponibili[0] + "]");
        System.out.println("[" + angoliFronteDisponibili[2] + "][" + angoliFronteDisponibili[1] + "]");
    }

    /**
     * Printa a console gli angoli posteriori della carta con [0] se non è disponibile e [1] se disponibile
     */
    public void printAngoliRetro() {
        System.out.println("[" + angoliRetroDisponibili[3] + "][" + angoliRetroDisponibili[0] + "]");
        System.out.println("[" + angoliRetroDisponibili[2] + "][" + angoliRetroDisponibili[1] + "]");
    }

    /**
     * Ritorna 1 se la carta è piazzata frontalmente sul tavolo, 0 altrimenti
     * @return
     */
    public int getPiazzataInFronte() {
        return piazzataInFronte;
    }

    /**
     * Ritorna un array di dimensinoe 4 rappresentanti le disponibilità degli angoli frontali, a partire da quello in alto
     * a destra in senso orario
     * @return
     */
    public int[] getAngoliFronteDisponibili() {
        return angoliFronteDisponibili;
    }

    /**
     * Ritorna un array di dimensinoe 4 rappresentanti le disponibilità degli angoli posteriori, a partire da quello in alto
     * a destra in senso orario
     * @return
     */
    public int[] getAngoliRetroDisponibili() {
        return angoliRetroDisponibili;
    }

    public void setPiazzataInFronte(int piazzataInFronte) {
        this.piazzataInFronte = piazzataInFronte;
    }
}
