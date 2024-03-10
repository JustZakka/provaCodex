import java.util.ArrayList;
import java.util.Arrays;

public class MazzoIniziale {
    private ArrayList<CartaIniziale> carteIniziali = new ArrayList<>(Arrays.asList(
            new CartaIniziale1()
    ));

    public ArrayList<CartaIniziale> getCarteIniziali() {
        return carteIniziali;
    }
}
