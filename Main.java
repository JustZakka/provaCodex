public class Main {
    public static void main(String[] args) {

        Tavolo tavolo = new Tavolo(3, 3);
        Giocatore p1 = new Giocatore(tavolo);

        p1.analizzaTavolo();
        p1.piazzaCartaIniziale(1, 2);
        p1.analizzaTavolo();

    }
}