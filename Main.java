public class Main {
    public static void main(String[] args) {

        MazzoGiocatore mazzo1 = new MazzoGiocatore(new CartaRisorsaVegetale1(), new CartaRisorsaVegetale2(), new CartaOroFunghi1(), new CartaIniziale1());
        Giocatore p1 = new Giocatore(new SegnalinoRosso1(), mazzo1, true, new Tavolo(4, 4));
        p1.analisiTavolo();
        p1.piazzaCarta(mazzo1.getCartaIniziale(), 1, 1);
        p1.analisiTavolo();

    }
}