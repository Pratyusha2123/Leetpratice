import java.util.Arrays;
import java.util.List;

public class MaxTripletSumCalculator {
    public int maxTripletSum(List<Integer> arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        return first + second + third;
    }

    public static void main(String[] args) {
        MaxTripletSumCalculator calculator = new MaxTripletSumCalculator();

        // Example 1
        List<Integer> arr1 = Arrays.asList(4, 2, 7, 9);
        System.out.println("Output 1: " + calculator.maxTripletSum(arr1));

        // Example 2
        List<Integer> arr2 = Arrays.asList(1, 0, 8, 6, 4, 2);
        System.out.println("Output 2: " + calculator.maxTripletSum(arr2));

        // Example 3
        List<Integer> arr3 = Arrays.asList(2, 2, 1, 1);
        System.out.println("Output 3: " + calculator.maxTripletSum(arr3));
    }
}
