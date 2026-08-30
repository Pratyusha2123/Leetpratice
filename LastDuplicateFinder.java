import java.util.Arrays;

public class LastDuplicateFinder {

    public int[] dupLastIndex(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == arr[i - 1]) {
                return new int[]{i, arr[i]};
            }
        }
       
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        LastDuplicateFinder finder = new LastDuplicateFinder();

        int[] arr1 = {1, 5, 5, 6, 6, 7};
        System.out.println("Output 1: " + Arrays.toString(finder.dupLastIndex(arr1)));

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Output 2: " + Arrays.toString(finder.dupLastIndex(arr2))); 
    }
}
