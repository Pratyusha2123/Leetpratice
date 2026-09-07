public class ElementFinder {
    public int findElement(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return -1;
        }

        int[] minRight = new int[n];
        minRight[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(minRight[i + 1], arr[i]);
        }

        int maxLeft = arr[0];
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= maxLeft && arr[i] <= minRight[i + 1]) {
                return arr[i];
            }
            maxLeft = Math.max(maxLeft, arr[i]);
        }

        return -1;
    }

    public static void main(String[] args) {
        ElementFinder finder = new ElementFinder();
        int[] arr1 = {4, 2, 5, 7};
        System.out.println("Output 1: " + finder.findElement(arr1));
        int[] arr2 = {11, 9, 12};
        System.out.println("Output 2: " + finder.findElement(arr2));
    }
}
