public class ReplaceZerosWithFive {

    public static int convertFive(int n) {
        String numStr = String.valueOf(n);
        numStr = numStr.replace('0', '5');
        return Integer.parseInt(numStr);
    }

    public static void main(String[] args) {
        int n = 1004;
        int result = convertFive(n);
        System.out.println(result);
    }
}