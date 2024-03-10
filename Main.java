import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Giocatore giorgio =
            new Giocatore("Giorgio", new SegnalinoRosso1(),
            new MazzoGiocatore(
                new ArrayList<>(Arrays.asList(
                        new CartaRisorsaVegetale1(),
                        new CartaRisorsaVegetale2(),
                        new CartaOroFunghi1())),
                new CartaIniziale1()),
            new Tavolo(7, 7));

        Partita partita = new Partita(
                new ArrayList<>(Arrays.asList(
                        giorgio)),
                new MazzoRisorsa(),
                new MazzoObiettivo(),
                new MazzoOro(),
                new MazzoIniziale());

        partita.iniziaPartita();

    }
}