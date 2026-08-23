import java.util.Arrays;

public class ArrayReverser {

    public void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayReverser reverser = new ArrayReverser();

        int[] arr1 = {1, 4, 3, 2, 6, 5};
        reverser.reverseArray(arr1);
        System.out.println("Reversed arr1: " + Arrays.toString(arr1));

        int[] arr2 = {4, 5, 2};
        reverser.reverseArray(arr2);
        System.out.println("Reversed arr2: " + Arrays.toString(arr2));
    }
}
