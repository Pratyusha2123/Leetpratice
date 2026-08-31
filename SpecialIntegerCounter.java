import java.util.HashSet;
import java.util.Set;

public class SpecialIntegerCounter {

    public int specialIntegers(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int count = 0;
        for (int x : set) {
            if (set.contains(x - 1) && set.contains(x + 1)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        SpecialIntegerCounter solver = new SpecialIntegerCounter();

        int[] arr1 = {1, 2, 3, 3, 4};
        System.out.println("Output 1: " + solver.specialIntegers(arr1)); 

        int[] arr2 = {2, 3, 5, 7};
        System.out.println("Output 2: " + solver.specialIntegers(arr2)); 
    }
}
