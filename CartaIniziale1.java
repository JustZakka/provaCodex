import java.util.ArrayList;
import java.util.Arrays;

public class CartaIniziale1 extends CartaIniziale{

    public CartaIniziale1(int idCarta, String artRef, ArrayList<Angolo> angoliFronte, ArrayList<Angolo> angoliRetro, ArrayList<Risorsa> risorseRetroCentro) {
        super(81, "81", new ArrayList<>(Arrays.asList(
                        new Angolo(1, new Vegetale()),
                        new Angolo(1, null),
                        new Angolo(1, new Insetti()),
                        new Angolo(1, null)
                )),
                new ArrayList<>(Arrays.asList(
                        new Angolo(1, new Vegetale()),
                        new Angolo(1, new Animale()),
                        new Angolo(1, new Insetti()),
                        new Angolo(1, new Funghi())
                )),
                new ArrayList<>(Arrays.asList(new Insetti()))
        );
    }
}
