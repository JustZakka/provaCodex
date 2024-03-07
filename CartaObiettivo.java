public abstract class CartaObiettivo {
    private int puntiAttribuiti;

    public CartaObiettivo(int puntiAttribuiti) {
        this.puntiAttribuiti = puntiAttribuiti;
    }

    public void setPuntiAttribuiti(int puntiAttribuiti) {
        this.puntiAttribuiti = puntiAttribuiti;
    }

    public int getPuntiAttribuiti() {
        return puntiAttribuiti;
    }
}
