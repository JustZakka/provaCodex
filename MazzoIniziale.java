import java.util.ArrayList;
import java.util.Arrays;

public class MazzoIniziale extends Mazzo{
    public MazzoIniziale() {
        super(new ArrayList<>(Arrays.asList(
                new CartaIniziale1()
        )));
    }
}
