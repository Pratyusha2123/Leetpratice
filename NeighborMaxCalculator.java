import java.util.ArrayList;

public class NeighborMaxCalculator {

    public ArrayList<Integer> maxAdj(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            result.add(Math.max(arr[i], arr[i + 1]));
        }

        return result;
    }

    public static void main(String[] args) {
        NeighborMaxCalculator calculator = new NeighborMaxCalculator();

        int[] arr1 = {1, 2, 2, 3, 4, 5};
        System.out.println("Output 1: " + calculator.maxAdj(arr1));
        int[] arr2 = {5, 5};
        System.out.println("Output 2: " + calculator.maxAdj(arr2));
    }
}
