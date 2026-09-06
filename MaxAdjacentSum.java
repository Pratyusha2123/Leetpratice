public class MaxAdjacentSum {
    public static int maxAdjSum(int[] arr) {
        int maxSum = arr[0] + arr[1];

        for (int i = 1; i < arr.length - 1; i++) {
            int currentSum = arr[i] + arr[i + 1];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Max adjacent sum (arr1): " + maxAdjSum(arr1)); 
        int[] arr2 = {2, 1, 3, 4};
        System.out.println("Max adjacent sum (arr2): " + maxAdjSum(arr2)); 
    }
}
