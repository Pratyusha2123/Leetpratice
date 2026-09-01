import java.util.ArrayList;

public class MatrixAndArrayOperations {
    public static ArrayList<Integer> array(int[][] a, int[] b, int n) {
        int diagonalSum = 0;
        int maxB = b[0];

        for (int i = 0; i < n; i++) {
            diagonalSum += a[i][i];
            if (b[i] > maxB) {
                maxB = b[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(diagonalSum);
        result.add(maxB);

        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] b = {3, 6, 9};
        int n = 3;

        ArrayList<Integer> ans = array(a, b, n);
        System.out.println(ans.get(0) + " " + ans.get(1)); // Output: 15 9
    }
}
