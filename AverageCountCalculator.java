import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AverageCountCalculator {

    public int[] countArray(int[] arr, int x) {
        int n = arr.length;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int avg = (arr[i] + x) / 2;
            result[i] = freqMap.getOrDefault(avg, 0);
        }

        return result;
    }

    public static void main(String[] args) {
        AverageCountCalculator calculator = new AverageCountCalculator();

        int[] arr1 = {2, 4, 8, 6, 2};
        int x1 = 2;
        System.out.println("Output 1: " + Arrays.toString(calculator.countArray(arr1, x1)));

        int[] arr2 = {9, 5, 2, 4, 0, 3};
        int x2 = 3;
        System.out.println("Output 2: " + Arrays.toString(calculator.countArray(arr2, x2))); 
    }
}