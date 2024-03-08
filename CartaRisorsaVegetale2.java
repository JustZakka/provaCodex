import java.util.ArrayList;
import java.util.Arrays;

public class CartaRisorsaVegetale2 extends CartaRisorsaVegetale{

    public CartaRisorsaVegetale2() {
        super(new ArrayList<>(Arrays.asList(new Vegetale(), null, null, new Vegetale())), new int[]{1, 1, 0, 1});
    }

}
