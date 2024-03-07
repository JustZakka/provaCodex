public class Giocatore {

    private Segnalino segnalino;
    private MazzoGiocatore mazzoGiocatore;
    private CartaIniziale cartaIniziale;
    private boolean firstPlayer;
    private Tavolo tavoloGiocatore;

    public Giocatore(Segnalino segnalino, MazzoGiocatore mazzoGiocatore, CartaIniziale cartaIniziale, boolean firstPlayer, Tavolo tavoloGiocatore, Tavolo tavoloGiocatore1) {
        this.segnalino = segnalino;
        this.mazzoGiocatore = mazzoGiocatore;
        this.cartaIniziale = cartaIniziale;
        this.firstPlayer = firstPlayer;
        this.tavoloGiocatore = tavoloGiocatore1;
    }

    public Giocatore(Tavolo tavoloGiocatore) {
        this.tavoloGiocatore = tavoloGiocatore;
    }

    public void piazzaCartaIniziale(int r, int c) {
        tavoloGiocatore.getSlots()[r][c].setSlotOccupato(1);
    }

    public void analizzaTavolo() {
        tavoloGiocatore.printTavolo();
    }


}
