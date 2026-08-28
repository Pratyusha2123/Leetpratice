import java.util.Arrays;
import java.util.List;

public class BalancedArray {

    public int minValueToBalance(List<Integer> arr) {
        int leftSum = 0;
        int rightSum = 0;
        int n = arr.size();

        for (int i = 0; i < n / 2; i++) {
            leftSum += arr.get(i);
        }

        for (int i = n / 2; i < n; i++) {
            rightSum += arr.get(i);
        }

        return Math.abs(leftSum - rightSum);
    }

    public static void main(String[] args) {
        BalancedArray obj = new BalancedArray();
        List<Integer> arr = Arrays.asList(1, 5, 3, 2);
        System.out.println("Output: " + obj.minValueToBalance(arr));
    }
}