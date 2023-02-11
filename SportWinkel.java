package ioo1_toets;

public class SportWinkel {
    public static void main(String[] args) {
        SportSchoen sportSchoen = new SportSchoen(50.0,true, SportSchoen.TypeSport.tennis);
        SportShirt sportShirt = new SportShirt(20.0,false,true);
        sportSchoen.setPrijs(55.0);
        System.out.printf("%s %.1f %b\n",sportSchoen.getType(),sportSchoen.getPrijs(),sportSchoen.isOpVoorraad());
        System.out.printf("%b %.1f %b\n",sportShirt.isBedrukt(),sportShirt.getPrijs(),sportShirt.isOpVoorraad());
        // heb expres gekozen voor een mooie weergave met een komma in de prijs zoals op toetsblad staat bij de waarde
    }
}

