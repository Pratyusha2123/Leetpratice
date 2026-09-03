public class PrefixMaximums {

    public int countElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int count = 1;
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        PrefixMaximums solver = new PrefixMaximums();

        int[] arr1 = {10, 40, 23, 35, 50, 7};
        System.out.println("Result 1: " + solver.countElements(arr1)); 

        int[] arr2 = {5, 4, 1};
        System.out.println("Result 2: " + solver.countElements(arr2)); 
    }
}
