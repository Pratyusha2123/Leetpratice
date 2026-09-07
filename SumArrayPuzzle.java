import java.util.Arrays;

public class SumArrayPuzzle {
    public void sumArray(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = totalSum - arr[i];
        }
    }

    public static void main(String[] args) {
        SumArrayPuzzle puzzle = new SumArrayPuzzle();
        int[] arr1 = {3, 6, 4, 8, 9};
        puzzle.sumArray(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1));
        int[] arr2 = {0, 0, 1};
        puzzle.sumArray(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2));
    }
}
