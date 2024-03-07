public class Tavolo {

    private Slot[][] slots;

    public Tavolo(int r, int c) {
        this.slots = new Slot[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                slots[i][j] = new Slot();
            }
        }
    }

    public Slot[][] getSlots() {
        return slots;
    }
}
