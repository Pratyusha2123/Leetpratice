public class OddXorPairs {
    public static int countXorPair(int[] arr) {
        int countOdd = 0;
        int countEven = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                countOdd++;
            } else {
                countEven++;
            }
        }
        return countOdd * countEven;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        System.out.println("Output for arr1: " + countXorPair(arr1)); 

        int[] arr2 = {1, 2};
        System.out.println("Output for arr2: " + countXorPair(arr2)); 
    }
}
