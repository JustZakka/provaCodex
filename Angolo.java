public class Angolo {

    private int angoloDisponibile;
    private RisorsaOggetto risorsaOggetto;

    public Angolo(int angoloDisponibile, RisorsaOggetto risorsa) {
        this.angoloDisponibile = angoloDisponibile;
        this.risorsaOggetto = risorsa;
    }

    public void setAngoloDisponibile(int angoloDisponibile) {
        this.angoloDisponibile = angoloDisponibile;
    }

    public int getAngoloDisponibile() {
        return angoloDisponibile;
    }

    public RisorsaOggetto getRisorsa() {
        return risorsaOggetto;
    }
}
