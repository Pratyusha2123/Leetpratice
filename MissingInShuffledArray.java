public class MissingInShuffledArray {
    public static int findMissing(int[] arr1, int[] arr2) {
        int ans = 0;
        for (int num : arr1) {
            ans ^= num;
        }
        for (int num : arr2) {
            ans ^= num;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1_1 = {4, 8, 1, 3, 7};
        int[] arr2_1 = {7, 4, 3, 1};
        System.out.println("Missing element (arr1): " + findMissing(arr1_1, arr2_1)); 
        int[] arr1_2 = {12, 10, 15, 23, 11, 30};
        int[] arr2_2 = {15, 12, 23, 11, 30};
        System.out.println("Missing element (arr2): " + findMissing(arr1_2, arr2_2)); 
    }
}
