public class PalinArray {

    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 555};
        System.out.println(isPalinArray(arr)); 
    }

    public static boolean isPalinArray(int[] arr) {
        for (int num : arr) {
            if (!isPalindrome(num)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return original == reversed;
    }
}
