import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveNegative {

    public void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int i = 0, j = 0, k = 0;

        while (i < pos.size() && j < neg.size()) {
            arr.set(k++, pos.get(i++));
            arr.set(k++, neg.get(j++));
        }

        while (i < pos.size()) {
            arr.set(k++, pos.get(i++));
        }

        while (j < neg.size()) {
            arr.set(k++, neg.get(j++));
        }
    }

    public static void main(String[] args) {
        AlternatePositiveNegative solver = new AlternatePositiveNegative();
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(9, 4, -2, -1, 5, 0, -5, -3, 2));
        solver.rearrange(arr1);
        System.out.println("Output 1: " + arr1); 
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8));
        solver.rearrange(arr2);
        System.out.println("Output 2: " + arr2); 
    }
}
