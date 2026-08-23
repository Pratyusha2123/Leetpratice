import java.util.ArrayList;

public class MissingAndRepeating {
    public ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;
        int repeating = -1;
        int missing = -1;
        for (int i = 0; i < n; i++) {
            int absVal = Math.abs(arr[i]);
            if (arr[absVal - 1] > 0) {
                arr[absVal - 1] = -arr[absVal - 1];
            } else {
                repeating = absVal;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }
    public static void main(String[] args) {
        MissingAndRepeating obj = new MissingAndRepeating();
        int[] arr = {4, 3, 6, 2, 1, 1};
        ArrayList<Integer> result = obj.findTwoElement(arr);
        System.out.println("Repeating: " + result.get(0));
        System.out.println("Missing: " + result.get(1));
    }
}
