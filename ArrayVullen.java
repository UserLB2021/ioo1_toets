package ioo1_toets;

public class ArrayVullen {
    public int[] maakArray(){
        int[] array = {5,12,33,-9,14};
        return array;
    }
    public int[] veranderArray(int[] array){
        array[1] = 6;
        array[3] = array[3] + 2; //elementen tellen met begin bij 1 - vraag wat onduidelijk
        return array;
    }
}
