import java.util.ArrayList;
import java.util.Arrays;

public class CartaIniziale1 extends CartaIniziale{
    public CartaIniziale1() {
        super(new ArrayList<>(Arrays.asList(new Vegetale(), new Animale(), new Insetti(), new Funghi())), new int[]{1, 1, 1, 1}, new ArrayList<>(Arrays.asList(new Vegetale(), null, new Insetti(), null)), new ArrayList<>(Arrays.asList(new Insetti())));
    }
}
