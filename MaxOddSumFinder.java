public class MaxOddSumFinder {

    public long maxOddSum(int[] arr) {
        long sum = 0;
        int minOdd = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > 0) {
                sum += num;
            }
            if (Math.abs(num) % 2 == 1) {
                minOdd = Math.min(minOdd, Math.abs(num));
            }
        }

        if (minOdd == Integer.MAX_VALUE) {
            return -1;
        }

        if (sum % 2 == 0) {
            sum -= minOdd;
        }

        return sum;
    }

    public static void main(String[] args) {
        MaxOddSumFinder solver = new MaxOddSumFinder();

        int[] arr1 = {4, -3, 3, -5};
        System.out.println("Output 1: " + solver.maxOddSum(arr1));

        int[] arr2 = {2, 5, -4, 3, -1};
        System.out.println("Output 2: " + solver.maxOddSum(arr2));
    }
}
