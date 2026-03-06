import SortingAlgo.BogoSort;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    static void main(String[] args) {
        int[] arr = fillArray();
        System.out.println(Arrays.toString(arr));
        List<Integer> sortedRestult = BogoSort.sortIntArray(arr);
        System.out.println(sortedRestult);


    }

    private static int[] fillArray(){
        Random rnd = new Random();
        int[] rv = new int[rnd.nextInt(0,10)];

        for (int i = 0; i < rv.length; i++) {
            rv[i] = rnd.nextInt();
        }

        return rv;


    }



}
