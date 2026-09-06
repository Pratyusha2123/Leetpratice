public class PalindromeArray {
    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        System.out.println("arr1 is palindrome: " + isPalindrome(arr1));
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("arr2 is palindrome: " + isPalindrome(arr2)); 
    }
}
