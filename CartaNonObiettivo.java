import java.util.ArrayList;
import java.util.Arrays;

public abstract class CartaNonObiettivo extends Carta{

    private ArrayList<Angolo> angoliFronte;
    private ArrayList<Angolo> angoliRetro;
    private int piazzataInFronte = 1;

    public CartaNonObiettivo(int idCarta, String artRef, ArrayList<Angolo> angoliFronte, ArrayList<Angolo> angoliRetro) {
        super(idCarta, artRef);
        this.angoliFronte = angoliFronte;
        this.angoliRetro = angoliRetro;
    }

    /**
     * Printa a console gli angoli frontali della carta con [0] se non è disponibile e [1] se disponibile
     */
    public void printAngoliFronte() {
        System.out.println("[" + angoliFronte.get(3).getAngoloDisponibile() + "][" + angoliFronte.get(0).getAngoloDisponibile() + "]");
        System.out.println("[" + angoliFronte.get(2).getAngoloDisponibile() + "][" + angoliFronte.get(1).getAngoloDisponibile() + "]");
    }

    /**
     * Printa a console gli angoli posteriori della carta con [0] se non è disponibile e [1] se disponibile
     */
    public void printAngoliRetro() {
        System.out.println("[" + angoliRetro.get(3).getAngoloDisponibile() + "][" + angoliRetro.get(0).getAngoloDisponibile() + "]");
        System.out.println("[" + angoliRetro.get(2).getAngoloDisponibile() + "][" + angoliRetro.get(1).getAngoloDisponibile() + "]");
    }

    /**
     * Ritorna 1 se la carta è piazzata frontalmente sul tavolo, 0 altrimenti
     * @return
     */
    public int getPiazzataInFronte() {
        return piazzataInFronte;
    }

    public ArrayList<Angolo> getAngoliFronte() {
        return angoliFronte;
    }

    public ArrayList<Angolo> getAngoliRetro() {
        return angoliRetro;
    }

    public void setPiazzataInFronte(int piazzataInFronte) {
        this.piazzataInFronte = piazzataInFronte;
    }
}
