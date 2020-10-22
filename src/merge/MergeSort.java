package merge;

public class MergeSort {
    public void mergeSortDemo(int[] array){
        int len = array.length;
        int[] result = new int[len];

        for(int block = 1; block < len*2; block *= 2){
            for(int start = 0; start < len; start  += 2*block){
                int low = start;
                int mid = (start + block) < len ? (start+block) : len;
                int high = (start + block*2) < len ? (start + block*2) : len;

                int start1 = low, end1 = mid;
                int start2 = mid, end2 = high;

                while(start1 < end1 &&  start2 < end2){
                    result[low++] = array[start1] < array[start2] ? array[start1++] : array[start2++];
                }
                while(start1 < mid){
                    result[low++] = array[start1++];
                }
                while (start2 < high){
                    result[low++] = array[start2++];
                }
            }

            int[] tmp = array;
            array = result;
            result = tmp;
        }
    }
}
