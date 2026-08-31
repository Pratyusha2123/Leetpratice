public class ShortestUnorderedSubarrayFinder {

    public int shortestUnorderedSubarray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if ((arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) || 
                (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])) {
                return 3;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ShortestUnorderedSubarrayFinder solver = new ShortestUnorderedSubarrayFinder();

        int[] arr1 = {7, 9, 10, 8, 11};
        System.out.println("Output 1: " + solver.shortestUnorderedSubarray(arr1)); 
        int[] arr2 = {1, 2, 3, 5};
        System.out.println("Output 2: " + solver.shortestUnorderedSubarray(arr2));
    }
}
