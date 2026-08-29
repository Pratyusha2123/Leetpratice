import java.util.ArrayList;
import java.util.Arrays;

public class ReverseSubarray {
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l, int r) {
        int left = l - 1;   
        int right = r - 1;

        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);

            left++;
            right--;
        }

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int l = 2, r = 4;

        ArrayList<Integer> result = reverseSubArray(arr, l, r);

        System.out.println("Input:  [1, 2, 3, 4, 5, 6, 7], l = 2, r = 4");
        System.out.println("Output: " + result);
    }
}
