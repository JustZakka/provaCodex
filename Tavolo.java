import java.util.ArrayList;

public class Tavolo {

    private int r;
    private int c;
    private final int[][] matrix;

    public Tavolo(int r, int c) {
        this.r = r;
        this.c = c;
        this.matrix = new int[r][c];
    }

    public Tavolo() {
        this.matrix = new int[5][5];
    }

    public void printTavolo() {
        System.out.println("-------------------------");
        for (int i = 0; i < getMatrix().length; i++) {
            for (int j = 0; j < getMatrix()[i].length; j++) {
                System.out.print("[" + getMatrix()[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
