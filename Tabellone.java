import java.util.ArrayList;

public class Tabellone {
    private ArrayList<SlotTabellone> slots = new ArrayList<>(30);

    public void printTabellone() {
        for (int i = 0; i < slots.size(); i++) {
            System.out.println(i + ") [" + slots.get(i).getSlotOccupato() + "]");
        }
    }
}
