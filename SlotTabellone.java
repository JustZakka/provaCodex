import java.util.ArrayList;

public class SlotTabellone {
    private int slotOccupato = 0;
    private Segnalino segnalinoOccupante;

    public SlotTabellone(int slotOccupato, Segnalino segnalinoOccupante) {
        this.slotOccupato = slotOccupato;
        this.segnalinoOccupante = segnalinoOccupante;
    }

    public int getSlotOccupato() {
        return slotOccupato;
    }
}
