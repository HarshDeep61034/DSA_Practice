import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-10, -75, 0, 1, 15, 55, 25};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = getmaxindex(arr, last);
            swap(max, last, arr);
        }
    }

    static int getmaxindex(int [] arr, int last){
        int max = 0;
        for(int j = 0; j <= last; j++){
            if(arr[max] < arr[j]){
                max = j;
            }
        }
    return max;
    }

    static void swap(int max, int last, int [] arr){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
