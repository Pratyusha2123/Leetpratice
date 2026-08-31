import java.util.HashMap;
import java.util.Map;

public class DistinctAdjacentElements {

    public boolean distinctAdjacent(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        for (int num : arr) {
            int count = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, count);
            if (count > maxFreq) {
                maxFreq = count;
            }
        }
        return maxFreq <= (n + 1) / 2;
    }

    public static void main(String[] args) {
        DistinctAdjacentElements solver = new DistinctAdjacentElements();

        int[] arr1 = {1, 1, 2};
        System.out.println("Output 1: " + solver.distinctAdjacent(arr1)); 

        int[] arr2 = {7, 7, 7, 7};
        System.out.println("Output 2: " + solver.distinctAdjacent(arr2)); 
    }
}
