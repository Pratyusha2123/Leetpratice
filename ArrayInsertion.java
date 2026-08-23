import java.util.Arrays;

public class ArrayInsertion {
    public static int[] insertAtIndex(int[] arr, int index, int val) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = val;
        for (int i = index; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;
        int val = 90;

        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] result = insertAtIndex(arr, index, val);
        System.out.println("After Insertion: " + Arrays.toString(result));
    }
}
