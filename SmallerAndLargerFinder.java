import java.util.Arrays;

public class SmallerAndLargerFinder {

    public int[] getMoreAndLess(int[] arr, int target) {
        int lessOrEqual = 0;
        int greaterOrEqual = 0;

        for (int num : arr) {
            if (num <= target) {
                lessOrEqual++;
            }
            if (num >= target) {
                greaterOrEqual++;
            }
        }

        return new int[]{lessOrEqual, greaterOrEqual};
    }

    public static void main(String[] args) {
        SmallerAndLargerFinder obj = new SmallerAndLargerFinder();

        int[] arr1 = {1, 2, 8, 10, 11, 12, 19};
        int target1 = 0;
        int[] result1 = obj.getMoreAndLess(arr1, target1);
        System.out.println("Output 1: " + Arrays.toString(result1)); 

        int[] arr2 = {1, 5, 8, 12, 12, 12, 19};
        int target2 = 12;
        int[] result2 = obj.getMoreAndLess(arr2, target2);
        System.out.println("Output 2: " + Arrays.toString(result2)); 
    }
}
