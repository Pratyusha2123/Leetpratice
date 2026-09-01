public class MinimumSumTwoElements {
    public static int minSum(int[] arr1, int[] arr2) {
        int n = arr1.length;

        int min1_1 = Integer.MAX_VALUE, min1_2 = Integer.MAX_VALUE;
        int idx1_1 = -1, idx1_2 = -1;

        int min2_1 = Integer.MAX_VALUE, min2_2 = Integer.MAX_VALUE;
        int idx2_1 = -1, idx2_2 = -1;

        for (int i = 0; i < n; i++) {
            if (arr1[i] < min1_1) {
                min1_2 = min1_1;
                idx1_2 = idx1_1;
                min1_1 = arr1[i];
                idx1_1 = i;
            } else if (arr1[i] < min1_2) {
                min1_2 = arr1[i];
                idx1_2 = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr2[i] < min2_1) {
                min2_2 = min2_1;
                idx2_2 = idx2_1;
                min2_1 = arr2[i];
                idx2_1 = i;
            } else if (arr2[i] < min2_2) {
                min2_2 = arr2[i];
                idx2_2 = i;
            }
        }

        if (idx1_1 != idx2_1) {
            return min1_1 + min2_1;
        }

        return Math.min(min1_1 + min2_2, min1_2 + min2_1);
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 4, 13, 1};
        int[] arr2 = {3, 2, 6, 1};

        System.out.println(minSum(arr1, arr2)); 
    }
}
