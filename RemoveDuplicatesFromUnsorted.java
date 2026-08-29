import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromUnsorted {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 2};
        ArrayList<Integer> output = removeDuplicate(arr);

        System.out.println("Input:  [1, 2, 3, 1, 4, 2]");
        System.out.println("Output: " + output);
    }
}