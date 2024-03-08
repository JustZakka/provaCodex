public class Giocatore {

    private Segnalino segnalino;
    private MazzoGiocatore mazzoGiocatore;
    private boolean firstPlayer;
    private Tavolo tavoloGiocatore;

    public Giocatore(Segnalino segnalino, MazzoGiocatore mazzoGiocatore, boolean firstPlayer, Tavolo tavoloGiocatore) {
        this.segnalino = segnalino;
        this.mazzoGiocatore = mazzoGiocatore;
        this.firstPlayer = firstPlayer;
        this.tavoloGiocatore = tavoloGiocatore;
    }

    public Giocatore(Tavolo tavoloGiocatore) {
        this.tavoloGiocatore = tavoloGiocatore;
    }

    public void piazzaCarta(CartaNonObiettivo carta, int r, int c) {
        tavoloGiocatore.getSlots()[r][c].setSlotOccupato(1);
        tavoloGiocatore.getSlots()[r][c].setCartaSlot(carta);
        System.out.println("Carta " + carta.getClass() + " piazzata nello slot [" + r + "][" + c + "]." );

    }

    public void analisiTavolo() {
        tavoloGiocatore.printTavolo();
    }

}
