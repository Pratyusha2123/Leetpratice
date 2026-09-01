import java.util.ArrayList;
import java.util.Arrays;

public class HalfSort {
    public static ArrayList<Integer> customSort(int[] arr) {
        int n = arr.length;
        int mid = n / 2;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            result.add(arr[i]);
        }

        for (int i = n - 1; i >= mid; i--) {
            result.add(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 2, 3, 8, 9, 7};
        ArrayList<Integer> sortedArr = customSort(arr);
        
        System.out.println(sortedArr); 
    }
}
