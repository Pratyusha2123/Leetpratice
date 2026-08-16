import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumPairs {

    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                result.add(pair);
                
                int leftVal = arr[left];
                int rightVal = arr[right];
                while (left < right && arr[left] == leftVal) {
                    left++;
                }
                while (left < right && arr[right] == rightVal) {
                    right--;
                }
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        
        ArrayList<ArrayList<Integer>> ans = getPairs(arr);
        System.out.println(ans); 
    }
}
