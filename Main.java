public class Main {
    public static void main(String[] args) {

        Tavolo tavolo = new Tavolo(20, 20);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println((tavolo.getSlots())[i][j].getSlotOccupato());
            }
        }

    }
}