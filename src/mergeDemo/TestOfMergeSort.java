package mergeDemo;

import merge.MergeSort;

import java.util.Arrays;

public class TestOfMergeSort {
    public static void main(String[] args){
        int[] arr = {2,1,89,5,46,7};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSortDemo(arr);

        System.out.println(Arrays.toString(arr));
    }
}
