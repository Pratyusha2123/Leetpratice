import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInserter {

    public void insertAtEnd(ArrayList<Integer> arr, int val) {
        arr.add(val);
    }

    public static void main(String[] args) {
        ArrayInserter inserter = new ArrayInserter();

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int val1 = 90;
        inserter.insertAtEnd(arr1, val1);
        System.out.println("Output 1: " + arr1);

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        int val2 = 50;
        inserter.insertAtEnd(arr2, val2);
        System.out.println("Output 2: " + arr2);
    }
}
