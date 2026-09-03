import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        int maxFromRight = arr[n - 1];
        result.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {16, 17, 4, 3, 5, 2};
        System.out.println("Output 1: " + leaders(arr1)); 

        int[] arr2 = {10, 4, 2, 4, 1};
        System.out.println("Output 2: " + leaders(arr2)); 

        int[] arr3 = {5, 10, 20, 40};
        System.out.println("Output 3: " + leaders(arr3)); 
    }
}
