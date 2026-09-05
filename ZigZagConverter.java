import java.util.Arrays;

public class ZigZagConverter {
    public static void zigZag(int[] arr) {
        boolean flag = true; 

        for (int i = 0; i < arr.length - 1; i++) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 3, 7, 8, 6, 2, 1};
        zigZag(arr1);
        System.out.println("Output 1: " + Arrays.toString(arr1)); 
        int[] arr2 = {4, 7, 3, 8, 2};
        zigZag(arr2);
        System.out.println("Output 2: " + Arrays.toString(arr2)); 
    }
}
