package ioo1_toets;


public class GarageApp {
    public static void main(String[] args) {
        GarageMedewerker mw1 = new GarageMedewerker("Albert Vecht","Leiden",1990);
        GarageMedewerker mw2 = new GarageMedewerker("Carla Heemskerk","Voorschoten",1995);
        GarageMedewerker mw3 = new GarageMedewerker("Romee Horn","Zoetermeer",1987);
        mw1.setGeboortejaar(1980);
        mw2.setNaam("Carla Jansen");
        mw3.setWoonplaats("Oestgeest");
        System.out.printf("Medewerker %s woont in %s en is %d jaar oud.\n",mw1.getNaam(),mw1.getWoonplaats(),mw1.getLeeftijd(mw1.getGeboortejaar()));
        System.out.printf("Medewerker %s woont in %s en is %d jaar oud.\n",mw2.getNaam(),mw2.getWoonplaats(),mw2.getLeeftijd(mw2.getGeboortejaar()));
        System.out.printf("Medewerker %s woont in %s en is %d jaar oud.\n",mw3.getNaam(),mw3.getWoonplaats(),mw3.getLeeftijd(mw3.getGeboortejaar()));
    }
}