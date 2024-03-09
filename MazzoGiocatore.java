import java.util.ArrayList;

public class MazzoGiocatore {

    private ArrayList<CartaNonObiettivo> carte;
    private CartaIniziale cartaIniziale;

    public MazzoGiocatore(ArrayList<CartaNonObiettivo> carte, CartaIniziale cartaIniziale) {
        this.carte = carte;
        this.cartaIniziale = cartaIniziale;
    }

    public void setCartaIniziale(CartaIniziale cartaIniziale) {
        this.cartaIniziale = cartaIniziale;
    }

    public ArrayList<CartaNonObiettivo> getCarte() {
        return carte;
    }

    public CartaIniziale getCartaIniziale() {
        return cartaIniziale;
    }
}
