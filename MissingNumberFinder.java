public class MissingNumberFinder {
public static int missingNumber(int n, int[] arr) {
        long totalSum = (long) n * (n + 1) / 2;
        long currentSum = 0;
        for (int num : arr) {
            currentSum += num;
        }
        return (int)(totalSum - currentSum);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 4, 5}; 

        System.out.println("The missing number is: " + missingNumber(n, arr));
    }
}
