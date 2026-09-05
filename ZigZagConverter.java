import java.util.Arrays;

public class ZigZagConverter {

    // Array ko Zig-Zag fashion me convert karne ka method
    public static void zigZag(int[] arr) {
        boolean flag = true; // true matlb '<' relation, false matlb '>' relation

        for (int i = 0; i < arr.length - 1; i++) {
            if (flag) {
                // arr[i] < arr[i+1] hona chahiye
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                // arr[i] > arr[i+1] hona chahiye
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag; // Agle step ke liye relation flip karein
        }
    }

    public static void main(String[] args) {
        // Test Example 1
        int[] arr1 = {4, 3, 7, 8, 6, 2, 1};
        zigZag(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1)); 
        // Expected Pattern: 3 < 7 > 4 < 8 > 2 < 6 > 1

        // Test Example 2
        int[] arr2 = {4, 7, 3, 8, 2};
        zigZag(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2)); 
        // Expected Pattern: 4 < 7 > 3 < 8 > 2
    }
}
