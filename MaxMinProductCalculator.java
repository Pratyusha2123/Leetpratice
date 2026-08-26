public class MaxMinProductCalculator {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        int maxVal = arr1[0];
        for (int num : arr1) {
            if (num > maxVal) {
                maxVal = num;
            }
        }

        int minVal = arr2[0];
        for (int num : arr2) {
            if (num < minVal) {
                minVal = num;
            }
        }

        return (long) maxVal * minVal;
    }
}
