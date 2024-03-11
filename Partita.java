import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Partita {
    private ArrayList<Giocatore> giocatori;
    private MazzoRisorsa mazzoRisorsa;
    private MazzoObiettivo mazzoObiettivo;
    private MazzoOro mazzoOro;
    private MazzoIniziale mazzoIniziale;
    private Tabellone tabellone;

    public Partita(ArrayList<Giocatore> giocatori, MazzoRisorsa mazzoRisorsa, MazzoObiettivo mazzoObiettivo, MazzoOro mazzoOro, MazzoIniziale mazzoIniziale, Tabellone tabellone) {
        this.giocatori = giocatori;
        this.mazzoRisorsa = mazzoRisorsa;
        this.mazzoObiettivo = mazzoObiettivo;
        this.mazzoOro = mazzoOro;
        this.mazzoIniziale = mazzoIniziale;
        this.tabellone = tabellone;
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

    private Giocatore scegliPrimoGiocatore(int indiceGiocatoreInGioco) {
        Giocatore giocatoreInGioco = giocatori.get(indiceGiocatoreInGioco);
        giocatoreInGioco.setFirstPlayer(true);
        System.out.println(giocatoreInGioco.getNomeGiocatore() + " è il primo a giocare!");
        return giocatoreInGioco;
    }

    private void piazzaCartaIniziale(Giocatore giocatoreInGioco) {
        Scanner scanner = new Scanner(System.in);
        int sceltaFronte;

        System.out.println("Piazza la carta iniziale...");
        giocatoreInGioco.printCartaIniziale();
        System.out.println("Seleziona se vuoi piazzare la carta iniziale di fronte o retro: 1) -> Fronte | 0) -> Retro");
        sceltaFronte = scanner.nextInt();
        giocatoreInGioco.piazzaCartaIniziale(sceltaFronte);
        giocatoreInGioco.printTavolo();
    }

    private int selezionaCarta(Giocatore giocatoreInGioco) {
        Scanner scanner = new Scanner(System.in);
        int sceltaCarta;

        giocatoreInGioco.printMazzo();
        System.out.println("Seleziona il numero della carta che vuoi piazzare: ");
        sceltaCarta = scanner.nextInt();

        return sceltaCarta;
    }

    private void piazzaCarta(Giocatore giocatoreInGioco) {
        Scanner scanner = new Scanner(System.in);
        int cartaSelezionata;
        int sceltaFronte;
        int riga, colonna;
        int sceltaAngolo;


        /*Il giocatore sceglie quale carta piazzare e come piazzarla*/
        cartaSelezionata = selezionaCarta(giocatoreInGioco);

        System.out.println("Seleziona se vuoi piazzarla di fronte o retro: 1) -> Fronte | 0) -> Retro");
        sceltaFronte = scanner.nextInt();
        System.out.println("Seleziona la riga della carta a cui vuoi attaccarti:");
        giocatoreInGioco.printTavolo();
        riga = scanner.nextInt();
        System.out.println("Seleziona la colonna della carta a cui vuoi attaccarti:");
        colonna = scanner.nextInt();

        /*Il giocatore vede gli angoli della carta che vuole piazzare*/
        System.out.println("Carta da piazzare: ");
        if (sceltaFronte == 1) {
            giocatoreInGioco.getMazzoGiocatore().getCarte().get(cartaSelezionata-1).printAngoliFronte();
        } else {
            giocatoreInGioco.getMazzoGiocatore().getCarte().get(cartaSelezionata-1).printAngoliRetro();
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
        giocatoreInGioco.piazzaCarta(riga, colonna, giocatoreInGioco.getMazzoGiocatore().getCarte().get(cartaSelezionata-1), sceltaFronte, sceltaAngolo);
        /*Display del tavolo per controllare*/
        giocatoreInGioco.printTavolo();
    }

    private int scegliDaMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cosa vuoi fare ?");
        System.out.println("1) Piazza una Carta");
        System.out.println("2) Analizza il tavolo");
        return scanner.nextInt();
    }

    private void pescaCarta(Giocatore giocatoreInGioco) {
        //TODO: finire la funzione della pesca
        int sceltaMazzo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pesca una carta dai mazzi:");
        System.out.println("1) Mazzo Risorsa");
        System.out.println("2) Mazzo Oro");
        sceltaMazzo = scanner.nextInt();

        //TODO: controllare che i mazzi abbiano ancora carte da pescare
        if (sceltaMazzo == 1) {
            /*Il giocatore aggiunge la carta in cima al mazzo risorsa al suo mazzo*/
            giocatoreInGioco.getMazzoGiocatore().getCarte().add(
                    mazzoRisorsa.getCarteRisorsa().getFirst()
            );
            /*Tolgo dal mazzo risorsa la prima carta pescata*/
            mazzoRisorsa.getCarteRisorsa().removeFirst();
        } else if (sceltaMazzo == 2) {
            /*Il giocatore aggiunge la carta in cima al mazzo risorsa al suo mazzo*/
            giocatoreInGioco.getMazzoGiocatore().getCarte().add(
                    mazzoOro.getCarteOro().getFirst()
            );
            /*Tolgo dal mazzo risorsa la prima carta pescata*/
            mazzoOro.getCarteOro().removeFirst();
        }
    }

    private void analisiTavolo(Giocatore giocatoreInGioco) {
        int riga, colonna;
        Scanner scanner = new Scanner(System.in);

        giocatoreInGioco.printTavolo();
        System.out.println("Scegli la riga della carta che vuoi analizzare: ");
        riga = scanner.nextInt();
        System.out.println("Scegli la colonna della carta che vuoi analizzare: ");
        colonna = scanner.nextInt();
        giocatoreInGioco.getTavoloGiocatore().analisiCartaTavolo(riga, colonna);
    }

    private int selezionaIndiceProssimoGiocatore(int indiceCorrente) {
        int indiceProssimo = indiceCorrente + 1;
        if (indiceProssimo >= giocatori.size()) {
            indiceProssimo = 0;
        }
        return indiceProssimo;
    }

    private Giocatore selezionaProssimoGiocatore(int indice) {
        Giocatore prossimoGiocatore;
        prossimoGiocatore = giocatori.get(indice);
        System.out.println("Prossimo turno... \n Tocca a " + prossimoGiocatore.getNomeGiocatore());
        return prossimoGiocatore;
    }

    public void iniziaPartita() {
        /*Elementi necessari per le scelte fatte dai giocatori e per
        * prendere i comandi da riga di comando*/
        Scanner scanner = new Scanner(System.in);
        int sceltaGiocatore;
        int flagCartaGiocata = 0;

        /*Si inizia scegliendo in modo casuale il giocatore iniziale*/
        int indiceGiocatoreInGioco = randomIndex();
        Giocatore giocatoreInGioco = scegliPrimoGiocatore(indiceGiocatoreInGioco);
        /*Inizia la partita con la carta iniziale piazzata dal primo giocatore*/
        piazzaCartaIniziale(giocatoreInGioco);
        sceltaGiocatore = scegliDaMenu();

        while (true) {

            while (sceltaGiocatore != -1) {

                if (sceltaGiocatore == 1) {
                    /*Cambio il flag della carta giocata per evitare che il giocatore ne piazzi un'altra nello stesso turno di gioco*/
                    flagCartaGiocata = 1;
                    /*Piazza una carta dal mazzo*/
                    piazzaCarta(giocatoreInGioco);
                    /*Il giocatore ora deve pescare una carta dai due mazzi risorsa od oro*/
                    pescaCarta(giocatoreInGioco);

                } else if (sceltaGiocatore == 2) {
                    /*Il giocatore sceglie una carta dando come input la sua riga e colonna*/
                    analisiTavolo(giocatoreInGioco);
                }

                System.out.println("Cosa vuoi fare ?");
                if (flagCartaGiocata == 0) {
                    System.out.println("1) Piazza una Carta");
                    System.out.println("2) Analizza il tavolo");
                } else {
                    System.out.println("-1) Finisci il turno");
                    System.out.println("2) Analizza il tavolo");
                }
                sceltaGiocatore = scanner.nextInt();

            }

            indiceGiocatoreInGioco = selezionaIndiceProssimoGiocatore(indiceGiocatoreInGioco);
            giocatoreInGioco = selezionaProssimoGiocatore(indiceGiocatoreInGioco);
            sceltaGiocatore = scegliDaMenu();

        }

    }


}
