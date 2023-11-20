import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4, 10, 7, 8, 6, 9};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void CyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i + 1 == arr[i]) {
                i++;
            } else {
                int j = arr[i] - 1;
                swap(i, j, arr);
            }
        }
    }

    static void swap(int a, int b, int[] arr) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}