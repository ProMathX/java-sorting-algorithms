package SortingAlgo;

import java.util.*;
import java.util.stream.Collectors;


public class BogoSort<T> {

    private List<T> data;
    private Comparator<T> comparatorSort;

    /**
     *
     * @param data
     * @param comparator
     */

    public BogoSort(List<T> data, Comparator<T> comparator){
        if(data == null || comparator == null)
            throw new IllegalArgumentException();

        this.data = data;
        this.comparatorSort = comparator;
    }

    void sort(){
        while (!isSorted())
            Collections.shuffle(data);
    }

    public static List<Integer> sortIntArray(int[] arr) {
        // Convert primitive int[] to List<Integer>
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // Create an instance of BogoSort for Integers
        BogoSort<Integer> bogo = new BogoSort<>(list, Comparator.naturalOrder());
        bogo.sort();

        return list;
    }

    boolean isSorted(){
        for (int i = 0; i < data.size() - 1 ; i++) {
            if(comparatorSort.compare(data.get(i), data.get(i+1)) > 0)
                return false;
        }
        return true;
    }



}
