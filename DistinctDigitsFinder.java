import java.util.ArrayList;
import java.util.List;

public class DistinctDigitsFinder {
    public List<Integer> common_digits(int[] arr) {
        boolean[] present = new boolean[10];

        for (int num : arr) {
            while (num > 0) {
                present[num % 10] = true;
                num /= 10;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int digit = 0; digit <= 9; ++digit) {
            if (present[digit]) {
                result.add(digit);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        DistinctDigitsFinder finder = new DistinctDigitsFinder();
        int[] arr1 = {131, 11, 48};
        System.out.println("Input: [131, 11, 48]");
        System.out.println("Output: " + finder.common_digits(arr1));
        int[] arr2 = {111, 222, 333, 4444, 666};
        System.out.println("\nInput: [111, 222, 333, 4444, 666]");
        System.out.println("Output: " + finder.common_digits(arr2));
    }
}