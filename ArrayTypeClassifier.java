public class ArrayTypeClassifier {
    
    public static int findType(int[] arr) {
        int n = arr.length;
        int maxIdx = 0;
        int minIdx = 0;

        // Find the indices of the maximum and minimum elements
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
        }

        // 1. Ascending order
        if (minIdx == 0 && maxIdx == n - 1) {
            return 1;
        }

        // 2. Descending order
        if (maxIdx == 0 && minIdx == n - 1) {
            return 2;
        }

        // 3. Descending rotated
        if (arr[0] < arr[n - 1]) {
            return 3;
        }

        // 4. Ascending rotated
        return 4;
    }
}
