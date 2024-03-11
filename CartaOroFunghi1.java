import java.util.ArrayList;
import java.util.Arrays;

public class CartaOroFunghi1 extends CartaOroFunghi{
    public CartaOroFunghi1() {
        super(new ArrayList<>(Arrays.asList(
                new Angolo(1, new Funghi()),
                new Angolo(0, null),
                new Angolo(1, null),
                new Angolo(1, null)
            )), 1, null);
    }
}
