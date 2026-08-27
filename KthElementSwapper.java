import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthElementSwapper {

    public void swapKth(List<Integer> arr, int k) {
        int n = arr.size();
        if (k > n) return;
        int startIdx = k - 1;
        int endIdx = n - k;
        int temp = arr.get(startIdx);
        arr.set(startIdx, arr.get(endIdx));
        arr.set(endIdx, temp);
    }

    public static void main(String[] args) {
        KthElementSwapper swapper = new KthElementSwapper();

        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        int k1 = 3;
        swapper.swapKth(arr1, k1);
        System.out.println("Output 1: " + arr1);

        List<Integer> arr2 = new ArrayList<>(Arrays.asList(5, 3, 6, 1, 2));
        int k2 = 2;
        swapper.swapKth(arr2, k2);
        System.out.println("Output 2: " + arr2);
    }
}
