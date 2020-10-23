package counterSort;

public class CounterSort {
    public int[] counterSort(int[] array){
        int len = array.length;
        int[] b = new int[len];
        int max_value = array[0];
        int min_value = array[0];

        for(int i : array){
            if(i > max_value)
                max_value = i;

            if(i < min_value)
                min_value = i;
        }

        int[] c = new int[max_value - min_value + 1];

        for(int i : array){
            ++c[i - min_value];
        }

        for(int i = 1; i < c.length; i++){
            c[i] = c[i] + c[i-1];
        }

        for(int i : array){
            b[--c[i-min_value]] = i;
        }

        return b;
    }
}
