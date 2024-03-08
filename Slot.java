public class Slot {

    private int slotOccupato;
    private CartaNonObiettivo cartaSlot;

    public Slot() {
        this.slotOccupato = 0;
    }

    public void analisiSlot() {
        if (slotOccupato == 1) {
            System.out.println("Lo slot è occupato da una carta");
            cartaSlot.toString();
        } else {
            System.out.println("Lo slot è libero");
        }
    }

    //GETTER
    public int getSlotOccupato() {
        return slotOccupato;
    }
    public CartaNonObiettivo getCartaSlot() {
        return cartaSlot;
    }

    //SETTER
    public void setSlotOccupato(int slotOccupato) {
        this.slotOccupato = slotOccupato;
    }

    public void setCartaSlot(CartaNonObiettivo cartaSlot) {
        this.cartaSlot = cartaSlot;
    }
}
