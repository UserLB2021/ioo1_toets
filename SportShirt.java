package ioo1_toets;

public class SportShirt extends SportArtikel {
    private boolean bedrukt;
    public SportShirt(double prijs, boolean opVoorraad, boolean bedrukt) {
        super(prijs, opVoorraad);
        this.bedrukt = bedrukt;
    }
    public boolean isBedrukt() {
        return bedrukt;
    }
    public void setBedrukt(boolean bedrukt) {
        this.bedrukt = bedrukt;
    }
}

