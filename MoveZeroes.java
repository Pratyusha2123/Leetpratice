import java.util.Arrays;

public class MoveZeroes {

    public void pushZerosToEnd(int[] arr) {
        int count = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes solver = new MoveZeroes();
        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
        solver.pushZerosToEnd(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1)); 
        int[] arr2 = {10, 20, 30};
        solver.pushZerosToEnd(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2)); 
        int[] arr3 = {0, 0};
        solver.pushZerosToEnd(arr3);
        System.out.println("Output 3: " + Arrays.toString(arr3)); 
    }
}
