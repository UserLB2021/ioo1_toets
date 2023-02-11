package ioo1_toets;

public class GarageMedewerker {
    private String naam;
    private String woonplaats;
    private int geboortejaar;
    public GarageMedewerker(String naam, String woonplaats, int geboortejaar) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.geboortejaar = geboortejaar;
    }
    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public String getWoonplaats() {
        return woonplaats;
    }
    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }
    public int getGeboortejaar() {
        return geboortejaar;
    }
    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }
    public int getLeeftijd(int geboortejaar){
        return 2021-geboortejaar;
    }
}
