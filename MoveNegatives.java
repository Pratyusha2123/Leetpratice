import java.util.Arrays;

public class MoveNegatives {

    public void segregateElements(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        MoveNegatives solver = new MoveNegatives();
        int[] arr1 = {1, -1, 3, 2, -7, -5, 11, 6};
        solver.segregateElements(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1)); 
        int[] arr2 = {-5, 7, -3, -4, 9, 10, -1, 11};
        solver.segregateElements(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2)); 
    }
}
