public class Giocatore {

    private String nomeGiocatore;
    private Segnalino segnalino;
    private MazzoGiocatore mazzoGiocatore;
    private boolean firstPlayer;
    private Tavolo tavoloGiocatore;

    public Giocatore(String nomeGiocatore, Segnalino segnalino, MazzoGiocatore mazzoGiocatore,Tavolo tavoloGiocatore) {
        this.nomeGiocatore = nomeGiocatore;
        this.segnalino = segnalino;
        this.mazzoGiocatore = mazzoGiocatore;
        this.firstPlayer = false;
        this.tavoloGiocatore = tavoloGiocatore;
    }

    /**
     * Ritorna true se lo Slot è occupato, false altrimenti
     * @param r riga dello Slot
     * @param c colonna dello Slot
     * @return
     */
    private boolean checkSlotOccupato(int r, int c) {
        boolean flag;
        if (tavoloGiocatore.getSlots()[r][c].getSlotOccupato() == 1) {
            System.out.println("ERRORE: SLOT GIA' OCCUPATO");
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    /**
     * Ritorna true se la carta è nel mazzo del giocatore, false altrimenti
     * @param carta
     * @return
     */
    private boolean checkCartaInMazzo(CartaNonObiettivo carta) {
        boolean flag;
        if (!mazzoGiocatore.getCarte().contains(carta)) {
            System.out.println("ERRORE: CARTA NON DISPONIBILE NEL MAZZO");
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }

    /**
     * Ritorna true se l'angolo della carta è disponibile, false altrimenti
     * @param carta
     * @param fronte
     * @param angolo
     * @return
     */
    private boolean checkAngoloDisponibile(CartaNonObiettivo carta, int fronte, int angolo) {
        boolean flag;
        if (fronte == 1) {
            flag = carta.getAngoliFronteDisponibili()[angolo] == 1;
        } else {
            flag = carta.getAngoliRetroDisponibili()[angolo] == 1;
        }
        return flag;
    }

    /**
     * Piazza la carta Iniziale al centro del tavolo del Giocatore
     * @param fronte
     */
    public void piazzaCartaIniziale(int fronte) {
        int r, c;
        r = c = tavoloGiocatore.getSlots().length / 2;
        CartaIniziale carta = mazzoGiocatore.getCartaIniziale();
        carta.setPiazzataInFronte(fronte);
        tavoloGiocatore.getSlots()[r][c].setSlotOccupato(1);
        tavoloGiocatore.getSlots()[r][c].setCartaSlot(carta);
        mazzoGiocatore.setCartaIniziale(null);
        System.out.println("Carta " + carta.getClass() + " piazzata nello slot [" + r + "][" + c + "]." );
    }

    /**
     * Sia A una carta già piazzata sul tavolo, si vuole piazzare sopra di essa una carta B.
     * @param rCartaPiazzata riga della carta A
     * @param cCartaPiazzata colonna della carta B
     * @param cartaDaPiazzare carta B
     * @param fronte indica come sarà piazzata B, 1 è fronte 0 retro
     * @param angoloCartaPiazzata indica l'angolo della carta A dove verrà piazzata B
     */
    public void piazzaCarta(int rCartaPiazzata, int cCartaPiazzata, CartaNonObiettivo cartaDaPiazzare, int fronte, int angoloCartaPiazzata) {
        CartaNonObiettivo cartaPiazzata = tavoloGiocatore.getSlots()[rCartaPiazzata][cCartaPiazzata].getCartaSlot();
        if (!checkCartaInMazzo(cartaDaPiazzare)) return;
        if (checkAngoloDisponibile(cartaPiazzata, cartaPiazzata.getPiazzataInFronte(), angoloCartaPiazzata)) {
            int offSetR = calcolaOffSetR(angoloCartaPiazzata);
            int offSetC = calcolaOffSetC(angoloCartaPiazzata);
            int rCartaDaPiazzare = rCartaPiazzata + offSetR;
            int cCartaDaPiazzare = cCartaPiazzata + offSetC;
            int angoloOccupatoCartaDaPiazzare = trovaAngoloDaPiazzare(angoloCartaPiazzata);

            tavoloGiocatore.getSlots()[rCartaDaPiazzare][cCartaDaPiazzare].setCartaSlot(cartaDaPiazzare);
            tavoloGiocatore.getSlots()[rCartaDaPiazzare][cCartaDaPiazzare].setSlotOccupato(1);
            cartaDaPiazzare.setPiazzataInFronte(fronte);

            updateAngolo(cartaPiazzata, angoloCartaPiazzata);
            updateAngolo(cartaDaPiazzare, angoloOccupatoCartaDaPiazzare);

            mazzoGiocatore.getCarte().remove(cartaDaPiazzare);
            System.out.println("Carta " + cartaDaPiazzare.getClass() + " piazzata nello slot [" + rCartaDaPiazzare + "][" + cCartaDaPiazzare + "]." );
        }
    }

    public void pescaCarta() {

    }

    /**
     * Aggiorna lo stato di un angolo. Per esempio se viene piazzato una carta A sopra l'angolo in alto a destra di una carta B,
     * l'angolo in alto a destra di B verrà aggiornato a 0 mentre l'angolo in basso a sinistra della carta A verra aggiornato a 0
     * @param carta
     * @param angolo
     */
    private void updateAngolo(CartaNonObiettivo carta, int angolo) {
        if (carta.getPiazzataInFronte() == 1) {
            carta.getAngoliFronteDisponibili()[angolo] = 0;
        } else {
            carta.getAngoliRetroDisponibili()[angolo] = 0;
        }
    }

    /**
     * Data una carta A nel tavolo, voglio piazzare una carta B sopra di essa. Allora l'angolo che verrà aggiornato dell'angolo B sarà
     * uguale all'indice dell'angolo occupato di A sommato a 2
     * @param angoloPiazzato
     * @return
     */
    private int trovaAngoloDaPiazzare(int angoloPiazzato) {
        return switch (angoloPiazzato) {
            case 0 -> 2;
            case 1 -> 3;
            case 2 -> 0;
            case 3 -> 1;
            default -> -1;
        };
    }

    /**
     * Calcola la riga dove sarà piazzata la nuova carta in base alla posizione della carta già sul tavolo
     * @param angolo
     * @return
     */
    private int calcolaOffSetR(int angolo) {
        int offSetR = 0;
        switch (angolo) {
            case 0:
                offSetR = -1;
                break;
            case 1:
                offSetR = 1;
                break;
            case 2:
                offSetR = 1;
                break;
            case 3:
                offSetR = -1;
            default:
        }
        return offSetR;
    }

    /**
     * Calcola la colonna dove sarà piazzata la nuova carta in base alla posizione della carta già sul tavolo
     * @param angolo
     * @return
     */
    private int calcolaOffSetC(int angolo) {
        int offSetC = 0;
        switch (angolo) {
            case 0:
                offSetC = 1;
                break;
            case 1:
                offSetC = 1;
                break;
            case 2:
                offSetC = -1;
                break;
            case 3:
                offSetC = -1;
            default:
        }
        return offSetC;
    }

    /**
     * Printa su riga di comando la situazione del tavolo dove [0] indica uno slot non occupato, [1] altrimenti
     */
    public void analisiTavolo() {
        tavoloGiocatore.printTavolo();
    }

    /**
     * Printa su riga di comando lo stato del mazzo del giocatore
     */
    public void displayMazzo() {
        for (int i = 1; i <= mazzoGiocatore.getCarte().size(); i++) {
            System.out.println(i + ") " + mazzoGiocatore.getCarte().get(i-1).getClass());
        }
    }

    public void setFirstPlayer(boolean firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public String getNomeGiocatore() {
        return nomeGiocatore;
    }

    public MazzoGiocatore getMazzoGiocatore() {
        return mazzoGiocatore;
    }

    public Tavolo getTavoloGiocatore() {
        return tavoloGiocatore;
    }
}
