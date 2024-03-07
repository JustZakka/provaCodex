import java.util.ArrayList;

public class MazzoGiocatore {

    private CartaRisorsa cartaRisorsa1;
    private CartaRisorsa cartaRisorsa2;
    private CartaOro cartaOro;
    private CartaIniziale cartaIniziale;

    public MazzoGiocatore(CartaRisorsa cartaRisorsa1, CartaRisorsa cartaRisorsa2, CartaOro cartaOro, CartaIniziale cartaIniziale) {
        this.cartaRisorsa1 = cartaRisorsa1;
        this.cartaRisorsa2 = cartaRisorsa2;
        this.cartaOro = cartaOro;
        this.cartaIniziale = cartaIniziale;
    }
}
