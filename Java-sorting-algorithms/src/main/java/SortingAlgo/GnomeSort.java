package SortingAlgo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GnomeSort<T> {
    // save the data in the class
    private List<T> data;
    private Comparator<T> comparatorSort;

    /**
     * @param inputData the user input, can be any type of data, generic data type
     * @param comparator it compares i.g.
     */
    public GnomeSort(List<T> inputData, Comparator<T> comparator) {
        if(inputData == null || comparator == null){
            throw new IllegalArgumentException();
        }
        this.data = inputData;
        this.comparatorSort = comparator;
    }

    void sort(){


    }



}
