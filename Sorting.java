import java.util.Arrays;

public class Sorting {
    Double[] arr;

    public Sorting (Double[] arr) {
        this.arr = arr;
    }
    public static String Select_sort_asc(Double[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            Double temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        Double[] arr_top = new Double[10]; //returns the smallest 10 elements
        for (int i =0;i<10;i++){
            arr_top[i]=arr[i];
        }
        return Arrays.toString(arr_top);
    }
}
