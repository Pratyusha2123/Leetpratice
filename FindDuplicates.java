import java.util.ArrayList;

public class FindDuplicates {

    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                duplicates.add(Math.abs(arr[i]));
            } else {
                arr[index] = -arr[index];
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        FindDuplicates solver = new FindDuplicates();

        int[] arr1 = {2, 3, 1, 2, 3};
        System.out.println("Output 1: " + solver.findDuplicates(arr1)); 

        int[] arr2 = {3, 1, 2};
        System.out.println("Output 2: " + solver.findDuplicates(arr2)); 
    }
}
