package ioo1_toets;


public class SportSchoen extends SportArtikel {
    // gekozen voor een enum met daarin twee optis in string vorm. Dit is de beste oplossing vind ik !
    enum TypeSport{
        tennis,
        voetbal
    }
    private TypeSport type;
    public SportSchoen(double prijs, boolean opVoorraad, TypeSport type) {
        super(prijs, opVoorraad);
        this.type = type;
    }
    public TypeSport getType() {
        return type;
    }
    public void setType(TypeSport type) {
        this.type = type;
    }
}
