public class ElementAtIndexFinder {

    public int findElementAtIndex(int i, int[] arr) {
        return arr[i];
    }

    public static void main(String[] args) {
        ElementAtIndexFinder obj = new ElementAtIndexFinder();

        int index1 = 2;
        int[] arr1 = {10, 20, 30, 40, 50};
        int result1 = obj.findElementAtIndex(index1, arr1);
        System.out.println("Output 1: " + result1); 

        int index2 = 4;
        int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
        int result2 = obj.findElementAtIndex(index2, arr2);
        System.out.println("Output 2: " + result2); 
    }
}
