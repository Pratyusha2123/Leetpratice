import java.util.ArrayList;

public class AdjacentXorTransformer {

    public ArrayList<Integer> xorArray(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            result.add(arr[i] ^ arr[i + 1]);
        }
        result.add(arr[n - 1]);

        return result;
    }

    public static void main(String[] args) {
        AdjacentXorTransformer transformer = new AdjacentXorTransformer();

        int[] arr = {10, 11, 1, 2, 3};
        ArrayList<Integer> output = transformer.xorArray(arr);

        System.out.println("Output: " + output);
    }
}
