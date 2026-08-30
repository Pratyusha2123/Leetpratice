public class MaxKSubarrayProduct {

    public int findMaxProduct(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return 0;
        }

        long currentProduct = 1;
        for (int i = 0; i < k; i++) {
            currentProduct *= arr[i];
        }

        long maxProduct = currentProduct;

        for (int i = k; i < n; i++) {
            currentProduct = (currentProduct / arr[i - k]) * arr[i];
            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
            }
        }

        return (int) maxProduct;
    }

    public static void main(String[] args) {
        MaxKSubarrayProduct solver = new MaxKSubarrayProduct();

        int[] arr1 = {1, 2, 3, 4};
        int k1 = 2;
        System.out.println("Output 1: " + solver.findMaxProduct(arr1, k1)); 

        int[] arr2 = {1, 6, 7, 8};
        int k2 = 3;
        System.out.println("Output 2: " + solver.findMaxProduct(arr2, k2)); 
    }
}
