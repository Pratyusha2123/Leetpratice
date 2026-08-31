public class ArrayMiddleSum {

    public int sumExceptFirstLast(int[] arr) {
        int sum = 0;
        // Start from index 1 and stop before the last element (arr.length - 1)
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayMiddleSum solver = new ArrayMiddleSum();

        // Test Case 1
        int[] arr1 = {5, 24, 39, 60, 15, 28, 27, 40, 50, 90};
        System.out.println("Output 1: " + solver.sumExceptFirstLast(arr1)); // Expected: 283

        // Test Case 2
        int[] arr2 = {5, 10, 1, 11};
        System.out.println("Output 2: " + solver.sumExceptFirstLast(arr2)); // Expected: 11

        // Test Case 3
        int[] arr3 = {5, 10};
        System.out.println("Output 3: " + solver.sumExceptFirstLast(arr3)); // Expected: 0
    }
}
