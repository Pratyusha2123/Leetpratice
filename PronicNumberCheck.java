import java.util.ArrayList;
import java.util.Scanner;

public class PronicNumberCheck {
    public static ArrayList<Integer> pronicNumbers(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; ; i++) {
            long pronic = (long) i * (i + 1);
            if (pronic <= n) {
                result.add((int) pronic);
            } else {
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        ArrayList<Integer> ans = pronicNumbers(n);

        System.out.println(n + "Pronic Numbers: " + ans);

        sc.close();
    }
}
