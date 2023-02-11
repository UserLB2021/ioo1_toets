package ioo1_toets;

public class SportArtikel {
    private double prijs;
    private boolean opVoorraad;
    public SportArtikel(double prijs, boolean opVoorraad) {
        this.prijs = prijs;
        this.opVoorraad = opVoorraad;
    }
    public double getPrijs() {
        return prijs;
    }
    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }
    public boolean isOpVoorraad() {
        return opVoorraad;
    }
    public void setOpVoorraad(boolean opVoorraad) {
        this.opVoorraad = opVoorraad;
    }
}

