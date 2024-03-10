import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Partita {
    private ArrayList<Giocatore> giocatori;
    private MazzoRisorsa mazzoRisorsa;
    private MazzoObiettivo mazzoObiettivo;
    private MazzoOro mazzoOro;
    private MazzoIniziale mazzoIniziale;

    public Partita(ArrayList<Giocatore> giocatori, MazzoRisorsa mazzoRisorsa, MazzoObiettivo mazzoObiettivo, MazzoOro mazzoOro, MazzoIniziale mazzoIniziale) {
        this.giocatori = giocatori;
        this.mazzoRisorsa = mazzoRisorsa;
        this.mazzoObiettivo = mazzoObiettivo;
        this.mazzoOro = mazzoOro;
        this.mazzoIniziale = mazzoIniziale;
    }

    /**
     * Sceglie casualmente l'indice (0-index) del giocatore che inizia la partita e che quindi avrà il "Segnalino Nero"
     * @return
     */
    private int randomIndex() {
        Random random = new Random();
        int giocatoreIniziale = random.nextInt(giocatori.size());
        return giocatoreIniziale;
    }


    public void iniziaPartita() {
        /*Elementi necessari per le scelte fatte dai giocatori e per
        * prendere i comandi da riga di comando*/
        Scanner scanner = new Scanner(System.in);
        int sceltaCarta;
        int sceltaFronte;
        int sceltaGiocatore;
        int sceltaFinisciTurno = 0;
        int sceltaAngolo;
        int riga, colonna;
        int flagCartaGiocata = 0;

        /*Si inizia scegliendo in modo casuale il giocatore iniziale*/
        int indiceGiocatoreInGioco = randomIndex();
        Giocatore giocatoreInGioco = giocatori.get(indiceGiocatoreInGioco);
        giocatoreInGioco.setFirstPlayer(true);
        System.out.println(giocatoreInGioco.getNomeGiocatore() + " è il primo a giocare!");

        /*Inizia la partita con la carta iniziale piazzata dal primo giocatore*/
        System.out.println(":::Mazzo di " + giocatoreInGioco.getNomeGiocatore() + ":::");
        giocatoreInGioco.displayMazzo();
        System.out.println("Piazza la carta iniziale...");
        System.out.println("Seleziona se vuoi piazzare la carta iniziale di fronte o retro: 1) -> Fronte | 0) -> Retro");
        sceltaFronte = scanner.nextInt();
        giocatoreInGioco.piazzaCartaIniziale(sceltaFronte);
        giocatoreInGioco.getTavoloGiocatore().printTavolo();

        System.out.println("Cosa vuoi fare ?");
        System.out.println("1) Piazza una Carta");
        System.out.println("2) Analizza il tavolo");
        sceltaGiocatore = scanner.nextInt();

        while (true) {

            while (sceltaFinisciTurno != -1) {

                if (sceltaGiocatore == 1) {
                    /*Cambio il flag della carta giocata per evitare che il giocatore ne piazzi un'altra nello
                     * stesso turno di gioco*/
                    flagCartaGiocata = 1;

                    /*Il giocatore sceglie quale carta piazzare e come piazzarla*/
                    System.out.println(":::Mazzo di " + giocatoreInGioco.getNomeGiocatore() + ":::");
                    giocatoreInGioco.displayMazzo();
                    System.out.println("Seleziona il numero della carta che vuoi piazzare: ");
                    sceltaCarta = scanner.nextInt();
                    System.out.println("Seleziona se vuoi piazzarla di fronte o retro: 1) -> Fronte | 0) -> Retro");
                    sceltaFronte = scanner.nextInt();
                    System.out.println("Seleziona la riga della carta a cui vuoi attaccarti:");
                    giocatoreInGioco.getTavoloGiocatore().printTavolo();
                    riga = scanner.nextInt();
                    System.out.println("Seleziona la colonna della carta a cui vuoi attaccarti:");
                    colonna = scanner.nextInt();

                    /*Il giocatore vede gli angoli della carta che vuole piazzare*/
                    System.out.println("Carta da piazzare: ");
                    if (sceltaFronte == 1) {
                        giocatoreInGioco.getMazzoGiocatore().getCarte().get(sceltaCarta-1).printAngoliFronte();
                    } else {
                        giocatoreInGioco.getMazzoGiocatore().getCarte().get(sceltaCarta-1).printAngoliRetro();
                    }
                    /*Il giocatore vede la carta sul tavolo che ha scelto come base*/
                    System.out.println("Carta selezionata sul tavolo:");
                    if (giocatoreInGioco.getTavoloGiocatore().getSlots()[riga][colonna].getCartaSlot().getPiazzataInFronte() == 1) {
                        giocatoreInGioco.getTavoloGiocatore().getSlots()[riga][colonna].getCartaSlot().printAngoliFronte();
                    } else {
                        giocatoreInGioco.getTavoloGiocatore().getSlots()[riga][colonna].getCartaSlot().printAngoliRetro();
                    }
                    //TODO: METTERE IL CONTROLLO PER EVITARE CHE IL GIOCATORE SCELGA UN ANGOLO NON DISPONIBILE
                    System.out.println("Seleziona l'angolo della carta sul tavolo a cui vuoi attaccarti (a partire da in alto a dx in senso orario 0->3): ");
                    sceltaAngolo = scanner.nextInt();
                    /*La carta scelta dal giocatore viene piazzata in modo opportuna sul tavolo attaccata alla carta selezionata come base*/
                    giocatoreInGioco.piazzaCarta(riga, colonna, giocatoreInGioco.getMazzoGiocatore().getCarte().get(sceltaCarta-1), sceltaFronte, sceltaAngolo);
                    /*Display del tavolo per controllare*/
                    giocatoreInGioco.getTavoloGiocatore().printTavolo();

                    /*Il giocatore ora deve pescare una carta dai due mazzi risorsa o oro*/
                    //TODO: finire la funzione della pesca
                    System.out.println("Pesca una carta dai mazzi:");
                    System.out.println("1) Mazzo Risorsa");
                    System.out.println("2) Mazzo Oro");
                    sceltaGiocatore = scanner.nextInt();

                    //TODO: controllare che i mazzi abbiano ancora carte da pescare
                    if (sceltaGiocatore == 1) {
                        /*Il giocatore aggiunge la carta in cima al mazzo risorsa al suo mazzo*/
                        giocatoreInGioco.getMazzoGiocatore().getCarte().add(
                                mazzoRisorsa.getCarteRisorsa().getFirst()
                        );
                        /*Tolgo dal mazzo risorsa la prima carta pescata*/
                        mazzoRisorsa.getCarteRisorsa().removeFirst();

                    } else if (sceltaGiocatore == 2) {
                        /*Il giocatore aggiunge la carta in cima al mazzo risorsa al suo mazzo*/
                        giocatoreInGioco.getMazzoGiocatore().getCarte().add(
                                mazzoOro.getCarteOro().getFirst()
                        );
                        /*Tolgo dal mazzo risorsa la prima carta pescata*/
                        mazzoOro.getCarteOro().removeFirst();

                    }

                } else if (sceltaGiocatore == 2) {

                    /*Il giocatore sceglie una carta dando come input la sua riga e colonna*/
                    giocatoreInGioco.analisiTavolo();
                    System.out.println("Scegli la riga della carta che vuoi analizzare: ");
                    riga = scanner.nextInt();
                    System.out.println("Scegli la colonna della carta che vuoi analizzare: ");
                    colonna = scanner.nextInt();
                    giocatoreInGioco.getTavoloGiocatore().analisiCartaTavolo(riga, colonna);

                }

                System.out.println("Cosa vuoi fare ?");
                /*Il giocatore sceglie cosa fare*/
                if (flagCartaGiocata == 0) {
                    System.out.println("1) Piazza una Carta");
                    System.out.println("2) Analizza il tavolo");
                } else {
                    System.out.println("-1) Finisci il turno");
                    System.out.println("2) Analizza il tavolo");
                }
                sceltaFinisciTurno = scanner.nextInt();
            }

            indiceGiocatoreInGioco++;
            giocatoreInGioco = giocatori.get(indiceGiocatoreInGioco);
            System.out.println("Prossimo turno... \n Tocca a " + giocatoreInGioco.getNomeGiocatore());

            System.out.println("Cosa vuoi fare ?");
            System.out.println("1) Piazza una Carta");
            System.out.println("2) Analizza il tavolo");
            sceltaGiocatore = scanner.nextInt();

        }

    }


}
