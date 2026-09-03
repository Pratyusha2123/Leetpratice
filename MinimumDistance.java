public class MinimumDistance {

    public int minDist(int arr[], int x, int y) {
        int lastPos = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (lastPos != -1 && arr[i] != arr[lastPos]) {
                    minDistance = Math.min(minDistance, i - lastPos);
                }
                lastPos = i;
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }

    public static void main(String[] args) {
        MinimumDistance solver = new MinimumDistance();

        int[] arr1 = {1, 2, 3, 2};
        System.out.println("Output 1: " + solver.minDist(arr1, 1, 2)); 

        int[] arr2 = {86, 39, 90, 67, 84, 66, 62};
        System.out.println("Output 2: " + solver.minDist(arr2, 42, 12)); 

        int[] arr3 = {10, 20, 30, 40, 50};
        System.out.println("Output 3: " + solver.minDist(arr3, 10, 50)); 
    }
}
