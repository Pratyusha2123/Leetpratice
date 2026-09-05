import java.util.Arrays;

public class SegregateZerosAndOnes {
    public static void segregate0and1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate0and1(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1)); 
        int[] arr2 = {1, 1};
        segregate0and1(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2)); 
    }
}
