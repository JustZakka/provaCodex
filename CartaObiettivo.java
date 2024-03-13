public abstract class CartaObiettivo extends Carta{
    private int puntiAttribuiti;

    public CartaObiettivo(int idCarta, String artRef, int puntiAttribuiti) {
        super(idCarta, artRef);
        this.puntiAttribuiti = puntiAttribuiti;
    }

    public void setPuntiAttribuiti(int puntiAttribuiti) {
        this.puntiAttribuiti = puntiAttribuiti;
    }

    public int getPuntiAttribuiti() {
        return puntiAttribuiti;
    }
}
