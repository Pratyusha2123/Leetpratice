import java.util.Arrays;

public class SegregateEvenOdd {
    public static void segregateEvenOdd(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] even = new int[n];
        int[] odd = new int[n];
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even[evenCount++] = num;
            } else {
                odd[oddCount++] = num;
            }
        }

        for (int i = 0; i < evenCount; i++) {
            arr[i] = even[i];
        }

        for (int i = 0; i < oddCount; i++) {
            arr[evenCount + i] = odd[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        segregateEvenOdd(arr);

        System.out.println("Output: " + Arrays.toString(arr));
    }
}
