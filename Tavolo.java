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

    public void printTavolo() {
        System.out.println("-------------------------");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("[" + slots[i][j].getSlotOccupato() + "]");
            }
            System.out.println();
        }
    }

    public void analisiCartaTavolo(int r, int c) {
        if (slots[r][c].getSlotOccupato() == 0) {
            System.out.println("ERORRE: SLOT NON OCCUPATO DA NESSUNA CARTA.");
            return;
        }
        System.out.println(slots[r][c].getCartaSlot().toString());
    }

    public Slot[][] getSlots() {
        return slots;
    }

}
