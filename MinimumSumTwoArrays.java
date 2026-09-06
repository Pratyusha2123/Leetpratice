public class MinimumSumTwoArrays {
    public static int minSum(int[] arr1, int[] arr2) {
        int n = arr1.length;

        int min1_arr1 = Integer.MAX_VALUE, min2_arr1 = Integer.MAX_VALUE;
        int index1_arr1 = -1, index2_arr1 = -1;

        int min1_arr2 = Integer.MAX_VALUE, min2_arr2 = Integer.MAX_VALUE;
        int index1_arr2 = -1, index2_arr2 = -1;
        for (int i = 0; i < n; i++) {
            if (arr1[i] < min1_arr1) {
                min2_arr1 = min1_arr1;
                index2_arr1 = index1_arr1;
                min1_arr1 = arr1[i];
                index1_arr1 = i;
            } else if (arr1[i] < min2_arr1) {
                min2_arr1 = arr1[i];
                index2_arr1 = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr2[i] < min1_arr2) {
                min2_arr2 = min1_arr2;
                index2_arr2 = index1_arr2;
                min1_arr2 = arr2[i];
                index1_arr2 = i;
            } else if (arr2[i] < min2_arr2) {
                min2_arr2 = arr2[i];
                index2_arr2 = i;
            }
        }
        if (index1_arr1 != index1_arr2) {
            return min1_arr1 + min1_arr2;
        }
        return Math.min(min1_arr1 + min2_arr2, min2_arr1 + min1_arr2);
    }

    public static void main(String[] args) {
        int[] arr1_1 = {5, 4, 13, 2, 1};
        int[] arr2_1 = {2, 3, 4, 6, 5};
        System.out.println("Minimum sum (Test Case 1): " + minSum(arr1_1, arr2_1)); 
        int[] arr1_2 = {5, 4, 13, 1};
        int[] arr2_2 = {3, 2, 6, 1};
        System.out.println("Minimum sum (Test Case 2): " + minSum(arr1_2, arr2_2)); 
    }
}
