public class FightingTheDarkness {
    public static int maxDays(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 1};
        int result = maxDays(arr);

        System.out.println("Input:  [2, 3, 4, 2, 1]");
        System.out.println("Output: " + result);
    }
}
