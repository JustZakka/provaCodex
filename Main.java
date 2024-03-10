import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sceltaCarta;
        int sceltaFronte;
        int sceltaContinua;
        int sceltaAngolo;
        int riga, colonna;
        MazzoGiocatore mazzo = new MazzoGiocatore(new ArrayList<>(Arrays.asList(new CartaRisorsaVegetale1(), new CartaRisorsaVegetale2(), new CartaOroFunghi1())), new CartaIniziale1());
        Giocatore p1 = new Giocatore(new SegnalinoRosso1(), mazzo, true, new Tavolo(7, 7));

        System.out.println(":::Mazzo di p1:::");
        p1.displayMazzo();
        System.out.println("Piazza la carta iniziale...");
        System.out.println("Seleziona se vuoi piazzare la carta iniziale di fronte o retro: 1) -> Fronte | 0) -> Retro");
        sceltaFronte = scanner.nextInt();
        System.out.println("Carta iniziale posizionata di " + (sceltaFronte == 1 ? "Fronte" : "Retro") + ". Scegli in che riga piazzarla: ");
        riga = scanner.nextInt();
        System.out.println("Scegli in che colonna piazzarla: ");
        colonna = scanner.nextInt();
        p1.piazzaCartaIniziale(p1.getMazzoGiocatore().getCartaIniziale(), riga, colonna, sceltaFronte);
        p1.getTavoloGiocatore().printTavolo();

        System.out.println("Vuoi continuare ?");
        System.out.println("Sì: 1");
        System.out.println("No: -1");
        sceltaContinua = scanner.nextInt();

        while (sceltaContinua != -1) {

            System.out.println("Cosa vuoi fare ?");
            System.out.println("1) Piazza una Carta");
            System.out.println("2) Analizza il tavolo");
            sceltaContinua = scanner.nextInt();

            if (sceltaContinua == 1) {
                System.out.println(":::Mazzo di p1:::");
                p1.displayMazzo();
                System.out.println("Seleziona il numero della carta che vuoi piazzare: ");
                sceltaCarta = scanner.nextInt();
                System.out.println("Seleziona se vuoi piazzarla di fronte o retro: 1) -> Fronte | 0) -> Retro");
                sceltaFronte = scanner.nextInt();
                System.out.println("Seleziona la riga della carta a cui vuoi attaccarti:");
                p1.getTavoloGiocatore().printTavolo();
                riga = scanner.nextInt();
                System.out.println("Seleziona la colonna della carta a cui vuoi attaccarti:");
                colonna = scanner.nextInt();
                System.out.println("Carta selezionata sul tavolo:");
                if (p1.getTavoloGiocatore().getSlots()[riga][colonna].getCartaSlot().getPiazzataInFronte() == 1) {
                    p1.getTavoloGiocatore().getSlots()[riga][colonna].getCartaSlot().printAngoliFronte();
                } else {
                    p1.getTavoloGiocatore().getSlots()[riga][colonna].getCartaSlot().printAngoliRetro();
                }
                System.out.println("Carta da piazzare: ");
                if (sceltaFronte == 1) {
                    p1.getMazzoGiocatore().getCarte().get(sceltaCarta-1).printAngoliFronte();
                } else {
                    p1.getMazzoGiocatore().getCarte().get(sceltaCarta-1).printAngoliRetro();
                }
                System.out.println("Seleziona l'angolo della carta sul tavolo a cui vuoi attaccarti (a partire da in alto a dx in senso orario 0->3): ");
                sceltaAngolo = scanner.nextInt();
                p1.piazzaCarta(riga, colonna, p1.getMazzoGiocatore().getCarte().get(sceltaCarta-1), sceltaFronte, sceltaAngolo);
                p1.getTavoloGiocatore().printTavolo();
            } else if (sceltaContinua == 2) {
                p1.analisiTavolo();
                System.out.println("Scegli la riga della carta che vuoi analizzare: ");
                riga = scanner.nextInt();
                System.out.println("Scegli la colonna della carta che vuoi analizzare: ");
                colonna = scanner.nextInt();
                p1.getTavoloGiocatore().analisiCartaTavolo(riga, colonna);
            }

            System.out.println("Cosa vuoi fare ?");
            System.out.println("-1: Chiudi il gioco");
            System.out.println("1: Vai avanti col gioco");
            sceltaContinua = scanner.nextInt();
        }
    }
}