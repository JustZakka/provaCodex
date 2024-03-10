import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MazzoOro implements canShuffle{
    private ArrayList<CartaOro> carteOro = new ArrayList<>(Arrays.asList(
            new CartaOroFunghi1()
    ));

    public void mischiaMazzo() {
        Random rand = new Random();
        for (int i = 0; i < carteOro.size(); i++) {
            int randomIndex = rand.nextInt(carteOro.size());
            CartaOro tmpCarta = carteOro.get(randomIndex);
            carteOro.set(randomIndex, carteOro.get(i));
            carteOro.set(i, tmpCarta);
        }
        System.out.println("Mazzo Mischiato");
    }

    public void printMazzo() {
        System.out.println("Mazzo oro:");
        for (int i = 0; i < carteOro.size(); i++) {
            System.out.println(i + ") [" + carteOro.get(i).getClass() + "]");
        }
    }

    public ArrayList<CartaOro> getCarteOro() {
        return carteOro;
    }


}
