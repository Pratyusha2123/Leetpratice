public class BitonicCheck {
    public static boolean isPerfect(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        while (i + 1 < n && arr[i] == arr[i + 1]) {
            i++;
        }
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == n - 1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 8, 8, 8, 3, 2};
        System.out.println("arr1 is perfect: " + isPerfect(arr1)); 
        int[] arr2 = {1, 1, 2, 2, 1};
        System.out.println("arr2 is perfect: " + isPerfect(arr2)); 
    }
}
