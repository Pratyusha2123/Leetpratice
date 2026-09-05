import java.util.Arrays;
import java.util.List;

public class App {
    public static int thirdLargest(List<Integer> arr) {
        if (arr.size() < 3) {
            return -1;
        }

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

        return third;
    }

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(2, 4, 1, 3, 5);
        System.out.println("Output 1: " + thirdLargest(arr1)); 

        List<Integer> arr2 = Arrays.asList(10, 2);
        System.out.println("Output 2: " + thirdLargest(arr2));

        List<Integer> arr3 = Arrays.asList(5, 5, 5);
        System.out.println("Output 3: " + thirdLargest(arr3)); 
    }
}