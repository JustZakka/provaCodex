public class Tavolo {

    private final Slot[][] slots;
    private final int r;
    private final int c;

    public Tavolo(int r, int c) {
        this.r = r;
        this.c = c;
        this.slots = new Slot[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                slots[i][j] = new Slot();
            }
        }
    }

    /**
     * Dati la riga r e la colonna c, controlla se lo slot [r][c] è occupato, in caso printa la toString() della carta occupante
     * @param r riga dello slot
     * @param c colonna dello slot
     */
    public void analisiCartaTavolo(int r, int c) {
        if (slots[r][c].getSlotOccupato() == 0) {
            System.out.println("ERORRE: SLOT NON OCCUPATO DA NESSUNA CARTA.");
            return;
        }
        CartaNonObiettivo carta = slots[r][c].getCartaSlot();
        System.out.println("Analisi della carta nello slot [" + r + "][" + c + "].");
        System.out.println(carta.getClass());
        if (carta.getPiazzataInFronte() == 1) {
            carta.printAngoliFronte();
        } else {
            carta.printAngoliRetro();
        }
    }

    public Slot[][] getSlots() {
        return slots;
    }

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }
}
