import java.util.ArrayList;
import java.util.Random;

public abstract class Mazzo {
    private ArrayList<Carta> carte;

    public Mazzo(ArrayList<Carta> carte) {
        this.carte = carte;
    }

    public void mischiaMazzo() {
        Random rand = new Random();
        for (int i = 0; i < carte.size(); i++) {
            int randomIndex = rand.nextInt(carte.size());
            Carta tmpCarta = carte.get(randomIndex);
            carte.set(randomIndex, carte.get(i));
            carte.set(i, tmpCarta);
        }
        System.out.println("Mazzo Mischiato");
    }

}
