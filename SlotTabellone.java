import java.util.ArrayList;

public class SlotTabellone {
    private int slotOccupato = 0;
    private ArrayList<Segnalino> segnaliniOccupanti;

    public SlotTabellone(int slotOccupato, ArrayList<Segnalino> segnaliniOccupanti) {
        this.slotOccupato = slotOccupato;
        this.segnaliniOccupanti = segnaliniOccupanti;
    }

    public int getSlotOccupato() {
        return slotOccupato;
    }

    public ArrayList<Segnalino> getSegnaliniOccupanti() {
        return segnaliniOccupanti;
    }
}
