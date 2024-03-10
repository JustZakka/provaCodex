import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MazzoRisorsa implements canShuffle{

    public ArrayList<CartaRisorsa> carteRisorsa = new ArrayList<>(Arrays.asList(
            new CartaRisorsaVegetale1(),
            new CartaRisorsaVegetale2()
    ));

    public void mischiaMazzo() {
        Random rand = new Random();
        for (int i = 0; i < carteRisorsa.size(); i++) {
            int randomIndex = rand.nextInt(carteRisorsa.size());
            CartaRisorsa tmpCarta = carteRisorsa.get(randomIndex);
            carteRisorsa.set(randomIndex, carteRisorsa.get(i));
            carteRisorsa.set(i, tmpCarta);
        }
        System.out.println("Mazzo Mischiato");
    }

    public void printMazzo() {
        System.out.println("Mazzo Risorsa:");
        for (int i = 0; i < carteRisorsa.size(); i++) {
            System.out.println(i + ") [" + carteRisorsa.get(i).getClass() + "]");
        }
    }

    public ArrayList<CartaRisorsa> getCarteRisorsa() {
        return carteRisorsa;
    }
}
