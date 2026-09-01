import java.util.HashSet;
public class UniqueSumCalculator {
    public static int findSum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            if (set.add(num)) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(UniqueSumCalculator.findSum(arr)); 
    }
}
