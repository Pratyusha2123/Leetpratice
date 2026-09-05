import java.util.Arrays;

public class FloorCeilFinder {
public static int[] getFloorAndCeil(int x, int[] arr) {
        int floor = -1;
        int ceil = -1;

        for (int num : arr) {
            if (num <= x) {
                if (floor == -1 || num > floor) {
                    floor = num;
                }
            }
            if (num >= x) {
                if (ceil == -1 || num < ceil) {
                    ceil = num;
                }
            }
        }

        return new int[]{floor, ceil};
    }
    public static void main(String[] args) {
        int x1 = 7;
        int[] arr1 = {5, 6, 8, 9, 6, 5, 5, 6};
        int[] result1 = getFloorAndCeil(x1, arr1);
        System.out.println("Output 1: " + Arrays.toString(result1)); 

        int x2 = 10;
        int[] arr2 = {5, 6, 8, 8, 6, 5, 5, 6};
        int[] result2 = getFloorAndCeil(x2, arr2);
        System.out.println("Output 2: " + Arrays.toString(result2)); 
    }
}
