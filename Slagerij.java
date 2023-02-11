package ioo1_toets;

import java.util.Scanner;
public class Slagerij {
    private String[] vleesSoorten = new String[5];
    public static void main(String[] args) {
        Slagerij slagerij = new Slagerij();
        slagerij.maakVoorraad();
        System.out.print("Welk vleessoort zou u graag gehad willen hebben?");
        Scanner scanner = new Scanner(System.in);
        String keuze = scanner.next();
        Boolean opVoorraad = slagerij.heeftVleesOpVoorraad(keuze);
        if (opVoorraad){
            System.out.println("De vleessoort komt WEL voor in het assortiment.");
        }
        else {
            System.out.println("De vleessoort komt NIET voor in het assortiment.");
        }
    }
    public void maakVoorraad(){
        String[] vlees = {"Rund","Lam","Paard","Varken","Geit"};
        setVleesSoorten(vlees);
    }
    public boolean heeftVleesOpVoorraad(String vlees){
        boolean isOpVoorraad = false;
        String[] voorraad = getVleesSoorten();
        for (int i = 0; i < voorraad.length; i++) {
            if (voorraad[i].equals(vlees)) {
                isOpVoorraad = true;
            }
        }
        return isOpVoorraad;
    }
    public String[] getVleesSoorten() {
        return vleesSoorten;
    }
    public void setVleesSoorten(String[] vleesSoorten) {
        this.vleesSoorten = vleesSoorten;
    }
}

