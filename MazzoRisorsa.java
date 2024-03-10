import java.util.ArrayList;
import java.util.Arrays;

public class MazzoRisorsa extends Mazzo{
    public MazzoRisorsa() {
        super(new ArrayList<>(Arrays.asList(
                new CartaRisorsaVegetale1(),
                new CartaRisorsaVegetale2()
        )));
    }
}
