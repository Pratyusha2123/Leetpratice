public class ArrayMiddleSum {

    public int sumExceptFirstLast(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayMiddleSum solver = new ArrayMiddleSum();

        int[] arr1 = {5, 24, 39, 60, 15, 28, 27, 40, 50, 90};
        System.out.println("Output 1: " + solver.sumExceptFirstLast(arr1)); 

        int[] arr2 = {5, 10, 1, 11};
        System.out.println("Output 2: " + solver.sumExceptFirstLast(arr2));

        int[] arr3 = {5, 10};
        System.out.println("Output 3: " + solver.sumExceptFirstLast(arr3)); 
    }
}
