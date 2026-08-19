import java.util.ArrayList;

public class ArrayMinMaxFinder {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);
        return result;
    }
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        ArrayMinMaxFinder obj = new ArrayMinMaxFinder();

        ArrayList<Integer> result = obj.getMinMax(arr);

        System.out.println(result);
    }
}
