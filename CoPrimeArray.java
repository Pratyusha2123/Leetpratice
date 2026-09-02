public class CoPrimeArray {
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int countCoPrime(int[] arr) {
        int insertions = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (gcd(arr[i], arr[i + 1]) > 1) {
                insertions++;
            }
        }

        return insertions;
    }
    public static void main(String[] args) {

        int[] arr1 = {2, 7, 28};
        System.out.println("Output for arr1: " + countCoPrime(arr1)); 

        int[] arr2 = {5, 10, 20};
        System.out.println("Output for arr2: " + countCoPrime(arr2)); 
    }
}
