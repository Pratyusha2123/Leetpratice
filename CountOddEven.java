
public class CountOddEven {

    public static int[] countOddEven(int[] arr) {
        int countOdd = 0;
        int countEven = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                countOdd++;
            } else {
                countEven++;
            }
        }

        return new int[]{countOdd, countEven};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = countOddEven(arr);
        System.out.println(result[0] + " " + result[1]);
    }
}
