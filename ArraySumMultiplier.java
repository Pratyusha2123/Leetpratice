public class ArraySumMultiplier {

    public int multiply(int[] arr) {
        int n = arr.length;
        int mid = n / 2;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < mid; i++) {
            leftSum += arr[i];
        }
        for (int i = mid; i < n; i++) {
            rightSum += arr[i];
        }
        return leftSum * rightSum;
    }

    public static void main(String[] args) {
        ArraySumMultiplier multiplier = new ArraySumMultiplier();

        int[] arr1 = {1, 2, 3, 4};
        System.out.println("Output 1: " + multiplier.multiply(arr1));

        int[] arr2 = {1, 2};
        System.out.println("Output 2: " + multiplier.multiply(arr2));
    }
}
