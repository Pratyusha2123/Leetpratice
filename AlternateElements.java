import java.util.ArrayList;

public class AlternateElements {
    public static ArrayList<Integer> getAlternates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i += 2) {
            result.add(arr[i]);
        }
        return result;
    }
    public static void printAlternates(int[] arr) {
        ArrayList<Integer> ans = getAlternates(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
