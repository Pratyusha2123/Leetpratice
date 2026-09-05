import java.util.ArrayList;

public class SmallestElements {
    public static ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < first) {
                second = first;
                first = num;
            } else if (num > first && num < second) {
                second = num;
            }
        }
        if (second == Integer.MAX_VALUE) {
            result.add(-1);
        } else {
            result.add(first);
            result.add(second);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3, 5, 6};
        System.out.println("Output 1: " + minAnd2ndMin(arr1)); 
        int[] arr2 = {1, 1, 1};
        System.out.println("Output 2: " + minAnd2ndMin(arr2)); 
    }
}
