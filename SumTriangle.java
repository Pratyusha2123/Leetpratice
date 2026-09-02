import java.util.ArrayList;

public class SumTriangle {
    public static ArrayList<Integer> getTriangle(int[] arr) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        ArrayList<Integer> currentLevel = new ArrayList<>();
        for (int num : arr) {
            currentLevel.add(num);
        }
        triangle.add(currentLevel);
        while (currentLevel.size() > 1) {
            ArrayList<Integer> nextLevel = new ArrayList<>();
            for (int i = 0; i < currentLevel.size() - 1; i++) {
                nextLevel.add(currentLevel.get(i) + currentLevel.get(i + 1));
            }
            triangle.add(nextLevel);
            currentLevel = nextLevel;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = triangle.size() - 1; i >= 0; i--) {
            result.addAll(triangle.get(i));
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 6, 7};
        ArrayList<Integer> output = getTriangle(arr);
        
        System.out.println("Output: " + output);
    }
}
