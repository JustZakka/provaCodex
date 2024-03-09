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
    private boolean checkAngoloDisponibile(CartaNonObiettivo carta, int fronte, int angolo) {
        boolean flag;
        if (fronte == 1) {
            flag = carta.getAngoliFronteDisponibili()[angolo] == 1;
        } else {
            flag = carta.getAngoliRetroDisponibili()[angolo] == 1;
        }
        return flag;
    }
    public void piazzaCartaIniziale(CartaIniziale carta, int r, int c, int fronte) {
        carta.setPiazzataInFronte(fronte);
        tavoloGiocatore.getSlots()[r][c].setSlotOccupato(1);
        tavoloGiocatore.getSlots()[r][c].setCartaSlot(carta);
        mazzoGiocatore.setCartaIniziale(null);
        System.out.println("Carta " + carta.getClass() + " piazzata nello slot [" + r + "][" + c + "]." );
    }


    public void piazzaCarta(int rCartaPiazzata, int cCartaPiazzata, CartaNonObiettivo cartaDaPiazzare, int fronte, int angoloPiazzato) {

        CartaNonObiettivo cartaPiazzata = tavoloGiocatore.getSlots()[rCartaPiazzata][cCartaPiazzata].getCartaSlot();
        if (!checkCartaInMazzo(cartaDaPiazzare)) return;
        if (checkAngoloDisponibile(cartaPiazzata, cartaPiazzata.getPiazzataInFronte(), angoloPiazzato)) {
            int offSetR = calcolaOffSetR(angoloPiazzato);
            int offSetC = calcolaOffSetC(angoloPiazzato);
            int rCartaDaPiazzare = rCartaPiazzata + offSetR;
            int cCartaDaPiazzare = cCartaPiazzata + offSetC;
            int angoloOccupatoCartaDaPiazzare = trovaAngoloDaPiazzare(angoloPiazzato);
            tavoloGiocatore.getSlots()[rCartaDaPiazzare][cCartaDaPiazzare].setCartaSlot(cartaDaPiazzare);
            tavoloGiocatore.getSlots()[rCartaDaPiazzare][cCartaDaPiazzare].setSlotOccupato(1);
            cartaDaPiazzare.setPiazzataInFronte(fronte);
            if (cartaPiazzata.getPiazzataInFronte() == 1) {
                cartaPiazzata.getAngoliFronteDisponibili()[angoloPiazzato] = 0;
            } else {
                cartaPiazzata.getAngoliRetroDisponibili()[angoloPiazzato] = 0;
            }
            if (fronte == 1) {
                cartaDaPiazzare.getAngoliFronteDisponibili()[angoloOccupatoCartaDaPiazzare] = 0;
            } else {
                cartaDaPiazzare.getAngoliRetroDisponibili()[angoloOccupatoCartaDaPiazzare] = 0;
            }
            mazzoGiocatore.getCarte().remove(cartaDaPiazzare);
            System.out.println("Carta " + cartaDaPiazzare.getClass() + " piazzata nello slot [" + rCartaDaPiazzare + "][" + cCartaDaPiazzare + "]." );
        }
    }

    public int trovaAngoloDaPiazzare(int angoloPiazzato) {
        return switch (angoloPiazzato) {
            case 0 -> 2;
            case 1 -> 3;
            case 2 -> 0;
            case 3 -> 1;
            default -> -1;
        };
    }

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

    public void analisiTavolo() {
        tavoloGiocatore.printTavolo();
    }

    public void displayMazzo() {
        for (int i = 1; i <= mazzoGiocatore.getCarte().size(); i++) {
            System.out.println(i + ") " + mazzoGiocatore.getCarte().get(i-1).getClass());
        }
    }

    public MazzoGiocatore getMazzoGiocatore() {
        return mazzoGiocatore;
    }

    public Tavolo getTavoloGiocatore() {
        return tavoloGiocatore;
    }
}
