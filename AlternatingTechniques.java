public class AlternatingTechniques {
    public static int minTime(int[] a, int[] b) {
        long sum1 = 0; 
        long sum2 = 0; 

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                sum1 += a[i];
                sum2 += b[i];
            } else {
                sum1 += b[i];
                sum2 += a[i];
            }
        }

        return (int) Math.min(sum1, sum2);
    }
    public static void main(String[] args) {

        int[] a1 = {2, 1, 2};
        int[] b1 = {3, 2, 1};
        System.out.println("Output for Example 1: " + minTime(a1, b1)); 
        int[] a2 = {1, 3, 1, 2};
        int[] b2 = {2, 2, 3, 1};
        System.out.println("Output for Example 2: " + minTime(a2, b2)); 
    }
}
