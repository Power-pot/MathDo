package counterSortDemo;

import counterSort.CounterSort;

import java.util.Arrays;

public class CounterSortTest {
    public static void main(String[] args){
        CounterSort counterSort = new CounterSort();
        int[] array = {22,22,3,1,5,1,3};
        System.out.println(Arrays.toString(counterSort.counterSort(array)));
    }
}
