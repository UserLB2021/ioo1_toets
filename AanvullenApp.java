package ioo1_toets;

public class AanvullenApp {
    public static void main(String[] args) {
        ArrayVullen arrayVullen = new ArrayVullen();
        int[] nieuweArray = arrayVullen.maakArray();
        int[] veranderdeNieuweArray = arrayVullen.veranderArray(nieuweArray);
        int optelSom = 0;
        for (int i = 0; i < veranderdeNieuweArray.length; i++) {
            optelSom = optelSom + veranderdeNieuweArray[i];
        }
        System.out.println(optelSom);
    }
}
