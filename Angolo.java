public class Angolo {

    private int angoloDisponibile;
    private Risorsa risorsa;

    public Angolo(int angoloDisponibile, Risorsa risorsa) {
        this.angoloDisponibile = angoloDisponibile;
        this.risorsa = risorsa;
    }

    public void setAngoloDisponibile(int angoloDisponibile) {
        this.angoloDisponibile = angoloDisponibile;
    }

    public int getAngoloDisponibile() {
        return angoloDisponibile;
    }

    public Risorsa getRisorsa() {
        return risorsa;
    }
}
