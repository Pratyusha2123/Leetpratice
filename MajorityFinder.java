import java.util.Arrays;
import java.util.List;

public class MajorityFinder {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        int countX = 0;
        int countY = 0;
        
        for (int num : arr) {
            if (num == x) {
                countX++;
            } else if (num == y) {
                countY++;
            }
        }
        
        if (countX > countY) {
            return x;
        } else if (countY > countX) {
            return y;
        } else {
            return Math.min(x, y);
        }
    }

    public static void main(String[] args) {
        MajorityFinder obj = new MajorityFinder();
        List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5);
        System.out.println(obj.moreFrequent(arr, 4, 5));
    }
}