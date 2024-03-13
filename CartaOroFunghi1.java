import java.util.ArrayList;
import java.util.Arrays;

public class CartaOroFunghi1 extends CartaOroFunghi{
    public CartaOroFunghi1() {
        super(41, "41", new ArrayList<>(Arrays.asList(
                new Angolo(1, null),
                new Angolo(1, new Piuma()),
                new Angolo(1, null),
                new Angolo(0, null)
        )), 1, null);
    }
}
