import java.util.Arrays;
import java.util.List;

public class CountSmallerElements {

    public static int countOfElements(int x, List<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            if (num <= x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 9;
        List<Integer> arr = Arrays.asList(10, 1, 2, 8, 4, 5);
        
        int result = countOfElements(x, arr);
        System.out.println(result);
    }
}
