// File: EvenOccurrencesFinder.java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EvenOccurrencesFinder {

    public ArrayList<Integer> findEvenOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        for (int num : arr) {
            if (freqMap.get(num) % 2 == 0 && !visited.contains(num)) {
                result.add(num);
                visited.add(num);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
    public static void main(String[] args) {
        EvenOccurrencesFinder finder = new EvenOccurrencesFinder();
        
        int[] arr = {9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15};
        ArrayList<Integer> output = finder.findEvenOccurrences(arr);
        
        System.out.println("Output: " + output); 
    }
}