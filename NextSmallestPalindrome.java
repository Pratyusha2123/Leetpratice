import java.util.ArrayList;

class NextSmallestPalindrome {
    private static boolean areAll9s(int[] num) {
        for (int digit : num) {
            if (digit != 9) return false;
        }
        return true;
    }

    public static ArrayList<Integer> nextPalindrome(int[] num) {
        int n = num.length;
        ArrayList<Integer> result = new ArrayList<>();
        if (areAll9s(num)) {
            result.add(1);
            for (int i = 0; i < n - 1; i++) {
                result.add(0);
            }
            result.add(1);
            return result;
        }
        int[] temp = num.clone();
        int left = (n - 1) / 2;
        int right = n / 2;

        int i = left, j = right;
        while (i >= 0 && temp[i] == temp[j]) {
            i--;
            j++;
        }

        boolean leftIsSmaller = false;
        if (i < 0 || temp[i] < temp[j]) {
            leftIsSmaller = true;
        }
        while (i >= 0) {
            temp[j++] = temp[i--];
        }

        if (leftIsSmaller) {
            int carry = 1;
            if (n % 2 == 0) {
                int mid1 = n / 2 - 1;
                int mid2 = n / 2;
                i = mid1;
                j = mid2;
                while (i >= 0) {
                    int sum = temp[i] + carry;
                    temp[i] = sum % 10;
                    temp[j] = temp[i];
                    carry = sum / 10;
                    i--;
                    j++;
                }
            } else {
                int mid = n / 2;
                i = mid;
                int sum = temp[i] + carry;
                temp[i] = sum % 10;
                carry = sum / 10;
                j = mid + 1;
                i = mid - 1;
                while (i >= 0) {
                    sum = temp[i] + carry;
                    temp[i] = sum % 10;
                    temp[j] = temp[i];
                    carry = sum / 10;
                    i--;
                    j++;
                }
            }
        }

        for (int digit : temp) {
            result.add(digit);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2};
        System.out.println("Test 1 Output: " + nextPalindrome(arr1)); 
        int[] arr2 = {2, 3, 5, 4, 5};
        System.out.println("Test 2 Output: " + nextPalindrome(arr2)); 
    }
}
