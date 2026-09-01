import java.util.ArrayList;

public class AbsoluteDigitDiff {
    public static int[] getDigitDiff1AndLessK(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num < k && num >= 10 && isValid(num)) {
                list.add(num);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    private static boolean isValid(int num) {
        while (num >= 10) {
            int d1 = num % 10;
            int d2 = (num / 10) % 10;

            if (Math.abs(d1 - d2) != 1) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {7, 98, 56, 43, 45, 23, 12, 8};
        int k = 54;

        int[] result = getDigitDiff1AndLessK(arr, k);
        for (int num : result) {
            System.out.print(num + " "); 
        }
    }
}
