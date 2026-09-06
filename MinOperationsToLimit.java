public class MinOperationsToLimit {
    public static int minOps(int[] arr, int k) {
        int count = 0;
        for (int num : arr) {
            if (num > k) {
                count += (num - 1) / k;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 2, 6, 8};
        int k1 = 5;
        System.out.println("Minimum operations (arr1): " + minOps(arr1, k1)); 
        int[] arr2 = {2, 6, 4, 8, 1, 6};
        int k2 = 4;
        System.out.println("Minimum operations (arr2): " + minOps(arr2, k2)); 
    }
}
