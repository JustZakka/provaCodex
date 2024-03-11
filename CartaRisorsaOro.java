import java.util.ArrayList;
import java.util.Arrays;

public abstract class CartaRisorsaOro extends CartaNonObiettivo{


    private Risorsa risorsaRetroCentro;

    public CartaRisorsaOro(ArrayList<Angolo> angoliFronte, Risorsa risorsaRetroCentro) {
        super(angoliFronte, new ArrayList<>(Arrays.asList(
                new Angolo(1, null),
                new Angolo(1, null),
                new Angolo(1, null),
                new Angolo(1, null)
        )));
        this.risorsaRetroCentro = risorsaRetroCentro;
    }
}
